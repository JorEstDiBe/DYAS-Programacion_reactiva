package com.example;

import io.reactivex.Observable;

public class ZipOperatorExample {
    public static void main(String[] args) {
        Observable<String> obs1 = Observable.just("A", "B", "C");
        Observable<Integer> obs2 = Observable.just(1, 2, 3);

        Observable.zip(obs1, obs2, (s, i) -> s + i)
                .subscribe(result -> System.out.println("Zip result: " + result));
    }
}
