#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int xPrice = 0, yPrice = 0;
    int A, B, C, D, P;
    std::cin >> A >> B >> C >> D >> P;
    
    xPrice = P*A;
    if(P <= C)
        yPrice = B;
    else {
        yPrice = B + (P-C)*D;
    }
    
    std::cout << (xPrice < yPrice ? xPrice : yPrice);
    
    return 0;
}
