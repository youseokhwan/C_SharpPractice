using System;
using System.Collections;

namespace C_SharpPractice {
    class Operator {
        static void Main(String[] args) {
            int a = 23;
            Console.WriteLine($"a+2={a + 2}, a-5={a - 5}");
            Console.WriteLine($"a*2={a * 2}, a/3={a / 3}, a%3={a % 3}");
            Console.WriteLine($"++a={++a}, a--={a--}");

            Console.WriteLine($"{123 + 456}");
            Console.WriteLine($"{"123" + "456"}");

            Console.WriteLine($"3 > 4 : {3 > 4}");
            Console.WriteLine($"3 <= 4 : {3 <= 4}");
            Console.WriteLine($"3 == 4 : {3 == 4}");
            Console.WriteLine($"3 != 4 : {3 != 4}");

            Console.WriteLine($"true && false : {true && false}");
            Console.WriteLine($"true || false : {true || false}");
            Console.WriteLine($"!true : {!true}");

            // 삼항 연산자에서 : 기호때문에 문자열 보간에 직접 사용할 수 없다.
            string result = (10 % 2 == 0) ? "짝수" : "홀수";
            Console.WriteLine($"10 % 2는? : {result}");

            // null 조건부 연산자(C# 6.0부터 적용)
            ArrayList list = null;
            list?.Add("야구");
            list?.Add("축구");
            Console.WriteLine($"list?.Count : {list?.Count}");
            Console.WriteLine($"list?[0] : {list?[0]}");
            Console.WriteLine($"list?[1] : {list?[1]}");

            list = new ArrayList();
            list?.Add("야구");
            list?.Add("축구");
            Console.WriteLine($"list?.Count : {list?.Count}");
            Console.WriteLine($"list?[0] : {list?[0]}");
            Console.WriteLine($"list?[1] : {list?[1]}");

            // null 병합 연산자
            int? num = null;
            Console.WriteLine($"num ?? 0 : {num ?? 0}");

            num = 99;
            Console.WriteLine($"num ?? 0 : {num ?? 0}");

            string str = null;
            Console.WriteLine($"str ?? \"Default\" : {str ?? "Default"}");

            str = "This is string.";
            Console.WriteLine($"str ?? \"Default\" : {str ?? "Default"}");
        }
    }
}
