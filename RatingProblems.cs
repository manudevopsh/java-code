using System;

namespace KattisProblems
{
    class RatingProblems
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int n = int.Parse(values[0]);
            int k = int.Parse(values[1]);
            int total = 0;
            for(int i =0;i<k; i++)
            {
                total += int.Parse(Console.ReadLine());

            }
            float min = (float)(total + (n - k) * (-3)) / (float)n;
            float max = (float)(total + (n - k) * (3)) / (float)n;
            Console.WriteLine(min + " " + max);
            

        }
    }
}
