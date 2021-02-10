#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string A, B;
    std::cin >> A >> B;
    
    if(A.size() >= B.size())
        std::cout << "go";
    else
        std::cout << "no";
    
    return 0;
}
