using System;
using System.Collections;

namespace C_SharpPractice {
    class Collection {
        static void Main(String[] args) {
            // ArrayList
            ArrayList list = new ArrayList();

            for(int i = 0; i < 5; i++) {
                list.Add(i);
            }

            foreach(var i in list) {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            list.RemoveAt(1);
            list.Insert(1, 25);

            foreach (var i in list) {
                Console.Write($"{i} ");
            }
            Console.WriteLine();

            // Queue
            Queue que = new Queue();
            que.Enqueue(1);
            que.Enqueue(2);

            Console.Write($"{que.Dequeue()} ");
            Console.Write($"{que.Dequeue()} ");
            Console.WriteLine();

            // Stack
            int[] arr = { 1, 2, 3 };
            Stack stk = new Stack(arr);

            while(stk.Count > 0) {
                Console.Write($"{stk.Pop()} ");
            }
            Console.WriteLine();

            // Hashtable
            Hashtable hash = new Hashtable();
            hash["하나"] = 1;
            hash["둘"] = 2;

            Console.WriteLine($"{hash["하나"]}");
        }
    }
}
