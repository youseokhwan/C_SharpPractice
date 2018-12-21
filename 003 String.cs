using System;

namespace C_SharpPractice {
    class String {
        static void Main(string[] args) {
            string str = "This is string type.";
            Console.WriteLine(str + '\n');

            Console.WriteLine($"IndexOf \"string\" : {str.IndexOf("string")}");
            Console.WriteLine($"IndexOf \"int\" : {str.IndexOf("int")}");
            Console.WriteLine($"LastIndexOf 'i' : {str.LastIndexOf('i')}");

            Console.WriteLine($"StartsWith \"This\" : {str.StartsWith("This")}");
            Console.WriteLine($"EndsWith \"type.\" : {str.EndsWith("type.")}");

            Console.WriteLine($"Contains \"string\" : {str.Contains("string")}");
            Console.WriteLine($"Contains \"class\" : {str.Contains("class")}");

            Console.WriteLine($"Replace \"string\" -> \"not int\" : {str.Replace("string", "not int")}");

            Console.WriteLine($"ToLower : {str.ToLower()}");
            Console.WriteLine($"ToUpper : {str.ToUpper()}");

            Console.WriteLine($"Insert \"data \" : {str.Insert(15, "data ")}");
            Console.WriteLine($"Remove \"This is\" : {str.Remove(0, 8)}");
            Console.WriteLine($"Trim : {("   " + str + "   ").Trim()}");

            Console.WriteLine($"SubString(index, length): {str.Substring(8, 6)}");
            Console.WriteLine($"SubString(index): {str.Substring(8)}");

            string[] elements = str.Split(' ');
            foreach(var s in elements) {
                Console.WriteLine($"{s}");
            }

            int i = 12345;
            Console.WriteLine($"{{0:D7}}: {i:D7}");
            Console.WriteLine($"{{0:N}}: {i:N}");
            Console.WriteLine($"{{0:N7}}: {i:N7}");

            double d = 987.65;
            Console.WriteLine($"{{0:F7}}: {d:F7}");
            Console.WriteLine($"{{0:E}}: {d:E}");

            DateTime time = DateTime.Now;
            Console.WriteLine(time.ToString("yy-mm-dd(ddd) hh:ss"));
        }
    }
}
