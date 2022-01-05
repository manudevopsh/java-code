using System;

namespace KattisProblems
{
    class Speeding
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int prevTime = 0;
            int prevDist = 0;
            int[] speed = new int[n];
            for (int i = 0; i < n; i++)
            {
                string[] values = Console.ReadLine().Split(' ');
                
                int t = int.Parse(values[0]) -prevTime;
                int d = int.Parse(values[1])-prevDist;
                if (t != 0)
                {
                    
                    speed[i] = (d/ t);
                    
                    prevTime = int.Parse(values[0]);
                    prevDist = int.Parse(values[1]);
                }
                
            }
            int max = speed[0];
            for (int i = 1; i < n; i++)
            {
                
                if (speed[i] > max)
                {
                    max = speed[i];
                }

            }
            Console.WriteLine(max);
        }
    }
}
