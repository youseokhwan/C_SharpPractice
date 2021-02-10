#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<long long> fib = {0, 1};
    if(n < 2) {
        cout << fib.at(n);
        
        return 0;
    }
    
    for(int i = 2; i <= n; i++) {
        fib.push_back(fib.at(i-1) + fib.at(i-2));
    }
    
    cout << fib.at(n);
    
    return 0;
}
