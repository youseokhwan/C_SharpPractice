using System;

namespace C_SharpPractice {
    class DataTypes {
        enum En_a { ONE, TWO, THREE };

        static void Main(string[] args) {
            // 정수 데이터 타입
            sbyte id_a = -10;
            byte id_b = 40;
            Console.WriteLine($"id_a={id_a}, id_b={id_b}");

            short id_c = -30000;
            ushort id_d = 60000;
            Console.WriteLine($"id_c={id_c}, id_d={id_d}");

            int id_e = -10_000_000;
            uint id_f = 300_000_000;
            Console.WriteLine($"id_e={id_e}, id_f={id_f}");

            long id_g = -5000_0000_0000;
            ulong id_h = 200_0000_0000_0000_0000;
            Console.WriteLine($"id_g={id_g}, id_h={id_h}");

            // 2진수, 10진수, 16진수 리터럴
            byte dl_a = 240;
            Console.WriteLine("dl_a={0}", dl_a);

            byte dl_b = 0b1111_0000;
            Console.WriteLine("dl_b={0}", dl_b);

            byte dl_c = 0XF0;
            Console.WriteLine("dl_c={0}", dl_c);

            uint dl_d = 0x1234_abcd;
            Console.WriteLine("dl_d={0}", dl_d);

            // 오버플로우
            int overflow = int.MaxValue;
            Console.WriteLine(overflow);

            overflow++;
            Console.WriteLine(overflow);

            // 부동 소수점 형식
            float fp_a = 3.1415_9265_3589_7932_3846_2643_3832_79f;
            Console.WriteLine(fp_a);

            double fp_b = 3.1415_9265_3589_7932_3846_2643_3832_79;
            Console.WriteLine(fp_b);

            decimal fp_c = 3.1415_9265_3589_7932_3846_2643_3832_79m;
            Console.WriteLine(fp_c);

            // 문자와 문자열
            char cs_a = '안';
            char cs_b = '녕';
            Console.WriteLine("{0}{1}", cs_a, cs_b);

            string cs_c = "안녕";
            Console.WriteLine(cs_c);

            // 논리 형식
            bool bl_a = true;
            bool bl_b = false;
            Console.WriteLine("{0}, {1}", bl_a, bl_b);

            // object와 박싱, 언박싱
            object ob_a = 123;
            int ob_b = (int)ob_a;
            Console.WriteLine("{0}, {1}", ob_a, ob_b);

            // 숫자와 문자열 간의 변환
            int ns_a = 12345;
            string ns_b = ns_a.ToString();
            Console.WriteLine(ns_b);

            int ns_c = int.Parse(ns_b);
            Console.WriteLine(ns_c);

            // 상수
            const int li_a = 100;
            Console.WriteLine(li_a);

            // 열거형
            En_a En_b = En_a.TWO;
            Console.WriteLine(En_b == En_a.ONE);
            Console.WriteLine(En_b == En_a.TWO);

            // Nullable
            int? nu_a = null;
            Console.WriteLine("{0}", nu_a.HasValue);

            nu_a = 15;
            Console.WriteLine("{0}", nu_a.HasValue);

            // var
            var va_a = 3;
            Console.WriteLine("Type: {0}, Value: {1}", va_a.GetType(), va_a);

            var va_b = 3.14;
            Console.WriteLine("Type: {0}, Value: {1}", va_b.GetType(), va_b);

            var va_c = "PI";
            Console.WriteLine("Type: {0}, Value: {1}", va_c.GetType(), va_c);

            // CTS(공용 형식 시스템)
            System.Int32 ct_a = 50;
            Console.WriteLine("Type: {0}, Value: {1}", ct_a.GetType(), ct_a);

            System.String ct_b = "CTS";
            Console.WriteLine("Type: {0}, Value: {1}", ct_b.GetType(), ct_b);
        }
    }
}
