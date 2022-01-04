using System;

namespace KattisProblems
{
    class DigitSwap
    {
        static void Main(string[] args)
        {
            int input = int.Parse(Console.ReadLine());
            int num1 = input % 10;
            int num2 = input / 10;
            Console.WriteLine(num1+""+num2);
        }
    }
}
