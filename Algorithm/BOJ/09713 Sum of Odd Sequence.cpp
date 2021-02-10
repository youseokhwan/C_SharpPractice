#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int N, sum = 0;
        std::cin >> N;
        
        for(int i = 1; i <= N; i+=2)
            sum += i;
        
        std::cout << sum << "\n";
    }
    
    return 0;
}
