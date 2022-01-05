using System;

namespace KattisProblems
{
    class StandonZanzibar
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for(int i = 0; i < n; i++)
            {
                string[] values = Console.ReadLine().Split(' ');
                int j = 0;
                int imported = 0;
                while (int.Parse(values[j+1]) != 0)
                {
                    int difference = int.Parse(values[j + 1]) - int.Parse(values[j]) * 2;
                    if (difference > 0)
                    {
                        imported += difference;
                    }
                    j++;
                }
                Console.WriteLine(imported);
            }
        }
    }
}
