#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int M, F;
    while(true) {
        std::cin >> M >> F;
        if(M == 0 && F == 0)
            break;
        
        std::cout << M+F << "\n";
    }
    
    return 0;
}
