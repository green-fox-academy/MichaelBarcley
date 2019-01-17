using System;
using System.Linq;

namespace LINQ
{
    class Program
    {
        static void Main(string[] args)
        {
            // Exercise 1
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            var evenNumbers = n.Where(s => s % 2 == 0);
            foreach (int num in evenNumbers)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine();

            // Exercise 2
            var averageOfOddNumbers = n.Where(s => s % 2 == 1 || s % 2 == -1).Average(a => a);

            Console.WriteLine(averageOfOddNumbers);
            Console.Read();
        }
    }
}
