#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int A, B, C;
    std::cin >> A >> B >> C;
    
    B += C;
    A += B/60;
    B %= 60;
    if(A > 23)
        A -= 24;
    
    std::cout << A << " " << B;
    
    return 0;
}
