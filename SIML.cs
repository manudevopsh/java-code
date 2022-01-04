using System;

namespace KattisProblems
{
    class SIML
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            char[] inputChar = input.ToCharArray();
            for(int i = 0; i < inputChar.Length; i++)
            {
                if ((inputChar[i] == ':')|| (inputChar[i] == ';'))
                {
                    if((i<inputChar.Length-1) && (inputChar[i+1] == ')'))
                    {
                        Console.WriteLine(i);
                    }
                    else if((i < inputChar.Length-2) && (inputChar[i + 1] == '-') && (inputChar[i + 2] == ')'))
                    {
                        Console.WriteLine(i);
                    }

                }
            }
            
        }
    }
}
