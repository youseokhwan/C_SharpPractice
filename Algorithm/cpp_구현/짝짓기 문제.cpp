// 1�� 155p ��ǳ (ID: PICNIC / ���̵�: ��)

#include <iostream>
using namespace std;

int n, m;  // n�� �л��� ��, m�� ģ�� ���� ��
bool areFriends[10][10];  // ģ�� ����
bool taken[10];  // ¦�� ã�Ҵ� �� ����

int countPairings( ) {
	int first = -1;  // ���� ¦�� ��ã�� ��� �� ���� ���� �ε���
	for(int i = 0; i < n; i++) {
		if(taken[i] == false)
		{
			first = i;
			break;
		}
	}
	if(first == -1)  // ��� ����� ¦�� ã������ 1 ����(���� ���)
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
	int C;  // �׽�Ʈ ���̽�
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