#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    vector<double> grade;
    vector<double>::iterator iter;
    for(int i = 0; i < N; i++) {
        int input;
        cin >> input;
        
        grade.push_back(input);
    }
    
    double max = -1;
    for(iter = grade.begin(); iter != grade.end(); iter++) {
        if(*iter > max)
            max = *iter;
    }
    
    double sum = 0.0;
    for(iter = grade.begin(); iter != grade.end(); iter++) {
        *iter = *iter/max * 100;
        sum += *iter;
    }
    
    cout << sum / N;
    
    return 0;
}
