using System;

namespace KattisProblems
{
    class SortTwoNumbers
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int x = int.Parse(values[0]);
            int y = int.Parse(values[1]);
            if (y > x)
            {
                Console.WriteLine(x +" "+ y);
            }
            else
            {
                Console.WriteLine(y + " " + x);
            }
            

        }
    }
}
