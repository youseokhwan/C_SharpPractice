#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int candy, bro;
		std::cin >> candy >> bro;
		
		std::cout << "You get " << candy/bro << " piece(s) and your dad gets " <<
			candy%bro << " piece(s).\n";
	}
	
	return 0;
}