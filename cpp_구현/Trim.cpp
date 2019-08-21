#include <iostream>
using namespace std;

int main() {
    string str;
    getline(cin, str);  // 공백 문자만 입력할 경우 오류 발생
    
    str = str.substr(str.find_first_not_of(" \t\n"));
    str = str.substr(0, str.find_last_not_of(" \t\n")+1);
    
    cout << str << '\n';
    
    return 0;
}
