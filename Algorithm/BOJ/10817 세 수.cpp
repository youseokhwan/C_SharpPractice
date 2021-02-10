#include <iostream>
using namespace std;

int main() {
    int input[3], temp;
    cin >> input[0] >> input[1] >> input[2];
    
    if(input[0] > input[1]) {
        temp = input[0];
        input[0] = input[1];
        input[1] = temp;
    }
    
    if(input[1] > input[2]) {
        temp = input[1];
        input[1] = input[2];
        input[2] = temp;
    }
    
    if(input[0] > input[1]) {
        temp = input[0];
        input[0] = input[1];
        input[1] = temp;
    }
    
    cout << input[1];
    
    return 0;
}
