using System.Collections;
using System.Collections.Generic;
using UnityEngine;

// 2-29 Player 클래스 구현하기
//public class Player {
//    private int hp = 100;
//    private int power = 50;

//    public void Attack() {
//        Debug.Log(this.power + "데미지를 입혔다");
//    }
//    public void Damage(int damage) {
//        this.hp -= damage;
//        Debug.Log(damage + "데미지를 입었다");
//    }
//}

public class Test : MonoBehaviour
{

    void Start() {
        // 2-2 Hello, World를 출력하는 스크립트
        //Debug.Log("Hello World");

        // 2-3 변수 사용하기
        //int age;
        //age = 30;
        //Debug.Log(age);

        // 2-4 변수에 변수 대입하기
        //float height1 = 160.5f;
        //float height2;
        //height2 = height1;
        //Debug.Log(height2);

        // 2-5 변수에 문자열 대입하기
        //string name;
        //name = "GDragon";
        //Debug.Log(name);

        // 2-6 변수에 덧셈 결과 대입하기
        //int answer;
        //answer = 1 + 2;
        //Debug.Log(answer);

        // 2-7 사칙연산하기
        //int answer;
        //answer = 3 - 4;
        //Debug.Log(answer);

        //answer = 5 * 6;
        //Debug.Log(answer);

        //answer = 8 / 4;
        //Debug.Log(answer);

        // 2-8 변수와 변수의 연산
        //int n1 = 8;
        //int n2 = 9;
        //int answer;
        //answer = n1 + n2;
        //Debug.Log(answer);

        // 2-9 변수 값 증가시키기
        //int answer = 10;
        //answer += 5;
        //Debug.Log(answer);

        // 2-10 값을 1만큼 증가시키기
        //int answer = 10;
        //answer++;
        //Debug.Log(answer);

        // 2-11 문자열과 문자열의 연결 ①
        //string str1 = "happy ";
        //string str2 = "birthday";
        //string message;

        //message = str1 + str2;
        //Debug.Log(message);

        // 2-12 문자열과 문자열의 연결 ②
        //string str1 = "happy ";
        //string str2 = "birthday";

        //str1 += str2;
        //Debug.Log(str1);

        // 2-13 문자열과 숫자 연결하기
        //string str = "happy ";
        //int num = 123;

        //string message = str + num;
        //Debug.Log(message);

        // 2-14 if 문 사용하기
        //int herbNum = 1;
        //if(herbNum == 1) {
        //    Debug.Log("체력을 50 회복");
        //}

        // 2-15 if~else 문 사용하기 ①
        //int hp = 200;
        //if(hp >= 100) {
        //    Debug.Log("공격!");
        //}
        //else {
        //    Debug.Log("방어!");
        //}

        // 2-16 if~else 문 사용하기 ②
        //int hp = 180;
        //if(hp <= 50) {
        //    Debug.Log("도망");
        //}
        //else if(hp >= 200) {
        //    Debug.Log("공격");
        //}
        //else {
        //    Debug.Log("방어!");
        //}

        // 2-17 변수 범위의 예
        //int x = 1;
        //if(x == 1) {
        //    int y = 2;
        //    Debug.Log(x);
        //    Debug.Loy(y);
        //}
        //Debug.Log(y);

        // 2-18 for 문 사용하기
        //for (int i = 0; i < 5; i++) {
        //    Debug.Log(i);
        //}

        // 2-19 짝수만 출력하기
        //for (int i = 0; i < 10; i += 2) {
        //    Debug.Log(i);
        //}

        // 2-20 특정 범위만 출력하기
        //for (int i = 3; i <= 5; i++) {
        //    Debug.Log(i);
        //}

        // 2-21 카운트다운하기
        //for (int i = 3; i >= 0; i--) {
        //    Debug.Log(i);
        //}

        // 2-22 합계 구하기
        //int sum = 0;
        //for (int i = 0; i <= 10; i++) {
        //    sum += i;
        //}
        //Debug.Log(sum);

        // 2-23 배열 사용하기
        //int[] array = new int[5];

        //array[0] = 2;
        //array[1] = 10;
        //array[2] = 5;
        //array[3] = 15;
        //array[4] = 3;

        //for (int i = 0; i < 5; i++) {
        //    Debug.Log(array[i]);
        //}

        // 2-24 조건을 만족시키는 요소만 출력하기
        //int[] points = { 83, 99, 52, 93, 15 };

        //for (int i = 0; i < points.Length; i++) {
        //    if(points[i] >= 90) {
        //        Debug.Log(points[i]);
        //    }
        //}

        // 2-25 평균값 구하기
        //int[] points = { 83, 99, 52, 93, 15 };

        //int sum = 0;
        //for (int i = 0; i < points.Length; i++) {
        //    sum += points[i];
        //}

        //int average = sum / points.Length;
        //Debug.Log(average);

        // 2-26 Console 뷰에 Hello를 출력하는 메서드
        //SayHello();

        // 2-27 인수를 출력하는 메서드
        //CallName("Tom");

        // 2-28 값을 두 개 받아 합계를 반환하는 메서드
        //int answer;
        //answer = Add(2, 3);
        //Debug.Log(answer);

        // 2-29 Player 클래스 구현하기
        //Player myPlayer = new Player();
        //myPlayer.Attack();
        //myPlayer.Damage(30);

        // 2-30 Vector2 클래스의 멤버 변수에 숫자 더하기
        //Vector2 playerPos = new Vector2(3.0f, 4.0f);
        //playerPos.x += 8.0f;
        //playerPos.y += 5.0f;
        //Debug.Log(playerPos);

        // 2-31 Vector 클래스끼리 뺄셈하기
        //Vector2 startPos = new Vector2(2.0f, 1.0f);
        //Vector2 endPos = new Vector2(8.0f, 5.0f);
        //Vector2 dir = endPos - startPos;
        //Debug.Log(dir);

        //float len = dir.magnitude;
        //Debug.Log(len);
    }

    // 2-26 Console 뷰에 Hello를 출력하는 메서드
    //void SayHello() {
    //    Debug.Log("Hello");
    //}

    // 2-27 인수를 출력하는 메서드
    //void CallName(string name) {
    //    Debug.Log("Hello " + name);
    //}

    // 2-28 값을 두 개 받아 합계를 반환하는 메서드
    //int Add(int a, int b) {
    //    int c = a + b;
    //    return c;
    //}

    void Update () {
		
	}

}
