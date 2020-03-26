package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate planete doriti?");
        arg[] b= new arg[100];
        gar d = new gar();
        int n = sc.nextInt();
        double[] f = new double[100];

        int i;
        for(i = 0; i < n; ++i) {
            b[i] = new arg();
        }

        int j;
        for(i = 0; i < n; ++i) {
            j = i + 1;
            System.out.println("Pentru planeta " + j + " : ");
            System.out.print("Numele planetei este:");
            b[i].setName(sc.next());
            System.out.print("X: ");
            b[i].setX(sc.nextInt());
            System.out.print("Y: ");
            b[i].setY(sc.nextInt());
            System.out.print("Z: ");
            b[i].setZ(sc.nextInt());
            f[i] = Math.sqrt((double)(b[i].getX() * b[i].getX() + b[i].getY() * b[i].getY() + b[i].getZ() * b[i].getZ()));
        }

        for(i = 0; i < n; ++i) {
            j = i + 1;
            System.out.println("Planeta " + j + "        Nume: " + b[i].getName() + "         D: " + f[i]);
            d.bubble(f, n);
            PrintStream var10000 = System.out;
            String var10001 = b[0].getName();
            var10000.println("Planetele cele mai apropiate sunt :\n" + var10001 + "\n" + b[1].getName() + "\n" + b[2].getName());
            var10000 = System.out;
            var10001 = b[-1].getName();
            var10000.println("Planetele cele mai departate sunt :\n" + var10001 + "\n" + b[-2].getName());
        }

    }
}
