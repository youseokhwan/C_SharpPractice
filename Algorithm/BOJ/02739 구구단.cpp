#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
	int N;
	cin >> N;
	
	for(auto i = 1; i <= 9; i++) {
		cout << N << " * " << i << " = " << N*i << endl;
	}
	
	return 0;
}