#include <iostream>
#include <utility>
#include <algorithm>
#include <vector>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N;
	std::cin >> N;
	
	std::vector<std::pair<int, int>> v;
	for(int i = 0; i < N; i++) {
		int x, y;
		std::cin >> x >> y;
		
		v.push_back(std::pair<int, int>(x, y));
	}
	
	std::sort(v.begin(), v.end());
	
	std::vector<std::pair<int, int>>::iterator iter;
	for(iter = v.begin(); iter != v.end(); iter++)
		std::cout << iter->first << " " << iter->second << "\n";
	
	return 0;
}