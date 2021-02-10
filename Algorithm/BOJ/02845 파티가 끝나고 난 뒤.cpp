#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int L, P;
    std::cin >> L >> P;
    L *= P;
    
    int num[5];
    for(int i = 0; i < 5; i++) {
        std::cin >> num[i];
        num[i] -= L;
    }
    
    for(int i = 0; i < 5; i++)
        std::cout << num[i] << " ";
    
    return 0;
}
