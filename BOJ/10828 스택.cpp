#include <iostream>
#include <stack>

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    std::stack<int> s;
    for(int i = 0; i < N; i++) {
        std::string cmd;
        std::cin >> cmd;
        
        if(cmd.compare("push") == 0) {
            int num;
            std::cin >> num;
            
            s.push(num);
        }
        else if(cmd.compare("pop") == 0) {
            if(s.empty())
                std::cout << "-1\n";
            else {
                std::cout << s.top() << "\n";
                s.pop();
            }
        }
        else if(cmd.compare("size") == 0) {
            std::cout << s.size() << "\n";
        }
        else if(cmd.compare("empty") == 0) {
            if(s.empty())
                std::cout << "1\n";
            else
                std::cout << "0\n";
        }
        else if(cmd.compare("top") == 0) {
            if(s.empty())
                std::cout << "-1\n";
            else
                std::cout << s.top() << "\n";
        }
    }
    
    return 0;
}
