/*
 * 추상 클래스
 */

abstract class Monster {
  void attack();
}

class Goblin implements Monster {
  @override
  void attack() {
    print('고블린 어택');
  }
}

// 여러 개의 추상 클래스를 상속받을 수 있다.
abstract class Flyable {
  void fly();
}

class Bat implements Monster, Flyable {
  @override
  void attack() {}
  
  @override
  void fly() {}
}