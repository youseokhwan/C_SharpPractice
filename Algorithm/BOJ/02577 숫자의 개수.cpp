#include <iostream>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    
    int mul = A*B*C;
    int count[10] = { 0, };
    while(true) {
        if(mul == 0)
            break;
        
        count[mul%10]++;
        mul /= 10;
    }
    
    for(int i : count) {
        cout << i << '\n';
    }
    
    return 0;
}
