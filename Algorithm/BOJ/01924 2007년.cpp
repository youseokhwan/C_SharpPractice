#include <iostream>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int month[12] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	int x, y;
	std::cin >> x >> y;
	
	int sum = y;
	while(x > 0) {
		sum += month[x-1];
		x--;
	}
	
	switch(sum%7) {
		case 0:
			std::cout << "SUN";
			break;
		case 1:
			std::cout << "MON";
			break;
		case 2:
			std::cout << "TUE";
			break;
		case 3:
			std::cout << "WED";
			break;
		case 4:
			std::cout << "THU";
			break;
		case 5:
			std::cout << "FRI";
			break;
		case 6:
			std::cout << "SAT";
			break;
		default:
			break;
	}
		
	return 0;
}