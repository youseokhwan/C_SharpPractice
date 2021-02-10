#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    while(true) {
        int A, B;
        std::cin >> A >> B;
        
        if(A == 0 && B == 0) break;
        if(A > B)
            std::cout << "Yes\n";
        else
            std::cout << "No\n";
    }
    
    return 0;
}
