#include <iostream>

int main() {
    bool self[10001] = { 0, };
    
    for(int i = 1; i <= 10000; i++) {
        int num = i;
        int sum = i;
        
        while(num > 0) {
            sum += num%10;
            num /= 10;
        }
        if(sum <= 10000)
            self[sum] = true;
    }
    
    for(int i = 1; i <= 10000; i++)
        if(self[i] == false)
            printf("%d\n", i);
    
    return 0;
}
