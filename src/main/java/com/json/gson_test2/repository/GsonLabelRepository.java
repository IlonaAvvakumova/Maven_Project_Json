package com.json.gson_test2.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.json.gson_test2.model.Label;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class GsonLabelRepository implements LabelRepository{
     private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private final String LABEL_PATH = "D:\\java\\home\\avvakumova\\dev\\src\\main\\resources\\label.json";

    @Override
    public List<Label> getAll() {
        return null;
    }

    @Override
    public Label getById(Integer integer) {


        return readJsonLabel().stream().filter(a->a.getId().equals(integer)).findFirst().orElse(null);
    }

    @Override
    public Label creade(Label label) {
     List<Label> labels = readJsonLabel();
     label.setId(generateID(labels));
     labels.add(label);
     writeJsonLabel(labels);
     return label;
    }
    private Integer generateID(List<Label> labels){
        Label maxIdLabel = labels.stream().max(Comparator.comparing(Label :: getId)).orElse(null);
        return Objects.nonNull(maxIdLabel) ? maxIdLabel.getId()+1 : 1;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
    private void writeJsonLabel(List<Label> label) {
        try(FileWriter fw = new FileWriter(LABEL_PATH)) {
            fw.write(gson.toJson(label));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи файла");
        }

    }
    private  List<Label> readJsonLabel() {
   Path filePath = Path.of(LABEL_PATH);
try {
    String json = Files.readString(filePath);
        return gson.fromJson(json, new TypeToken <List<Label>>(){}.getType());

} catch (IOException e) {
    e.printStackTrace();
    return null;
}
    }
}
