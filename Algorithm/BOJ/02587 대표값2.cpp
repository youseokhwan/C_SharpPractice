#include <iostream>
#include <vector>
#include <algorithm>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int sum = 0;
	std::vector<int> v(5);
	for(int i = 0; i < 5; i++) {
		std::cin >> v.at(i);
		sum += v.at(i);
	}
	
	std::sort(v.begin(), v.end());
	
	std::cout << sum/5 << "\n" << v.at(2);
	
	return 0;
}