using System;

namespace KattisProblems
{
    class Grading
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());
            int i = 1;
            int height = 0;
            while (n>=i*i)
            {
                n = n - i * i;
                i = i + 2;
                height++;
            }
            Console.WriteLine(height);

        }
    }
}
