#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

class People {
public:
	int id;
	int age;
	std::string name;
	
	void print() {
		std::cout << this->age << " " << this->name << "\n";
	}
};

bool compare(People A, People B) {
	if(A.age == B.age) {
		if(A.id < B.id) return true;
		else return false;
	}
	else {
		if(A.age < B.age) return true;
		else return false;
	}
}

int main() {
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(); std::cout.tie();
	
	int N;
	std::cin >> N;
	
	std::vector<People> v(N);
	for(int i = 0; i < N; i++) {
		int age;
		std::string name;
		std::cin >> age >> name;
		
		v.at(i).id = i;
		v.at(i).age = age;
		v.at(i).name = name;
	}
	
	std::sort(v.begin(), v.end(), compare);
	
	for(int i = 0; i < N; i++)
		v.at(i).print();
	
	return 0;
}