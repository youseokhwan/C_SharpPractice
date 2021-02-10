#include <iostream>
using namespace std;

int main() {
	string word;
	cin >> word;
	
	int count = 0;
	for(int i = 0; i < word.size(); i++) {
		if(word.at(i) == 'a' ||
		   word.at(i) == 'e' ||
		   word.at(i) == 'i' ||
		   word.at(i) == 'o' ||
		   word.at(i) == 'u')
			count++;
	}
	
	cout << count;
	
	return 0;
}
