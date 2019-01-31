using System;
using System.Collections.Generic;

namespace C_SharpPractice {
    class GenericClass<T> where T : struct {
        // 타입 매개변수 T에 대해 where절로 조건을 부여할 수 있음
    }

    class Generic {
        static void PrintValue<T>(T arg) {
            Console.WriteLine($"{arg}");
        }

        static void Main(string[] args) {
            // Generic Method
            PrintValue(3);
            PrintValue(3.14);
            PrintValue("PI");

            // Generic Class
            GenericClass<Int32> gen1 = new GenericClass<Int32>();
            GenericClass<Double> gen2 = new GenericClass<Double>();

            // Dictionary<Key, Value>는 Hashtable의 제네릭 버전
            Dictionary<int, string> dic = new Dictionary<int, string>();
            dic[1] = "One";
            dic[2] = "Two";
            Console.WriteLine(dic[1]);
        }
    }
}
