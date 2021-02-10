#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int N, count = 0;
    std::cin >> N;
    for(int i = 0; i < N; i++) {
        int num;
        std::cin >> num;
        
        if(num != i+1)
            count++;
    }
    
    std::cout << count;
    
    return 0;
}
