#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int count = 0;
	char chess[8][8];
	for(int i = 0; i < 8; i++)
		for(int j = 0; j < 8; j++) {
			std::cin >> chess[i][j];
			
			if((i+j)%2 == 0 && chess[i][j] == 'F')
				count++;
		}
	
	std::cout << count;
	
	return 0;
}