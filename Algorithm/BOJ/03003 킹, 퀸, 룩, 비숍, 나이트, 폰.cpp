#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	const int piece[6] = {1, 1, 2, 2, 2, 8};
	for(int i = 0; i < 6; i++) {
		int temp;
		std::cin >> temp;
		
		std::cout << piece[i] - temp << " ";
	}
	
	return 0;
}