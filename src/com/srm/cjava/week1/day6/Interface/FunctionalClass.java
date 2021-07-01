package com.srm.cjava.week1.day6.Interface;

class FunctionalClass<T extends Comparable<T>> implements MinMax<T> {
    T[] values;

    FunctionalClass(T[] obj) {
        values = obj;
    }

    public T min() {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) < 0)
                o1 = values[i];
        return o1;
    }

    public T max() {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) > 0)
                o1 = values[i];
        return o1;
    }
}