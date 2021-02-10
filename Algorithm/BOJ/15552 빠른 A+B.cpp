#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    ios::sync_with_stdio();
    cin.tie(NULL);
    
    int T;
    cin>>T;
    
    int x, y;
    for(auto i = 0; i < T; i++) {
        cin>>x>>y;
        cout<<x+y<<"\n";
    }
    
    return 0;
}
