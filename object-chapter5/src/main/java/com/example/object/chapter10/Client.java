package com.example.object.chapter10;

import com.example.object.chapter5.Money;

import java.time.Duration;

public class Client {
    public static void main(String[] args) {
        new Phone(new TaxablePolicy(0.05, new RegularPolicy(Money.ZERO, Duration.ofSeconds(10))));
    }
}
