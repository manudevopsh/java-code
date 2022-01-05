using System;

namespace KattisProblems
{
    class RoamingRomans
    {
        static void Main(string[] args)
        {
            float x= float.Parse(Console.ReadLine());
            float miles = (5280000 * x) / 4854;
            Console.WriteLine(Decimal.Round((decimal)miles));
        }
    }
}
