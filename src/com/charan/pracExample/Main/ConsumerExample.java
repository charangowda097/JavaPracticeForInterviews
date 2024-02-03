package com.charan.pracExample.Main;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println(s);
        c.accept("Hello");
        c.accept("Charan Gowda");
    }
}
