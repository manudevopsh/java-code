using System;

namespace KattisProblems
{
    class NumberFun
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] x = Console.ReadLine().Split(' ');
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum += Convert.ToInt32(x[i]);
            }
            Console.WriteLine(sum);
        }
    }
}
