#include <iostream>
using namespace std;

int main() {
    string input, output = "";
    cin >> input;
    
    output += input.at(0);
    
    for(int i = 1; i < input.size(); i++) {
        if(input.at(i) == '-')
            output += input.at(i+1);
    }
    
    cout << output;
    
    return 0;
}
