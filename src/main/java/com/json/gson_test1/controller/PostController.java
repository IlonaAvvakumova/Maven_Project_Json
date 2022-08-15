package com.json.gson_test1.controller;
import com.json.gson_test1.model.Label;
import com.json.gson_test1.model.Post;

import java.util.List;

import static com.json.gson_test1.controller.Controller.*;
public class PostController {


    public void PostControll(Post post) {
        post.setId(scanInteger());
        post.setContent(scanString());
        post.setUpdated(scanString());

    }
}
