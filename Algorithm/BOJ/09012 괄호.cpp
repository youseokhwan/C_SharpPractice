#include <iostream>
#include <stack>

int main() {
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        std::string str;
        std::cin >> str;
        
        int vps = 0;
        for(int j = 0; j < str.size(); j++) {
            if(str.at(j) == '(')
                vps++;
            else {
                if(vps == 0) {
                    vps = -1;
                    break;
                }
                vps--;
            }
        }
        
        if(vps == 0)
            printf("YES\n");
        else
            printf("NO\n");
    }
    
    return 0;
}
