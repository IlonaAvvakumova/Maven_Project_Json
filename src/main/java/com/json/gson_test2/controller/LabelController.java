package com.json.gson_test2.controller;

import com.json.gson_test2.model.Label;
import com.json.gson_test2.repository.GsonLabelRepository;
import com.json.gson_test2.repository.LabelRepository;

public class LabelController {
    private final LabelRepository labelRepository = new GsonLabelRepository();
    public Label createLabel(String name){
        Label label = new Label();
        label.setName(name);
        return labelRepository.creade(label);
    }
}
