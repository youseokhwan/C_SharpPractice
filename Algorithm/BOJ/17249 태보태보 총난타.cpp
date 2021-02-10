#include <iostream>
#include <string>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	std::string str;
	std::cin >> str;
	
	int left = 0, right = 0, mid;
	mid = str.find('0');
	
	for(int i = 0; i < mid; i++) {
		if(str.at(i) == '@')
			left++;
	}
	
	for(int i = mid; i < str.size(); i++) {
		if(str.at(i) == '@')
			right++;
	}
	
	std::cout << left << " " << right;
	
	return 0;
}