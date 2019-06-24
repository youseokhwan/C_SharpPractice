#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    string input;
    cin>>input;
    
    for(auto i = 0; i < input.size(); i++) {
        if(i>0 && i%10==0)
            cout<<endl;
        
        cout<<input.at(i);
    }
    
    cout<<endl;
    
    return 0;
}
