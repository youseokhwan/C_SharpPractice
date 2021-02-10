#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    if(N%2 == 0)
        std::cout << "SK";
    else
        std::cout << "CY";
    
    return 0;
}
