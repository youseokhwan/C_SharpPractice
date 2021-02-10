#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int N;
        std::cin >> N;
        
        int sum = 0;
        for(int j = 0; j < N; j++) {
            int temp;
            std::cin >> temp;
            
            sum += temp;
        }
        
        std::cout << sum << "\n";
    }
    
    return 0;
}
