package org.stittlem.restdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    static  String[] todos= {"grocery shop", "gas", "laundry"};

    @GetMapping("/todos")
    public String[] getTodos() {
        return todos;
    }
}

