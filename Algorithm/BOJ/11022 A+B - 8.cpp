#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int T, A, B;
    cin>>T;
    
    for(auto i = 1; i <= T; i++) {
        cin>>A>>B;
        cout<<"Case #"<<i<<": "<<A<<" + "<<B<<" = "<<A+B<<endl;
    }
    
    return 0;
}
