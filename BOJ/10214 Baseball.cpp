#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int yScore = 0, kScore = 0;
        
        for(int j = 0; j < 9; j++) {
            int Y, K;
            std::cin >> Y >> K;
            
            yScore += Y;
            kScore += K;
        }
        
        if(yScore > kScore)
            std::cout << "Yonsei\n";
        else if(yScore < kScore)
            std::cout << "Korea\n";
        else
            std::cout << "Draw\n";
    }
    
    return 0;
}
