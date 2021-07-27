package com.oreilly.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import static org.junit.Assert.*;

public class HelloControllerUnitTest {

    @Test
    void sayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("World", model);
        assertEquals("hello", result);
        assertEquals("World", model.asMap().get("user"));

    }
}
