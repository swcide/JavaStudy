package com.javaStudy.Inheritance;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class MultiplicationableCalculator extends Calculator { // Calculator상속받음
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator { //MultiplicationableCalculator 상속받음
    public void division() {
        System.out.println(this.left / this.right);
    }
}


class Main {

    public static void main(String[] args) {

    }
}