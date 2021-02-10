#include <iostream>
using namespace std;

int main() {
	int N, isCute = 0;
	cin >> N;
	
	for(int i = 0; i < N; i++) {
		int vote;
		cin >> vote;
		
		if(vote == 1)
			isCute++;
		else
			isCute--;
	}
	
	if(isCute > 0)
		cout << "Junhee is cute!";
	else
		cout << "Junhee is not cute!";

	return 0;
}
