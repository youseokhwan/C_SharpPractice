#include <iostream>
#include <vector>

using namespace std;

vector<double> movingAverage(const vector<double>& A, int M) {
	vector<double> ret;
	int N = A.size( );
	
	double partialSum = 0;
	for(int i = 0; i < M-1; i++) {
		partialSum += A.at(i);
	}

	for(int i = M-2; i < N-1; i++) {
		partialSum += A.at(i+1);
		ret.push_back(partialSum / M);
		partialSum -= A.at(i-(M-2));
	}

	return ret;
}

int main(void) {
	const vector<double> data { 35, 22, 10, 38, 21, 28, 37, 11, 29, 13, 77, 99, 22, 12, 53, 75, 44, 32 };
	int M = 5;  // 5 simple moving average

	vector<double> result = movingAverage(data, M);
	for(vector<double>::iterator iter = result.begin( ); iter != result.end( ); iter++) {
		cout << *iter << " ";
	}

	return 0;
}