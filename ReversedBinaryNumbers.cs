using System;

namespace KattisProblems
{
    class ReversedBinaryNumbers
    {
        static void Main(string[] args)
        {
            int input= int.Parse(Console.ReadLine());
            string binary = Convert.ToString(input, 2);
            char[] cArray = binary.ToCharArray();
            string reverse = String.Empty;
            for (int i = cArray.Length - 1; i > -1; i--)
            {
                reverse += cArray[i];
            }
            int value = Convert.ToInt32(reverse, 2);
            Console.WriteLine(value);
        }
    }
}
