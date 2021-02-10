#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	std::string str;
	std::cin >> str;
	
	for(int i = 0; i < str.size(); i++) {
		if(str.at(i) <= 'C')
			printf("%c", str.at(i)+23);
		else
			printf("%c", str.at(i)-3);
	}
	
	return 0;
}