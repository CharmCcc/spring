package com.dgut.utils.impl;

import com.dgut.utils.Cal;
import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal {

    @Override
    public int add(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    @Override
    public int sub(int num1, int num2) {
        int res = num1 - num2;
        return res;
    }

    @Override
    public int mul(int num1, int num2) {
        int res = num1 * num2;
        return res;
    }

    @Override
    public int div(int num1, int num2) {
        int res = num1 / num2;
        return res;
    }
}
