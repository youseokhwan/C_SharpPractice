#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int S = 0, T = 0;
	for(int i = 0; i < 4; i++) {
		int temp;
		std::cin >> temp;
		
		S += temp;
	}
	
	for(int i = 0; i < 4; i++) {
		int temp;
		std::cin >> temp;
		
		T += temp;
	}
	
	if(S >= T)
		std::cout << S;
	else
		std::cout << T;
	
	return 0;
}