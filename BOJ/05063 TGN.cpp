#include <iostream>

int main() {
	int N;
	scanf("%d", &N);
	
	for(int i = 0; i < N; i++) {
		int r, e, c;
		scanf("%d %d %d", &r, &e, &c);
		
		if(r < e-c)
			printf("advertise");
		else if(r > e-c)
			printf("do not advertise");
		else
			printf("does not matter");
		
		printf("\n");
	}
		
	return 0;
}