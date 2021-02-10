#include <iostream>
#include <vector>

class People {
public:
	int weight;
	int height;
	int rank;
};

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int N;
	std::cin >> N;
	
	std::vector<People> v(N);
	for(int i = 0; i < N; i++) {
		int x, y;
		std::cin >> x >> y;
		
		v.at(i).weight = x;
		v.at(i).height = y;
		v.at(i).rank = 1;
	}
	
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < N; j++) {
			if(v.at(i).weight < v.at(j).weight && v.at(i).height < v.at(j).height)
				v.at(i).rank++;
		}
	}
	
	for(int i = 0; i < N; i++)
		std::cout << v.at(i).rank << " ";
	
	return 0;
}