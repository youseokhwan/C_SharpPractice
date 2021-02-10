#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    int count = N;
    for(int i = 0; i < N; i++) {
        string input;
        cin >> input;
        
        int flag = -1;
        bool alphabet[26] = {0, };
        
        for(int i = 0; i < input.size(); i++) {
            if(flag != (int)input.at(i) - 97 && alphabet[(int)input.at(i) - 97] == true) {
                count--;
                break;
            }
            
            flag = (int)input.at(i) - 97;
            alphabet[(int)input.at(i) - 97] = true;
        }
    }
    
    cout << count;
    
    return 0;
}
