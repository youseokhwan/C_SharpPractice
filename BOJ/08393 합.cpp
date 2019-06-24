#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    int n;
    cin>>n;
    
    int sum = 0;
    if(n%2==0) {
        sum = (1+n)*(n/2);
    }
    else {
        sum = (2+n)*(n/2)+1;
    }
    
    cout<<sum<<endl;
    
    return 0;
}
