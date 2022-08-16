package com.json.gson_test2.view;


import java.util.Scanner;

public class MainView {
    private final LabelView labelView = new LabelView();
    private final Scanner scan = new Scanner(System.in);
   public void mainMenu(){
String input = scan.nextLine();
switch (input) {
    case "A":
        labelView.createLabelView();
        break;
}
   }
}
