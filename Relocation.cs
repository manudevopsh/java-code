using System;

namespace KattisProblems
{
    class Relocation
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int n = int.Parse(values[0]);
            int q = int.Parse(values[1]);
            string[] input = Console.ReadLine().Split(' ');
            int[] nvalues = new int[input.Length];
            for(int i = 0; i < n; i++)
            {
                nvalues[i] = int.Parse(input[i]);
            }
            for(int i = 0; i < q; i++)
            {
                string[] qvalues = Console.ReadLine().Split(' ');
                if (qvalues[0] == "1")
                {
                    int company = int.Parse(qvalues[1])-1;
                    nvalues[company] = int.Parse(qvalues[2]);
                }
                else if(qvalues[0] == "2")
                {
                    int comp1 = int.Parse(qvalues[1])-1;
                    int comp2 = int.Parse(qvalues[2])-1;
                    int dist = Math.Abs(nvalues[comp1] - nvalues[comp2]);
                    Console.WriteLine(dist);
                }
            }
            
        }
    }
}
