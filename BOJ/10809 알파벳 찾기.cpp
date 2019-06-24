#include <iostream>
using namespace std;

int main() {
	int first[26] = {-1, -1, -1, -1, -1,
					 -1, -1, -1, -1, -1,
					 -1, -1, -1, -1, -1,
					 -1, -1, -1, -1, -1,
					 -1, -1, -1, -1, -1, -1};
	string S;
	cin >> S;
	
	for(int i = 0; i < S.size(); i++) {
		if(first[(int)S.at(i) - 97] == -1)
			first[(int)S.at(i) - 97] = i;
	}
	
	for(int i : first)
		cout << i << ' ';

	return 0;
}
