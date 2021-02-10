#include <iostream>
using namespace std;

int main() {
    int burger[3];
    int beverage[2];
    
    cin >> burger[0] >> burger[1] >> burger[2];
    cin >> beverage[0] >> beverage[1];
    
    int min = 2001;
    for(int i = 0; i < 3; i++)
        if(burger[i] < min)
            min = burger[i];
    
    int setPrice = min - 50;
    if(beverage[0] < beverage[1])
        setPrice += beverage[0];
    else
        setPrice += beverage[1];
    
    cout << setPrice;
    
    return 0;
}
