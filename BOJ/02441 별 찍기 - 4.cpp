#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int N;
    cin>>N;
    
    for(auto i = N; i > 0; i--) {
        for(auto j = N; j > i; j--) {
            cout<<" ";
        }
        for(auto j = 0; j < i; j++) {
            cout<<"*";
        }
        cout<<endl;
    }
    
    return 0;
}
