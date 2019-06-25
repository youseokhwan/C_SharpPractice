#include <iostream>
using namespace std;

int main() {
    int T;
    scanf("%d", &T);
    
    for(int i = 0; i < T; i++) {
        string ox;
        cin >> ox;
        
        int sum = 0;
        int score = 1;
        for(int i = 0; i < ox.size(); i++) {
            if(ox.at(i) == 'O') {
                sum += score;
                score++;
            }
            else
                score = 1;
        }
        
        printf("%d\n", sum);
    }
    
    return 0;
}
