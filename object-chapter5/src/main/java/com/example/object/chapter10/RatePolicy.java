package com.example.object.chapter10;

import com.example.object.chapter5.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
