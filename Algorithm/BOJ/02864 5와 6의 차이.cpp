#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    std::string A, B;
    std::cin >> A >> B;
    
    int min, max;
    
    std::string::iterator iter;
    for(iter = A.begin(); iter != A.end(); iter++)
        if(*iter == '6')
            *iter = '5';
    for(iter = B.begin(); iter != B.end(); iter++)
        if(*iter == '6')
            *iter = '5';
    
    min = atoi(A.c_str()) + atoi(B.c_str());
    
    for(iter = A.begin(); iter != A.end(); iter++)
        if(*iter == '5')
            *iter = '6';
    for(iter = B.begin(); iter != B.end(); iter++)
        if(*iter == '5')
            *iter = '6';
    
    max = atoi(A.c_str()) + atoi(B.c_str());
    
    std::cout << min << " " << max;
    
    return 0;
}
