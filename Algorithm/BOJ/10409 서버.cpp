#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int n, T;
    std::cin >> n >> T;
    
    int* time = new int[n];
    for(int i = 0; i < n; i++)
        std::cin >> time[i];
    
    int count = 0;
    for(int i = 0; i < n; i++, count++) {
        T -= time[i];
        if(T < 0) break;
    }
    
    std::cout << count;
    
    delete[] time;
    
    return 0;
}
