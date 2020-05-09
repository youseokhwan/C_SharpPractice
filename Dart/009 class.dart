/*
 * 클래스
 */

class Person {
  String name;
  int age;

  // 생성자
  Person({this.name, this.age}); // Person()으로 호출하면 기본 생성자를 호출하는 것이 아닌 null 값을 대입

  void addOneYear() {
    age++;
  }
}

class Person2 {
  String name;
  int _age; // _를 붙이면 Private 변수

  int get _age => _age;
}

var person = new Person();
var person2 = Person(); // new 생략가능
print(person.name);

person.age = 10;
person.addOneYear();
print(person.age); // 11

