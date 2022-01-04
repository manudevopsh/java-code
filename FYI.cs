using System;

namespace KattisProblems
{
    class FYI
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int areacode = n / 10000;
            if(areacode == 555)
            {
                Console.WriteLine("1");
            }
            else
            {
                Console.WriteLine("0");
            }
        }
    }
}
