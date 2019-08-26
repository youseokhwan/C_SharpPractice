using System;
using System.Collections.Generic;

namespace C_SharpPractice {
    class Animal {
        private int num;
        private string name;

        public int Num { get; set; }
        public string Name { get; set; }
    }

    class Property {
        static void Main(String[] args) {
            Animal cat = new Animal();
            cat.Num = 1;
            cat.Name = "Cat";
            Console.WriteLine($"num: {cat.Num}, name: {cat.Name}");

            Animal dog = new Animal() {
                Num = 2, Name = "Dog"
            };
            Console.WriteLine($"num: {dog.Num}, name: {dog.Name}");
        }
    }
}
