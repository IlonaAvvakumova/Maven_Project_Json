package com.json.gson_test1;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json.gson_test1.Label.Label;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  SourceClass[] sourceArray = {new SourceClass(1, "one"), new SourceClass(2, "two")};
        String jsonString = new Gson().toJson(sourceArray);

        String expectedResult =
                "[{"intValue":1,"stringValue":"one"},{"intValue":2,"stringValue":"two"}]";
        assertEquals(expectedResult, jsonString);*/
        Label lab1 = new Label(1,"A");
        Label lab2 = new Label(2,"B");
        Label lab3 = new Label(3,"C");
Label [] labelArray = {lab1,lab2,lab3};
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
      //  String jsonString = gson.toJson(labelArray);
     //   System.out.println(jsonString);
       /// JsonObject labelJson = new JsonObject();
        FileWriter writer = new FileWriter("D:\\java\\home\\avvakumova\\dev\\src\\main\\resources\\labels.json");
        writer.write(gson.toJson(labelArray));
        writer.close();
    }
}
