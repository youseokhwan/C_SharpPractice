#include <iostream>
#define SIZE 2187

int minus = 0, zero = 0, plus = 0;
int paper[SIZE][SIZE];

struct Point {
    int x, y;
};

void check(Point tl, int n) {
    int count = 0;
    for(int i = tl.x; i < tl.x+n; i++) {
        for(int j = tl.y; j < tl.y+n; j++) {
            if(paper[i][j] == paper[tl.x][tl.y])
                count++;
        }
    }
    
    if(count == n*n)
        switch(paper[tl.x][tl.y]) {
            case -1: minus++; break;
            case 0: zero++; break;
            case 1: plus++; break;
        }
    else if(n >= 3) {
        check(tl, n/3);  // (0,0)
        check(Point{tl.x+n/3, tl.y}, n/3);  // (0,1)
        check(Point{tl.x+2*n/3, tl.y}, n/3);  // (0,2)
        check(Point{tl.x, tl.y+n/3}, n/3);  // (1,0)
        check(Point{tl.x+n/3, tl.y+n/3}, n/3);  // (1,1)
        check(Point{tl.x+2*n/3, tl.y+n/3}, n/3);  // (1,2)
        check(Point{tl.x, tl.y+2*n/3}, n/3);  // (2,0)
        check(Point{tl.x+n/3, tl.y+2*n/3}, n/3);  // (2,1)
        check(Point{tl.x+2*n/3, tl.y+2*n/3}, n/3);  // (2,2)
    }
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    for(int i = 0; i < N; i++)
        for(int j = 0; j < N; j++)
            std::cin >> paper[i][j];
    
    check(Point{0, 0}, N);
    
    std::cout << minus << "\n" << zero << "\n" << plus;
    
    return 0;
}
