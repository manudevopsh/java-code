using System;

namespace KattisProblems
{
    class IsItHalloween
    {
        static void Main(string[] args)
        {
            
            string[] x = Console.ReadLine().Split(' ');
            string month = x[0];
            int day = int.Parse(x[1]);
            if(((month =="OCT")&&(day == 31))|| ((month == "DEC") && (day == 25))){
                Console.WriteLine("yup");
            }
            else
            {
                Console.WriteLine("nope");
            }
        }
    }
}
