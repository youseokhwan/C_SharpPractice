#include <iostream>
#include <vector>

int main() {
	std::ios_base::sync_with_stdio(false);
	
	int N, M;
	std::cin >> N >> M;
	
	std::vector<int> v;
	for(int i = 0; i < N; i++) {
		int temp;
		std::cin >> temp;
		
		v.push_back(temp);
	}
	
	int max = 0;
	for(int i = 0; i < N; i++)
		for(int j = 0; j < N; j++) {
			if(j == i) continue;
			for(int k = 0; k < N; k++) {
				if(k == i || k == j) continue;
				
				int sum = v.at(i) + v.at(j) + v.at(k);
				if(sum <= M && sum > max)
					max = sum;
			}
		}
	
	std::cout << max;
	
	return 0;
}