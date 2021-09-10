package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if(a == 0){
            double x;
            c = -c;
            x = c/b;
            if(b == 0){
                if(c == 0){
                    System.out.println("Корней уравнения бесконечно много");
                    return;
                }
                System.out.println("Уравнение не имеет корней");
            }
            else {
                System.out.println("Корней уравнения: 1 " + "Корень уравнения: " + x);
            }
            return;
        }
        else if(b == 0){
            double x;
            c = -c;
            x = c/a;
            if(x > 0) {
                System.out.println("Корней уравнения: 1 " + "Корень уравнения: " + Math.sqrt(x));
            }
            else{System.out.println("Уравнение не имеет корней");}
            return;
        }

        double dscr;
        int koll;
        dscr = b*b - 4 * a * c;
        if(dscr > 0){
            koll = 2;
            double x1, x2;
            x1 = (-b - Math.sqrt(dscr)) / (2 * a);
            x2 = (-b + Math.sqrt(dscr)) / (2 * a);
            System.out.println("Корней уравнения: " + koll + " ; " + "Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if(dscr == 0){
            koll = 1;
            double x;
            x = -b / (2 * a);
            System.out.println("Корней уравнения: " + koll + "; " + "Корень уравнения: x = " + x);
        }
        else{
            koll = 0;
            System.out.println("Уравнение не имеет действительных корней.");
        }
    }
}
