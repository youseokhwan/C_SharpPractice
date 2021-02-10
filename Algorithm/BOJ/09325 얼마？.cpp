#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int s, n;
        std::cin >> s >> n;
        
        for(int j = 0; j < n; j++) {
            int p, q;
            std::cin >> p >> q;
            
            s += p*q;
        }
        
        std::cout << s << "\n";
    }
    
    return 0;
}
