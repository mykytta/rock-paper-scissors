package com.mykyta.rps;


public class Field {
    private Choice c1;
    private Choice c2;

    public void setC1(Choice c) {
        this.c1 = c;
    }

    public void setC2(Choice c) {
        this.c2 = c;
    }

    public Choice getC1() {
        return c1;
    }

    public Choice getC2() {
        return c2;
    }

    @Override
    public String toString() {
        return
                "Вы выбрали: " + c1 +
                ", компьютер выбрал: " + c2;
    }
}
