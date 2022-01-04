using System;

namespace KattisProblems
{
    class NumberFun
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for(int i = 0; i < n; i++)
            {
                string[] values = Console.ReadLine().Split(' ');
                int a = int.Parse(values[0]);
                int b = int.Parse(values[1]);
                int c = int.Parse(values[2]);
                if(((a+b)==c)|| (Math.Abs(a - b) == c)|| ((a * b) == c)|| ((a + b) == c)|| (((float)(a) / (float)(b)) == c)|| (((float)(b) / (float)(a)) == c))
                {
                    Console.WriteLine("Possible");
                }
                else
                {
                    Console.WriteLine("Impossible");
                }
            }
            
            

        }
    }
}
