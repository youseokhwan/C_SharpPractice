#include <iostream>
#define OPER(A,B) ((A)*(A)-(B)*(B))

int main() {
    long long A, B;
    std::cin >> A >> B;
    
    std::cout << OPER(A, B);
    
    return 0;
}
