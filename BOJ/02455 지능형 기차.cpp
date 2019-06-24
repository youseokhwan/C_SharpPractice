#include <iostream>
using namespace std;

int main() {
    int station = 4;
    int people = 0;
    int maxPeople = -1;
    
    for(int i = 0; i < station; i++) {
        int getOff, getOn;
        cin >> getOff >> getOn;
        
        people -= getOff;
        people += getOn;
        
        if(people > maxPeople)
            maxPeople = people;
    }
    
    cout << maxPeople << '\n';
    
    return 0;
}
