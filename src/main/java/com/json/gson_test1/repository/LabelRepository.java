package com.json.gson_test1.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json.gson_test1.model.Label;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LabelRepository {

    public Label getById(Integer id) {
        return null;
    }

    public List<Label> getAll() {
        return new ArrayList<>();
    }

    public Label save(Label l) {
        String papka = l.getName() +".json";

        try(FileWriter w= new FileWriter("D:\\java\\home\\avvakumova\\dev\\src\\main\\resources\\"+papka,true);) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            w.write(gson.toJson(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return l;
    }

    public Label update(Label l) {
        return null;
    }

    public void deleteById(Integer id) {

    }
}