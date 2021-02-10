#include <iostream>
#include <string>
#include <stack>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	while(true) {
		std::string str;
		getline(std::cin, str);
		
		if(str.at(0) == '.') break;
		
		bool balance = true;
		std::stack<char> s;
		for(int i = 0; i < str.size(); i++) {
			if(str.at(i) == '(') {
				s.push('(');
			}
			else if(str.at(i) == ')') {
				if(s.empty()) {
					balance = false;
					break;
				}
				else if(s.top() == '(') {
					s.pop();
				}
				else {
					balance = false;
					break;
				}
			}
			else if(str.at(i) == '[') {
				s.push('[');
			}
			else if(str.at(i) == ']') {
				if(s.empty()) {
					balance = false;
					break;
				}
				else if(s.top() == '[') {
					s.pop();
				}
				else {
					balance = false;
					break;
				}
			}
		}
		
		if(!s.empty())
			balance = false;
		
		if(balance)
			std::cout << "yes\n";
		else
			std::cout << "no\n";
	}
	
	return 0;
}