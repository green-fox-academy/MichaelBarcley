using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Basics

{
    class HelloCSharp
    {
        public static void Exercise()
        {
            Console.WriteLine("Mike testing C#: Class 1- The basics");
            Console.WriteLine("Hello C#!");
            Console.WriteLine("The mentors said that \"C# is awesome\". \n");

            for (int i = 0; i < 4; i++)
            {
                Console.WriteLine(i);
            }

            Console.WriteLine();

            int b = 0;
            while (b < 5)
            {
                Console.WriteLine("Hello!\n");
                b++;
            }

            int rows = 5;
            for (int i = 1; i <= rows; i++)
            {
                for (int j = 1; j <= rows - i; j++)
                {
                    Console.Write(" ");
                }
                for (int k = 1; k <= (i * 2) - 1; k++)
                {
                    Console.Write("*");
                }
                Console.WriteLine("");
            }
        }
    }
}
