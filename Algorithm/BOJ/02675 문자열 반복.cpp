#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    
    for(int i = 0; i < T; i++) {
        int R;
        string input;
        
        cin >> R >> input;
        
        for(int i = 0; i < input.size(); i++) {
            for(int j = 0; j < R; j++) {
                cout << input.at(i);
            }
        }
        
        cout << '\n';
    }
    
    return 0;
}
