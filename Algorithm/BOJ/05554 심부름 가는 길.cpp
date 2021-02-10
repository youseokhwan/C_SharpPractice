#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int sec = 0;
	for(int i = 0; i < 4; i++) {
		int temp;
		std::cin >> temp;
		
		sec += temp;
	}
	
	std::cout << sec/60 << "\n" << sec%60;
	
	return 0;
}