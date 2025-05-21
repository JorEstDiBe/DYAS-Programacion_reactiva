package com.example;

import io.reactivex.Observable;

public class FilterOperatorExample {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5, 6)
                .filter(number -> number % 2 == 0)
                .subscribe(result -> System.out.println("Filter result: " + result));
    }
}
