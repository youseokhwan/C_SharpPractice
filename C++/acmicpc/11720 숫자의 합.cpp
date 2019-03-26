#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    string input;
    int sum = 0;
    
    cin>>n;
    cin>>input;
    
    for(auto i = 0; i < n; i++) {
        sum += (int)input.at(i) - '0';
    }
    
    cout<<sum<<endl;
    
    return 0;
}
