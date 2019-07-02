#include <iostream>

int reverse(int A) {
    int ret = 0;
    
    while(A > 0) {
        ret *= 10;
        ret += A%10;
        A/=10;
    }
    
    return ret;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    for(int i = 0; i < N; i++) {
        int A, B;
        std::cin >> A >> B;
        
        std::cout << reverse(reverse(A) + reverse(B)) << "\n";
    }
    
    return 0;
}
