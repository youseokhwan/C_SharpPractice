#include <iostream>
using namespace std;

int main() {
    int scales[8];
    for(int i = 0; i < 8; i++)
        scanf("%d", &scales[i]);
    
    string output = "mixed";
    for(int i = 0; i < 8; i++) {
        if(scales[i] != i+1)
            break;
        
        if(i == 7)
            output = "ascending";
    }
    
    for(int i = 0; i < 8; i++) {
        if(scales[i] != 8-i)
            break;
        
        if(i == 7)
            output = "descending";
    }
    
    printf("%s", output.c_str());
    
    return 0;
}
