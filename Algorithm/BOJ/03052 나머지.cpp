#include <iostream>
#include <vector>
#include <algorithm>

int main() {
	std::ios_base::sync_with_stdio(false);

	std::vector<int> v(10);
	for(int i = 0; i < 10; i++) {
		std::cin >> v.at(i);
		v.at(i) %= 42;
	}
	
	std::sort(v.begin(), v.end());
	v.erase(unique(v.begin(), v.end()), v.end());
	
	std::cout << v.size();
	
	return 0;
}