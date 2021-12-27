package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,i,top=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        a = input.nextInt();

        System.out.print("Üs değeri giriniz: ");
        b = input.nextInt();

        for (i=1;i<=b;i++){
                top*=a;
        }
        System.out.println(top);
    }
}
