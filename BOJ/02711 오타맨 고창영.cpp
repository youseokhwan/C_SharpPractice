#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int n;
        std::string str;
        std::cin >> n >> str;
        
        std::cout << str.substr(0, n-1) << str.substr(n) << "\n";
    }
    
    return 0;
}
