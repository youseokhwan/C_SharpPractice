#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int L, A, B, C, D;
    std::cin >> L >> A >> B >> C >> D;
    
    if(A%C == 0)
        A = A/C;
    else
        A = A/C + 1;
    
    if(B%D == 0)
        B = B/D;
    else
        B = B/D + 1;
    
    if(A > B)
        std::cout << L-A;
    else
        std::cout << L-B;
    
    return 0;
}
