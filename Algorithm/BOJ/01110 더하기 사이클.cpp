#include <iostream>
using namespace std;

int main() {
    int N, count = 1;
    cin >> N;
    
    int cycle = (N%10 * 10) + (N/10 + N%10) % 10;
    while(N != cycle) {
        cycle = (cycle%10 * 10) + (cycle/10 + cycle%10) % 10;
        count++;
    }
    
    cout << count;
    
    return 0;
}
