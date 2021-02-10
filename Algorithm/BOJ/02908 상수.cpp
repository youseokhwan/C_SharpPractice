#include <iostream>
using namespace std;

int main() {
    int A, B;
    cin >> A >> B;
    
    A = A%10 * 100 + A%100/10 * 10 + A/100;
    B = B%10 * 100 + B%100/10 * 10 + B/100;
    
    if(A > B)
        cout << A;
    else
        cout << B;
    
    return 0;
}
