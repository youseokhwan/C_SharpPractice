#include <iostream>
#include <vector>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int max = 0, maxIndex;
	std::vector<int> v(9*9);
	
	for(int i = 0; i < 81; i++) {
		std::cin >> v.at(i);
		
		if(v.at(i) > max) {
			max = v.at(i);
			maxIndex = i;
		}
	}
	
	std::cout << max << "\n" << maxIndex/9 + 1 << " " << maxIndex%9 + 1;
	
	return 0;
}