#include <iostream>
#include <vector>

int main() {
	int N;
	std::cin >> N;
	
	std::vector<int> v;
	for(int i = 0; i < N; i++) {
		int temp;
		std::cin >> temp;
		
		v.push_back(temp);
	}
	
	int min = 1000001, max = -1000001;
	std::vector<int>::iterator iter;
	for(iter = v.begin(); iter != v.end(); iter++) {
		if(*iter > max)
			max = *iter;
		
		if(*iter < min)
			min = *iter;
	}
	
	std::cout << min << " " << max;
	
	return 0;
}