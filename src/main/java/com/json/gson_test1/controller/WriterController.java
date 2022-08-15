package com.json.gson_test1.controller;
import com.json.gson_test1.model.Writer;

import static com.json.gson_test1.controller.Controller.*;
public class WriterController {
    public void writerControll(Writer writer){
        writer.setId(scanInteger());
        writer.setFirstName(scanString());
        writer.setLastName(scanString());

    }
}
