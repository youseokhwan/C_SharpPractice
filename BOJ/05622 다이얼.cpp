#include <iostream>
using namespace std;

int main() {
    int time[26] = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7,
        8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
    
    string word;
    cin >> word;
    
    int sum = 0;
    for(int i = 0; i < word.size(); i++) {
        sum += time[(int)word.at(i) - 'A'];
    }
    
    cout << sum;
    
    return 0;
}
