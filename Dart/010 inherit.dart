/*
 * 상속, 믹스인
 */

class Hero {
  String name = '영웅';
  void run() {}
}

class SuperHero extends Hero {
  @override
  void run() {
    super.run();
    this.fly();
  }

  void fly() {}
}

void main() {
  var hero = SuperHero();
  hero.run();
  hero.fly();
  print(hero.name);
}

// with 키워드를 사용하면 믹스인 기능을 사용할 수 있다.
// 믹스인: 상속하지 않고 다른 클래스의 기능을 가져오거나 오버라이드할 수 있음

class Goblin implements Monster {
  @override
  void attack() {
    print('고블린 어택');
  }
}

class DarkGoblin extends Goblin with Hero {
  
}