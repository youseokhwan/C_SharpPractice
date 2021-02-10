#include <iostream>
#include <string>

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cout.tie(); std::cin.tie();
    
    int A = 1, B = -1, C = -1;
    std::string shuffle;
    std::cin >> shuffle;
    
    for(int i = 0; i < shuffle.size(); i++) {
        if(shuffle.at(i) == 'A' && (A == 1 || B == 1)) {
            A *= -1;
            B *= -1;
        }
        else if(shuffle.at(i) == 'B' && (B == 1 || C == 1)) {
            B *= -1;
            C *= -1;
        }
        else if(shuffle.at(i) == 'C' && (A == 1 || C == 1)) {
            A *= -1;
            C *= -1;
        }
    }
    
    if(A == 1) std::cout << "1";
    else if(B == 1) std::cout << "2";
    else std::cout << "3";
    
    return 0;
}
