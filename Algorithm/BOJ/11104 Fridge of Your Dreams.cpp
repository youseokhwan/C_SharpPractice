#include <iostream>
#include <string>
#include <cmath>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int n;
	std::cin >> n;
	
	for(int i = 0; i < n; i++) {
		std::string str;
		std::cin >> str;
		
		int dec = 0;
		for(int j = 0; j < 24; j++)
			if(str.at(j) == '1')
				dec += pow(2, 23-j);
		
		std::cout << dec << "\n";
	}
	
	return 0;
}