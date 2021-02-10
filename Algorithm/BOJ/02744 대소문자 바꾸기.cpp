#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string str;
    std::cin >> str;
    
    std::string::iterator iter;
    for(iter = str.begin(); iter != str.end(); iter++) {
        if(*iter >= 'a' && *iter <= 'z')
            *iter = std::toupper(*iter);
        else
            *iter = std::tolower(*iter);
    }
    
    std::cout << str;
    
    return 0;
}
