#include <iostream>
using namespace std;

int main() {
    int num[3];
    for(int i = 0; i < 3; i++) {
        cin >> num[i];
    }
    
    if(num[0] > num[1]) {
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
    }
    
    if(num[1] > num[2]) {
        int temp = num[1];
        num[1] = num[2];
        num[2] = temp;
    }
    
    if(num[0] > num[1]) {
        int temp = num[0];
        num[0] = num[1];
        num[1] = temp;
    }
    
    for(int i = 0; i < 3; i++) {
        cout << num[i] << ' ';
    }
    
    return 0;
}
