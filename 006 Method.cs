using System;

namespace C_SharpPractice {
    class Method {
        static void Main(string[] args) {
            // Method 사용
            string[] input = Console.ReadLine().Split();
            int a = Int32.Parse(input[0]);
            char op = Char.Parse(input[1]);
            int b = Int32.Parse(input[2]);

            if (op == '+')
                Calc.Add(a, b);
            else if (op == '-')
                Calc.Sub(a, b);
            else if (op == '*')
                Calc.Mul(a, b);
            else if (op == '/')
                Calc.Div(a, b, out int c, out int d);
            else
                Console.WriteLine("알 수 없는 명령어입니다.");

            // Call by Reference
            int x = 3, y = 4;
            Console.WriteLine($"x={x}, y={y}");
            Swap(ref x, ref y);
            Console.WriteLine($"x={x}, y={y}");

            // Overloading
            double z = 3.1, w = 4.2;
            Console.WriteLine($"z={z}, w={w}");
            Swap(a: ref z, b: ref w); // 명명된 매개 변수
            Console.WriteLine($"z={z}, w={w}");

            // params 키워드(가변길이 매개 변수)
            int sum = ParamsSum(2, 3, 1, 2, 3, 4, 2, 3, 4);
            Console.WriteLine($"ParamsSum = {sum}");
        }

        public static void Swap(ref int a, ref int b) {
            int temp = a;
            a = b;
            b = temp;
        }

        public static void Swap(ref double a, ref double b) {
            double temp = a;
            a = b;
            b = temp;
        }

        public static int ParamsSum(params int[] args) {
            int sum = 0;
            for(int i = 0; i < args.Length; i++) {
                sum += args[i];
            }

            return sum;
        }
    }

    class Calc {
        public static void Add(int a, int b) {
            Console.WriteLine($"{a} + {b} = {a + b}");
        }
        public static void Sub(int a, int b) {
            Console.WriteLine($"{a} - {b} = {a - b}");
        }
        public static void Mul(int a, int b) {
            Console.WriteLine($"{a} * {b} = {a * b}");
        }
        public static void Div(int a, int b, out int c, out int d) {
            if(b == 0) {
                Console.WriteLine("0으로 나눌 수 없습니다.");
                Environment.Exit(0);
            }
            c = a / b;
            d = a % b;
            Console.WriteLine($"{a} / {b} = {c}({d})");
        }
    }
}
