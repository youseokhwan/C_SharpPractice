// 1권 155p 소풍 (ID: PICNIC / 난이도: 하)

#include <iostream>
using namespace std;

int n, m;  // n은 학생의 수, m은 친구 쌍의 수
bool areFriends[10][10];  // 친구 여부
bool taken[10];  // 짝을 찾았는 지 여부

int countPairings( ) {
	int first = -1;  // 아직 짝을 못찾은 사람 중 가장 빠른 인덱스
	for(int i = 0; i < n; i++) {
		if(taken[i] == false)
		{
			first = i;
			break;
		}
	}
	if(first == -1)  // 모든 사람이 짝을 찾았으면 1 리턴(기저 사례)
		return 1;

	int ret = 0;
	for(int i = first + 1; i < n; i++) {
		if(!taken[i] && areFriends[first][i]) {
			taken[first] = taken[i] = true;
			ret += countPairings( );
			taken[first] = taken[i] = false;
		}
	}

	return ret;
}

int main(void) {
	int C;  // 테스트 케이스
	cin >> C;

	for(int i = 0; i < C; i++) {
		for(int j = 0; j < n; j++) {
			for(int k = 0; k < n; k++) {
				areFriends[j][k] = false;
			}
			taken[j] = false;
		}

		cin >> n >> m;
		for(int j = 0; j < m; j++) {
			int k, l;
			cin >> k >> l;

			areFriends[k][l] = areFriends[l][k] = true;
		}

		cout << countPairings( ) << '\n';
	}

	return 0;
}