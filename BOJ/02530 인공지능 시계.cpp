#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int A, B, C, D;
    std::cin >> A >> B >> C >> D;
    
    C += D;
    B += C/60; C %= 60;
    A += B/60; B %= 60;
    if(A > 23) A %= 24;
    
    std::cout << A << " " << B << " " << C;
    
    return 0;
}
