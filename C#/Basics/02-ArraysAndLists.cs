using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Basics
{
    class ArraysAndLists
    {
        public static void Exercise()
        {
            Console.WriteLine("Mike testing C#: Class 2- Arrays and Arraylists");

            int[] array = new int[3];
            array[0] = 10;
            array[1] = 20;
            array[2] = 30;
            Console.WriteLine(array[1]);
            Console.WriteLine();

            int[] secondArray = { 1, 3, 5, 6 };
            foreach (int number in secondArray)
            {
                Console.WriteLine(number);
            }
            Console.WriteLine();

            List<Object> myList = new List<Object>();
            myList.Add("This is my general object list");
            myList.Add(23.134);
            myList.Add(13);
            foreach (Object item in myList)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine();

            List<int> numList = new List<int>() { 1, 2, 3, 4, 5 };
            for (int i = 0; i < numList.Count; i++)
            {
                Console.WriteLine(numList[i]);
                Console.WriteLine("Element {0} is \"{1}\"", i, numList[i]);
            }
        }

    }
}
