using System;

namespace KattisProblems
{
    class OddEcho
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string[] input = new string[n];
            for(int i = 0; i < n; i++)
            {
                input[i] = Console.ReadLine();
            }
            for(int i = 0; i < n; i = i + 2)
            {
                Console.WriteLine(input[i]);
            }
            
        }
    }
}
