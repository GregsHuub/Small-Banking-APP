package greg.financialApp;

import javax.swing.*;
import java.util.Arrays;

public class Test implements myMethods {
    public static void main(String[] args) {


        //fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("fizz");
//            }
//            else if(i%5 == 0){
//                System.out.println("buzz");
//            }
//
//            else {
//                System.out.println(i);
//            }
//        }

//        int[] someArray = {0, 1, 2, 3, 9, 8, 7, 6, 5};
//        System.out.println(findMissingMyWay(someArray));
//        System.out.println(factorial(5));
//        inverseString("Dzisiaj chodzę po basenie i jest super");

        System.out.println(fibonacciRekurencja(7));
       fibonacci(7);


    }

    public static int silniaZadanie(int n){
        if(n > 1){
            return n * silniaZadanie(n - 1);
        }
        else {
            return 1;
        }
    }


    public static int sumaIteracji(int n){
        int suma = 0;
        while (n > 0) {
            suma = suma + n;
            n--;
        }
        return suma;
    }

    public static int sumaRekurencji(int n){
        if(n > 0){
            return n + sumaRekurencji(n-1);
        } else {
            return 0;
        }
    }

    public static int silnia(int n){
        int value = 1;
        for (int i = 1; i <=n; i++){
            value = value * i;
        }
        return value;
    }

    public static int silniaRekurencja(int n){
        if (n > 0){
            return n * silniaRekurencja(n-1);
        }else {
            return 1;
        }

    }

    public static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <=n; i++){
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }

    public static int shortFacotrial(int n){
        return (n == 0) ?1 : (n * shortFacotrial(n -1));
    }

    public static int fibonacciRekurencja(int n){
        if(n > 2){
            return fibonacciRekurencja(n-1) + fibonacciRekurencja(n-2);
        }
        else {
            return 1;
        }
    }

    public static int fibonacciCwiczenie(int n){
        if(n > 0){
            return n * silniaRekurencja(n -1) * silniaZadanie(n -2);
        }
        else {
            return 1;
        }
    }

    public static int findMissingElement(int[] tab){

        int sum = (tab.length + 1) * tab.length/2;
        int actualSum = Arrays.stream(tab).sum();
        return sum - actualSum;
    }
    public static int findMissingMyWay(int[] tab){
        int missing = 0;
        Arrays.sort(tab);
        for(int i = 0; i < tab.length; i++){
            if(tab[i] != i){
                missing = i;
                break;
            }
        }
        return missing;
    }

    public static int factorial(int n){
        int sum = 1;
        for (int i = 1; i <= n;i++){
            sum = sum * i;

        }
        return sum;
    }

    public static void inverseString(String str){

        char[] charArray = str.toCharArray();

        for(int i = str.length(); i > 0; i--){
            System.out.print(charArray[i - 1]);
        }
    }



    }

