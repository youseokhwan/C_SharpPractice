#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        std::string str;
        std::cin >> str;
        
        std::string::iterator iter = str.begin();
        std::cout << *iter;
        iter = str.end();
        std::cout << *(--iter) << "\n";
    }
    
    return 0;
}
