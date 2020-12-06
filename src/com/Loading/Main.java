package com.Loading;

import java.util.Scanner;

public class Main {
    public static String isEven(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int num= scanner.nextInt();
        if(num%2==0)
            return ("is even");
        else
        return ("is odd");
    }



    public static void main(String[] args) {
       String str= isEven();
        System.out.println(str);
    }
}

