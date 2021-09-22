package com.company;

public class Main {

    public static void main(String[] args)
/*    {
        // ex. 2

        System.out.println(sumUpTo(2)+ " ");

    }

    static int sumUpTo (int n)
    {

    for (int i = 1; i <= 20; i++)
    {

        n = n * (n + 1)) / 2;

    }
        return n;
    }
    }*/

//--------------------------------------------------------------------------

/*        // ex. 3

     {
        System.out.print (contains (new int [args.length], 2));

     }

    static boolean contains (int [] array, int value)
    {
        boolean answer = false;
        array = new int [] {1, 2, 3, 4};

        for (int a = 0; a <= array.length; a++)
        {
            if (value == a)
                answer = true;
        }
        return answer;
    }

}
*/

//--------------------------------------------------------------------------

        // ex. 4.1

/*
{
    System.out.print (prime (29));
}

        static boolean prime (int n)
        {

            boolean primeornot = true;

            if (n <= 1)
                primeornot = false;

            for (int i = 2; i < n; i++)
                            if (n % i == 0)
                                primeornot = false;

                         return primeornot;
        }
}
*/

//--------------------------------------------------------------------------

// ex. 4.2

/*    {
        System.out.print (printPrime (100));
    }
    static boolean prime (int n)
    {

        boolean primeornot = true;

        if (n <= 1)
            primeornot = false;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                primeornot = false;
        }

        return primeornot;

    }
    static int printPrime (int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (prime(i))
                System.out.print (i + " ");
        }
        return n;
    }
}
*/

//--------------------------------------------------------------------------

// ex. 4.3

    {
        System.out.print (printPrime (10000));
    }
    static boolean prime (int n)
    {

        boolean primeornot = true;

        if (n <= 1)
            primeornot = false;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                primeornot = false;
        }

        return primeornot;

    }
    static int printPrime (int n)
    {
        int count = 0;
        int number = 1;
        while (count != 100){
            if(prime(number))
            {
                System.out.println(number);
                count++;
            }

            number++;
        }

        return n;
    }
}
