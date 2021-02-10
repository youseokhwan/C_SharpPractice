#include <iostream>
#include <vector>
using namespace std;

int main(int argc, char* argv[]) {
    int N, X;
    vector<int> A;
    
    cin >> N >> X;
    
    for(auto i = 0; i < N; i++) {
        int num;
        cin >> num;
        A.push_back(num);
    }
    
    for(auto i = 0; i < A.size(); i++) {
        if(A[i] < X) {
            cout << A[i] << " ";
        }
    }
    
    return 0;
}
