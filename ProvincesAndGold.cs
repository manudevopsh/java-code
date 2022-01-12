using System;

namespace KattisProblems
{
    class ProvincesAndGold
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int g = int.Parse(values[0]);
            int s = int.Parse(values[1]);
            int c = int.Parse(values[2]);
            int cost = g * 3 + s * 2 + c;
            if (cost >= 8)
            {
                Console.WriteLine("Province or Gold");
            }
            else if (cost >= 6)
            {
                Console.WriteLine("Duchy or Gold");
            }
            else if (cost >= 5)
            {
                Console.WriteLine("Duchy or Silver");
            }
            else if (cost >= 3)
            {
                Console.WriteLine("Estate or Silver");
            }
            else if (cost >= 2)
            {
                Console.WriteLine("Estate or Copper");
            }
            else
            {
                Console.WriteLine("Copper");
            }
        }
    }
}
