#include <iostream>
#include <string>
#include <stack>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	int count = 0;
	for(int i = 0; i < N; i++) {
		std::string str;
		std::cin >> str;
		
		std::stack<char> s;
		std::string::iterator iter;
		for(iter = str.begin(); iter != str.end(); iter++) {
			if(s.empty())
				s.push(*iter);
			else if(s.top() != *iter)
				s.push(*iter);
			else
				s.pop();
		}
		
		if(s.empty())
			count++;
	}
	
	std::cout << count;
	
	return 0;
}