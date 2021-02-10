#include <iostream>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int T;
    std::cin >> T;
    
    for(int i = 0; i < T; i++) {
        int a = 0, b = 0, c = 0, d = 0;
        int e = 0, f = 0, g = 0, h = 0;
        std::cin >> a >> b >> c >> d >> e >> f >> g >> h;
        a+=e; b+=f; c+=g; d+=h;
        
        if(a < 1)
            a = 1;
        
        if(b < 1)
            b = 1;
        
        if(c < 0)
            c = 0;
        
        int sum = 0;
        sum += a + b*5 + c*2 + d*2;
        
        std::cout << sum << "\n";
    }
    
    return 0;
    
}
