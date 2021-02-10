#include <iostream>
#include <algorithm>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int h[9] = {0, }, sum = 0;
    for(int i = 0; i < 9; i++) {
        std::cin >> h[i];
        sum += h[i];
    }
    
    int a, b;
    for(int i = 0; i < 8; i++)
        for(int j = i+1; j < 9; j++)
            if(sum-h[i]-h[j] == 100) {
                a = i; b = j;
            }
    
    h[a] = h[b] = 101;
    std::sort(h, h+9);
    
    for(int i = 0; i < 7; i++)
        std::cout << h[i] << "\n";
    
    return 0;
}
