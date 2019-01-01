using System;

namespace C_SharpPractice {
    class Test : ICloneable {
        int A;
        string B;
        public static int C = 0;

        public Test() {
            this.A = 30;
            this.B = "C# Class";
        }

        public Test(string B) : this() {
            this.B = B;
        }

        public int GetA() {
            return this.A;
        }

        public string GetB() {
            return this.B;
        }
        
        // 깊은 복사(ICloneable 상속)
        public object Clone() {
            Test newCopy = new Test();
            newCopy.A = this.A;
            newCopy.B = this.B;
            return newCopy;
        }

        protected void PrintStatus() {
            Console.WriteLine("This is base class's method");
        }

        // 메소드 오버라이딩
        public virtual void MethodOverride() {
            Console.WriteLine("Base's method");
        }
    }

    class Derived : Test {
        // base 키워드를 이용하여 부모 클래스의 메소드 사용
        public Derived() {
            base.PrintStatus();
            this.PrintStatus();
        }

        // base class의 멤버 숨기기
        public new void PrintStatus() {
            Console.WriteLine("This is derived class's method");
        }

        // 메소드 오버라이딩
        public override void MethodOverride() {
            base.MethodOverride();
            Console.WriteLine("Derived's method");
        }
    }

    public class Class {
        static void Main(String[] args) {
            Test test = new Test();
            Console.WriteLine($"A:{test.GetA()}, B:{test.GetB()}");
            Console.WriteLine($"static C: {++Test.C}");

            Test copy = test.Clone() as Test;
            Console.WriteLine($"copy A:{copy.GetA()}, copy B:{copy.GetB()}");
            Console.WriteLine($"static C: {++Test.C}");

            Derived derived = new Derived();
            derived.MethodOverride();
        }
    }
}
