#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string str[5];
    for(int i = 0; i < 5; i++) {
        std::cin >> str[i];
    }
    
    std::string ret;
    for(int i = 0; i < 15; i++) {
        for(int j = 0; j < 5; j++) {
            if(i < str[j].size())
                if(str[j].at(i) != ' ' || str[j].at(i) != '\t' || str[j].at(i) != '\n')
                    ret += str[j].at(i);
        }
    }
    
    std::cout << ret;
    
    return 0;
    
}
