#include <iostream>
#include <vector>
using namespace std;

int main() {
    int C;
    cin >> C;
    
    for(int i = 0; i < C; i++) {
        int N;
        cin >> N;
        
        vector<int> grade;
        vector<int>::iterator iter;
        for(int j = 0; j < N; j++) {
            int input;
            cin >> input;
            grade.push_back(input);
        }
        
        double sum = 0.0;
        for(iter = grade.begin(); iter != grade.end(); iter++) {
            sum += *iter;
        }
        
        int count = 0;
        for(iter = grade.begin(); iter != grade.end(); iter++) {
            if(*iter > sum/N)
                count++;
        }
        
        cout.setf(ios::fixed);
        cout.precision(3);
        cout << (double)count/N * 100 << "%\n";
    }
    
    return 0;
}
