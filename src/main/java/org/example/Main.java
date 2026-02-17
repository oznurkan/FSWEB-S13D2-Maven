package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        numberToWords(-55);
    }

    public static boolean isPalindrome(int number){
        int originalNumber = Math.abs(number);
        int temp = originalNumber;
        int reversedNumber = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp = temp / 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for( int i = 1 ; i <= number/2 ; i ++){
            if(number % i == 0){
                sum += i;
            }
        }
        return number > 0 && number == sum;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }

        String sayi = "";
        int temp = number;
        while (temp > 0) {
            int lastDigit = temp % 10;
            switch (lastDigit) {
                case 0:
                    sayi = "Zero " + sayi;
                    break;
                case 1:
                    sayi = "One " + sayi;
                    break;
                case 2:
                    sayi = "Two " + sayi;
                    break;
                case 3:
                    sayi = "Three " + sayi;
                    break;
                case 4:
                    sayi = "Four "+ sayi;
                    break;
                case 5:
                    sayi = "Five " + sayi;
                    break;
                case 6:
                    sayi = "Six " + sayi;
                    break;
                case 7:
                    sayi = "Seven " + sayi;
                    break;
                case 8:
                    sayi = "Eight " + sayi;
                    break;
                case 9:
                    sayi = "Nine " + sayi;
                    break;
            }
            temp = temp / 10;
        }
        return sayi.trim();

    }
}
