package com.example;

import io.reactivex.Observable;

public class FlatMapOperatorExample {
    public static void main(String[] args) {
        Observable.just("A", "B")
                .flatMap(letter -> Observable.just(letter + "1", letter + "2"))
                .subscribe(result -> System.out.println("FlatMap result: " + result));
    }
}
