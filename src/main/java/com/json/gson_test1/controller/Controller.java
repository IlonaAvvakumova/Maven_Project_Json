package com.json.gson_test1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public static Integer scanInteger() {
        Scanner scan = new Scanner(System.in);
        Integer integer = scan.nextInt();
        return integer;
    }

    public static String scanString() {
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();
        return stroka;
    }

/*    public static List scanListInt() {
        System.out.println("Введите первый элемент списка, для выхода выберите любую букву: ");
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        Integer lab;
        while (scan.hasNextInt()) {
            System.out.println("Следующий элемент списка: ");
            lab = scan.nextInt();
            list.add(lab);
        }
        scan.close();
        System.out.println(list);
        return list;
    }

    public static List scanListString() {
        System.out.println("Введите первый элемент списка, для выхода введите exit: ");
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        String lab = null;
        while (scan.hasNextLine()) {
            System.out.println("Следующий элемент списка: ");
            lab = scan.nextLine();
            if (lab.equals("exit")) break;
            list.add(lab);
        }
        scan.close();
        System.out.println(list);
        return list;
    }*/
}
