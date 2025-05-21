package com.example;

import io.reactivex.Observable;

public class MapOperatorExample {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5)
                .map(number -> number * 2)
                .subscribe(result -> System.out.println("Map result: " + result));
    }
}
