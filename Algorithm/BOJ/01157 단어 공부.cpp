#include <iostream>
using namespace std;

int main() {
    string input;
    cin >> input;
    
    int count[26] = {0, };
    
    for(int i = 0; i < input.size(); i++) {
        input[i] = toupper(input[i]);
    }
    
    for(char c : input) {
        count[c - 65]++;
    }
    
    int maxIndex = 0;
    for(int i = 1; i < 26; i++) {
        if(count[i] > count[maxIndex])
            maxIndex = i;
    }
    
    for(int i = 0; i < 26; i++) {
        if(i != maxIndex && count[i] == count[maxIndex]) {
            cout << '?';
            return 0;
        }
    }
    
    cout << char(maxIndex + 65);
    
    return 0;
}
