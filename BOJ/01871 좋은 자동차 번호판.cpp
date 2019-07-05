#include <iostream>
#include <string>
#include <cmath>

int abs(int n) {
    if(n < 0) return n*-1;
    else return n;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    for(int i = 0; i < N; i++) {
        std::string car;
        std::cin >> car;
        
        int value1, value2;
        value1 = (car.at(0)-'A')*(int)pow(26, 2)
        + (car.at(1)-'A')*26 + (car.at(2)-'A')*1;
        value2 = atoi(car.substr(4).c_str());
        
        if(abs(value1-value2) <= 100)
            std::cout << "nice\n";
        else
            std::cout << "not nice\n";
    }
    
    return 0;
}
