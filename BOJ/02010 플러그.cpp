#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N, count = 1;
    std::cin >> N;
    
    for(int i = 0; i < N; i++) {
        int num;
        std::cin >> num;
        
        count += (num-1);
    }
    
    std::cout << count;
    
    return 0;
}
