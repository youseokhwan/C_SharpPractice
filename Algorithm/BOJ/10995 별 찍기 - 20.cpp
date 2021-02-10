#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    for(int i = 1; i <= N; i++) {
        if(i%2 == 0)
            std::cout << " ";
        
        for(int j = 1; j <= N; j++) {
            std::cout <<"* ";
        }
        
        std::cout << "\n";
    }
    
    return 0;
}
