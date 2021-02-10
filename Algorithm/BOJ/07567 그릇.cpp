#include <iostream>
#include <string>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	std::string plate;
	std::cin >> plate;
	
	int height = plate.size()*10;
	for(int i = 1; i < plate.size(); i++) {
		if(plate.at(i) == '(' && plate.at(i-1) == '(')
			height -= 5;
		if(plate.at(i) == ')' && plate.at(i-1) == ')')
			height -= 5;
	}
	
	std::cout << height;
	
	return 0;
}