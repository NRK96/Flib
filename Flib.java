/*
Name: Nicholas Keen
Course: CIS 201 - Computer Science I
Section: 003
Assignment: 2
*/

// This program will spell out "GIGGLING FLIBBERTIGIBBET"

public class Flib{

    public static void main(String[] args){

        g();
        i();
        g();
        g();
        l();
        i();
        n();
        g();
        nextLine();
        nextLine();
        f();
        l();
        i();
        b();
        b();
        e();
        r();
        t();
        i();
        g();
        i();
        b();
        b();
        e();
        t();
    }

    public static void b(){
       roundTop();
       shortLine();
       legs();
       shortLine();
       nextLine();
    }

    public static void e(){
        longLine();
        System.out.println("$");
        shortLine();
        System.out.println("$\n$");
        longLine();
        nextLine();
    }

    public static void f(){
        longLine();
        System.out.println("$");
        shortLine();
        System.out.println("$\n$");
        nextLine();
    }

    public static void g(){
        roundTop();
        System.out.println("$\n$  $$\n$   $");
        shortLine();
        nextLine();
    }

    public static void i(){
        longLine();
        System.out.println("  $\n  $\n  $\n  $");
        longLine();
        nextLine();
    }

    public static void l(){
        backBone();
        shortLine();
        nextLine();
    }

    public static void n(){
        System.out.println("$    $\n$$   $\n$ $  $\n$  $ $\n$   $$\n$    $");
        nextLine();
    }

    public static void r(){
        roundTop();
        shortLine();
        legs();
        System.out.println("$   $");
        nextLine();
    }

    public static void t(){
        longLine();
        System.out.println("  $\n  $\n  $\n  $\n  $");
        nextLine();
    }

    public static void roundTop(){
        System.out.println("$$$$\n$   $");
    }

    public static void shortLine(){
        System.out.println("$$$$");
    }

    public static void longLine(){
        System.out.println("$$$$$");
    }

    public static void backBone(){
        System.out.print("$\n$\n$\n$\n$\n$");
    }

    public static void legs(){
        System.out.println("$   $\n$   $");
    }

    public static void nextLine(){
        System.out.println();
    }
}