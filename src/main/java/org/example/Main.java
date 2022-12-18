package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //OK LETS

        int number = 6;
        int reminder = number % 2;
        System.out.println(reminder)
        ;
        boolean isPrime = true;
if (number<2){

    System.out.println("daha büyük sayı giriniz");

    return;
}
        for (int i = 2; i < number; i++) ;
        {
            if (number % 2 == 0) {


                isPrime = false;


            }


        }

        if (isPrime) {
            System.out.println("sayi asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }}
    }