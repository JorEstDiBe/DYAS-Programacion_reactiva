package com.example;

import io.reactivex.Observable;

public class MergeOperatorExample {
    public static void main(String[] args) {
        Observable<String> obs1 = Observable.just("One", "Two");
        Observable<String> obs2 = Observable.just("Three", "Four");

        Observable.merge(obs1, obs2)
                .subscribe(result -> System.out.println("Merge result: " + result));
    }
}
