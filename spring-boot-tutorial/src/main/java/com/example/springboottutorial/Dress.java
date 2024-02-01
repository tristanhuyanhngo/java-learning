package com.example.springboottutorial;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Dress implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing Dress");
    }
}
