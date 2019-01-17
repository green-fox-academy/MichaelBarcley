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
            Console.WriteLine();

            // Exercise 3
            var squareOfPositiveNumbers = n.Where(k => k > 0).Select(m => m * m);
            foreach (int num in squareOfPositiveNumbers)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine();

            // Exercise 4
            int[] y = new[] { 3, 9, 2, 8, 6, 5 };
            var squaredNumbersGreaterThanTwenty = y.Select(m => m * m).Where(k => k > 20);
            foreach (int num in squaredNumbersGreaterThanTwenty)
            {
                Console.WriteLine(num);
            }
            Console.WriteLine();

            // Exercise 8
            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };
            var citiesWithAI = cities.Where(c => c.StartsWith("A") && c.EndsWith("I"));
            foreach (string city in citiesWithAI)
            {
                Console.WriteLine(city);
            }
            Console.WriteLine();

            Console.Read();
        }
    }
}
