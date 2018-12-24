using System;

namespace C_SharpPractice {
    class ControlStatement {
        static void Main(string[] args) {
            // if-else
            int a = Int32.Parse(Console.ReadLine());

            if (a > 0)
                Console.WriteLine($"{a}는 양수");
            else if (a < 0)
                Console.WriteLine($"{a}는 음수");
            else
                Console.WriteLine($"{a}는 0");

            // switch문으로 자료형 유추
            object obj = null;
            string b = Console.ReadLine();

            if (int.TryParse(b, out int out_i))
                obj = out_i;
            else if (float.TryParse(b, out float out_f))
                obj = out_f;
            else
                obj = b;

            switch (obj) {
                case int i:
                    Console.WriteLine("int형입니다.");
                    break;
                case float f:
                    Console.WriteLine("float형입니다.");
                    break;
                default:
                    Console.WriteLine("문자열입니다.");
                    break;
            }

            // while
            int c = 0;
            while (true) {
                Console.Write($"{++c} ");
                if (c == 10) {
                    Console.WriteLine("while 루프 종료");
                    break;
                }
            }

            // for
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    Console.Write("*");
                }
                Console.WriteLine();
            }

            // foreach
            int[] arr = { 1, 2, 3 };
            foreach (var i in arr)
                Console.Write($"{i} ");
            Console.WriteLine();
        }
    }
}
