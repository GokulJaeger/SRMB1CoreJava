package week1.day6.Interface;

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}
