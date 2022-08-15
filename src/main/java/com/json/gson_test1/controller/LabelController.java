package com.json.gson_test1.controller;
import com.json.gson_test1.model.Label;
import com.json.gson_test1.model.Writer;

import static com.json.gson_test1.controller.Controller.*;
public class LabelController {

    public void labelControll(Label label){
        System.out.println("Введите ID:");
        label.setId(scanInteger());
        System.out.println("Введите Name:");
        label.setName(scanString());


    }

}
