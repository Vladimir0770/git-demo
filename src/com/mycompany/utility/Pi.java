package com.mycompany.utility;

public class Pi {
    public static final double PI = 3.14;

    @Override
    public String toString() {
        return getClass().getName() + ": PI=" + PI;
    }
}
