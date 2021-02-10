#include <iostream>
#include <string>
#include <vector>

class Univ {
public:
	std::string name;
	int alc;
};

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int T;
	std::cin >> T;
	
	for(int i = 0; i < T; i++) {
		int N;
		std::cin >> N;

		int max = 0, maxIndex = 0;
		std::vector<Univ> v(N);
		for(int j = 0; j < N; j++) {
			std::cin >> v.at(j).name >> v.at(j).alc;
			if(v.at(j).alc > max) {
				max = v.at(j).alc;
				maxIndex = j;
			}
		}
		
		std::cout << v.at(maxIndex).name << "\n";
	}	
	
	return 0;
}