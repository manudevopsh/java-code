using System;

namespace KattisProblems
{
    class SevenWonders
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            char[] cards = input.ToCharArray();
            int t=0, c=0, g = 0;
            for(int i = 0; i < cards.Length; i++)
            {
                if(cards[i] == 'T')
                {
                    t++;
                }else if(cards[i] == 'C'){
                    c++;
                }else
                {
                    g++;
                }
            }

            int min = 0;
            if(t<=c && t <= g)
            {
                min = t;
            }else if(c <= g)
            {
                min = c;
            }
            else
            {
                min = g;
            }
            int score = t * t + g * g + c * c + min * 7;
            Console.WriteLine(score);
        }
    }
}
