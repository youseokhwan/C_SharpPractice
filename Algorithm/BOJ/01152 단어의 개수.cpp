#include <iostream>
using namespace std;

int main() {
    string str;
    getline(cin, str);
    
    if(str.compare(" ") == 0) {
        cout << '0';
        
        return 0;
    }
    
    str = str.substr(str.find_first_not_of(" \t\n"));
    str = str.substr(0, str.find_last_not_of(" \t\n")+1);
    
    int count = 0;
    for(int i = 0; i < str.size(); i++) {
        if(str.at(i) == ' ')
            count++;
    }
    
    cout << count+1;
    
    return 0;
}
