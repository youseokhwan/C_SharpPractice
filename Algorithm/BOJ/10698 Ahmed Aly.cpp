#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int X, Y, Z;
		char O, temp;
		std::cin >> X >> O >> Y >> temp >> Z;
		
		std::cout << "Case " << i+1 << ": ";

		if(O == '+') {
			if(X+Y == Z)
				std::cout << "YES\n";
			else
				std::cout << "NO\n";
		}
		else {
			if(X-Y == Z)
				std::cout << "YES\n";
			else
				std::cout << "NO\n";
		}
	}
	
	return 0;
}