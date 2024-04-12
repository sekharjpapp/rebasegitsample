package com.pixel.optinalex;

import java.util.Optional;

public class CatMainClass {
    public static void main(String[] args) {
        Optional<Cat> mycat  = findCatByName("Fred");

        System.out.println(mycat.map(Cat::getAge)
                .orElse(0));
    }
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name,3);
        return Optional.of(cat);
    }
}
