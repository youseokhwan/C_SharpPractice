#include <iostream>
using namespace std;

int main() {
    while(true) {
        string str;
        getline(cin, str);
        
        if(str.compare("END") == 0)
            break;
        
        for(int i = str.size()-1; i >= 0; i--) {
            cout << str.at(i);
        }
        
        cout << '\n';
    }
    
    return 0;
}
