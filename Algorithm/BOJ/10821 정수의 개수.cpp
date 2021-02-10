#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string str;
    std::cin >> str;
    
    int count = 1;
    std::string::iterator iter;
    for(iter = str.begin(); iter != str.end(); iter++) {
        if(*iter == ',')
            count++;
    }
    
    std::cout << count;
    
    return 0;
}
