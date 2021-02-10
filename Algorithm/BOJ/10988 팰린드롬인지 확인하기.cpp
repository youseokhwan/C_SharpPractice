#include <iostream>
#include <string>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	std::string s;
	std::cin >> s;
	
	std::string::iterator iter;
	std::string::reverse_iterator rIter;
	for(iter = s.begin(), rIter = s.rbegin(); iter != s.end(); iter++, rIter++) {
		if(*iter != *rIter) {
			std::cout << "0";
			return 0;
		}
	}
	
	std::cout << "1";
	
	return 0;
}