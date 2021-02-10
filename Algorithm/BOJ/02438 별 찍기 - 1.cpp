#include <iostream>
using namespace std;

int main(int argc, char* argv[]) {
	int N;
	cin>>N;
	
	for(auto i = 0; i < N; i++) {
		for(auto j = 0; j <= i; j++) {
			cout<<'*';
		}
		cout<<endl;
	}
	
	return 0;
}