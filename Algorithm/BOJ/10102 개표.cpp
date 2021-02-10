#include <iostream>
#include <string>

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int V, A = 0, B = 0;
	std::string vote;
	
	std::cin >> V >> vote;
	
	for(int i = 0; i < V; i++) {
		if(vote.at(i) == 'A') A++;
		else B++;
	}
	
	if(A > B) std::cout << "A";
	else if(B > A) std::cout << "B";
	else std::cout << "Tie";
	
	return 0;
}