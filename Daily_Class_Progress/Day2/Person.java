package Day2;

import java.util.*;
//Comparable same class ke sath use hoti hai (Natural sorting order)
//Comparator ke liye separate class banni hoti hai (Customize sorting order)

public class Person implements Comparable<Person> {
    int height;
    int age;
    String name;

    public Person(int height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "[ name=" + name + " ,age=" + age + " ,height=" + height + " ]";

    }

    public int compareTo(Person other) {
        if (this.height < other.height)
            return -1;
        if (this.height > other.height)
            return 1;
        return 0;
    }
}

// class MyComparator implements Comparator<Person> {
// @Override
// public int compare(Person p1, Person p2) {
// if (p1.height < p2.height) {
// return -1;
// }
// if (p1.height > p2.height) {
// return 1;
// }
// return 0;
// }

// Task: Age ke basis pr sort kro agr age same hai to height ke basis pr kro agr
// height bhi same hot
class MyComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.age < p2.age) {
            return -1;
        } else if (p1.age > p2.age) {
            return 1;
        } else {
            if (p1.height < p2.height) {
                return -1;
            } else if (p1.height > p2.height) {
                return 1;
            } else {
                return p1.name.compareTo(p2.name);
            }
        }

    }
}
