using System;

namespace KattisProblems
{
    class Grading
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int a = int.Parse(values[0]);
            int b = int.Parse(values[1]);
            int c = int.Parse(values[2]);
            int d = int.Parse(values[3]);
            int e = int.Parse(values[4]);
            int score = int.Parse(Console.ReadLine());
            if (score >= a)
            {
                Console.WriteLine("A");
            }else if(score >= b)
            {
                Console.WriteLine("B");
            }
            else if (score >= c)
            {
                Console.WriteLine("C");
            }
            else if (score >= d)
            {
                Console.WriteLine("D");
            }
            else if (score >= e)
            {
                Console.WriteLine("E");
            }
            else
            {
                Console.WriteLine("F");
            }


        }
    }
}
