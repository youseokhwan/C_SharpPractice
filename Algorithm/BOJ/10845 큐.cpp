#include <iostream>
#include <queue>

int main() {
    std::queue<int> q;
    int N;
    std::cin >> N;
    
    for(int i = 0; i < N; i++) {
        std::string cmd;
        std::cin >> cmd;
        
        if(cmd.compare("push") == 0) {
            int num;
            std::cin >> num;
            
            q.push(num);
        }
        else if(cmd.compare("pop") == 0) {
            if(q.empty())
                std::cout << "-1\n";
            else {
                std::cout << q.front() << "\n";
                q.pop();
            }
        }
        else if(cmd.compare("size") == 0) {
            std::cout << q.size() << "\n";
        }
        else if(cmd.compare("empty") == 0) {
            if(q.empty())
                std::cout << "1\n";
            else
                std::cout << "0\n";
        }
        else if(cmd.compare("front") == 0) {
            if(q.empty())
                std::cout << "-1\n";
            else
                std::cout << q.front() << "\n";
        }
        else if(cmd.compare("back") == 0) {
            if(q.empty())
                std::cout << "-1\n";
            else
                std::cout << q.back() << "\n";
        }
    }
    
    return 0;
}
