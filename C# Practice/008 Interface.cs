using System;
using System.IO;

namespace C_SharpPractice {
    interface IAnimal {
        void WriteVoice();
    }

    class Dog : IAnimal {
        public void WriteVoice() {
            Console.WriteLine("멍멍");
        }
    }
    
    class Cat : IAnimal {
        public void WriteVoice() {
            Console.WriteLine("야옹");
        }
    }

    class Interface {
        public static void Main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();

            dog.WriteVoice();
            cat.WriteVoice();
        }
    }
}
