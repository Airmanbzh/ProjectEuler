package com.airmanbzh.euler.utils;


public class MultNumber {
    private Long maxMultiplation;

    private Integer zeroCount = 0;
    private Integer firstNumber = 0;

    private Integer maxSize = 1;

    private String currentNumber = "";

    public MultNumber(Integer size) {
        this.maxSize = size;
    }

    public void addNumber(Integer number) {
        if (number.equals(0)) {
            zeroCount++;
        } else {
            if (maxMultiplation == null) {
                maxMultiplation = 1L;
            }
            maxMultiplation *= number;
        }

        currentNumber = currentNumber.concat(number.toString());

        if (currentNumber.length() > maxSize) {
            firstNumber = Integer.parseInt(String.valueOf(currentNumber.charAt(0)));
            currentNumber = currentNumber.substring(1);
            if (firstNumber != 0) {
                maxMultiplation /= firstNumber;
            } else {
                zeroCount -= 1;
            }
        }
    }

    public Long getValue() {
        return zeroCount > 0 || currentNumber.length() < maxSize ? 0 : maxMultiplation;
    }
}
