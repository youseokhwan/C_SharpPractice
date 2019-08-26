using System;

namespace C_SharpPractice {
    class Array {
        public static void Main(String[] args) {
            int[] score = new int[3];
            int sum = 0;

            score[0] = 70;
            score[1] = 85;
            score[2] = 30;

            foreach(var i in score) {
                Console.Write($"{i} ");
                sum += i;
            }
            Console.WriteLine();

            Console.WriteLine($"Sum: {sum}");

            // C#에서 배열은 System.Array에서 파생되기 때문에 각종 메소드를 편리하게 이용 가능
            Console.WriteLine($"GetType(): {score.GetType()}");
            Console.WriteLine($"GetType().BaseType: {score.GetType().BaseType}");
            Console.WriteLine($"Length: {score.Length}");
            Console.WriteLine($"Rank: {score.Rank}"); // 배열의 차수

            // 오름차순
            System.Array.Sort(score);
            foreach (var i in score) {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            // 내림차순
            System.Array.Reverse(score);
            foreach (var i in score) {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            // 데이터가 존재하는 인덱스 반환
            Console.WriteLine($"Array.IndexOf(score, 30): {System.Array.IndexOf(score, 30)}");

            // 인덱스 지정하여 배열 초기화(0, false, null)
            System.Array.Clear(score, 1, 2);
            foreach (var i in score) {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            // 2차원 배열
            int[,] arr = new int[2, 3] { { 1, 2, 3 }, { 4, 5, 6 } };

            foreach(var i in arr) {
                Console.Write($"{i} ");
            }
        }
    }
}
