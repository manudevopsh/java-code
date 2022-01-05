using System;

namespace KattisProblems
{
    class TriangleArea
    {
        static void Main(string[] args)
        {
            string[] values = Console.ReadLine().Split(' ');
            int h = int.Parse(values[0]);
            int b = int.Parse(values[1]);
            float area = (float)(b * h) / 2;
            Console.WriteLine(area);

        }
    }
}
