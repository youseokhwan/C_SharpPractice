#include <iostream>
using namespace std;

int main() {
    string S;
    cin >> S;
    
    int count[26] = {0, };
    for(int i = 0; i < S.size(); i++) {
        count[(int)S.at(i) - 97]++;
    }
    
    for(int i : count) {
        cout << i << ' ';
    }
    
    return 0;
}
