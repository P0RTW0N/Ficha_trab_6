package org.example;

public class Exercicio2
{
    public boolean isPrime(int num)
    {
        int conta = 0;

        if (num <= 1) {
            System.out.println(num+ " não é primo");
            return false;
        }
        for(int i=1;i<num;i++)//
        {
            if (num % i == 0) {
                conta++;
            }
        }

        if (conta > 1) {
            System.out.println(num+ " não é primo");
            return false;
        }
        else {
            System.out.println(num+ " é primo");
            return true;
        }
    }

    public boolean isEven(int num)
    {
        int conta = 0;
        if(num % 2 == 0)
        {
            System.out.println(num+ " é par");
            return true;
        }else
        {
            System.out.println(num+ " é impar");
            return false;
        }
    }

    public boolean isMultiple(int num1 , int num2)
    {
        if(num1 % num2 == 0)
        {
            System.out.println(num1+ " é multiplo de "+num2);
            return true;
        }
        System.out.println(num1+ " não é multiplo de "+num2);
        return false;
    }
}
