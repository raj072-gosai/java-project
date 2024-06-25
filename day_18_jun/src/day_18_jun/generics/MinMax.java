package day_18_jun.generics;

//Program to demonstrate generic interface


//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
