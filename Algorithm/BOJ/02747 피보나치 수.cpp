#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    scanf("%d", &n);
    
    vector<int> fib = {0, 1};
    if(n < 2) {
        printf("%d", fib.at(n));
        
        return 0;
    }
    
    for(int i = 2; i <= n; i++) {
        fib.push_back(fib.at(i-1) + fib.at(i-2));
    }
    
    printf("%d", fib.at(n));
    
    return 0;
}
