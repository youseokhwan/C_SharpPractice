#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int num[10] = {0, };
    
    std::string N;
    std::cin >> N;
    for(int i = 0; i < N.size(); i++)
        num[(int)N.at(i)-'0']++;
    
    num[9] += num[6];
    if(num[9]%2 != 0) num[9]++;
    num[6] = 0;
    
    int max = 0;
    for(int i = 0; i <= 8; i++)
        if(num[i] > max)
            max = num[i];
    
    if(max >= num[9]/2)
        std::cout << max;
    else
        std::cout << num[9]/2;
    
    return 0;
}
