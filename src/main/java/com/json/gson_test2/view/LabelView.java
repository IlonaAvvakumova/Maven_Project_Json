package com.json.gson_test2.view;

import com.json.gson_test2.controller.LabelController;
import com.json.gson_test2.model.Label;

import java.util.Scanner;

public class LabelView {
    private final Scanner scan = new Scanner(System.in);
    private final LabelController controller = new LabelController();
    public void createLabelView(){
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        Label label = controller.createLabel(name);
        System.out.println("Created label: " + label);
    }
}
