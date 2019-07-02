#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int sum = 0;
    for(int i = 0; i < 5; i++) {
        int A;
        std::cin >> A;
        
        sum += A;
    }
    
    std::cout << sum;
}
