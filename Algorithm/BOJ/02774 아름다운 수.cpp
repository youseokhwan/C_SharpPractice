#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int X, count = 0;
        std::cin >> X;
        
        bool num[10] = {0, };
        while(X > 0) {
            num[X%10] = true;
            X/=10;
        }
        
        for(int j = 0; j < 10; j++)
            if(num[j]) count++;
        
        std::cout << count << "\n";
    }
    
    return 0;
}
