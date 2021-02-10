#include <iostream>

int white = 0, blue = 0;
bool paper[128][128];

struct Point {
    int x, y;
};

void color(Point tl, int n) {
    // 파란색인지 하얀색인지 검사
    int sum = 0;
    for(int i = tl.x; i < tl.x + n; i++) {
        for(int j = tl.y; j < tl.y + n; j++) {
            sum += paper[i][j];
        }
    }
    
    // 맞으면 종료, 아니면 4등분해서 재귀호출
    if(sum == 0) white++;
    else if(sum == n*n) blue++;
    else if(n > 1) {
        color(tl, n/2); // 좌상
        color(Point{tl.x+n/2, tl.y}, n/2); // 우상
        color(Point{tl.x, tl.y+n/2}, n/2); // 좌하
        color(Point{tl.x+n/2, tl.y+n/2}, n/2); // 우하
    }
}

int main() {
    std::ios_base::sync_with_stdio(false);
    
    int N;
    std::cin >> N;
    
    for(int i = 0; i < N; i++)
        for(int j = 0; j < N; j++)
            std::cin >> paper[i][j];
    
    color(Point{0, 0}, N);
    
    std::cout << white << "\n" << blue;
    
    return 0;
}
