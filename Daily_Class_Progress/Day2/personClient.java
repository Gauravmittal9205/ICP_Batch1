package Day2;

import java.util.*;

public class personClient {
    public static void main(String[] args) {
        Person p1 = new Person(67, 32, "Ravi");
        Person p2 = new Person(74, 24, "Mohan");
        Person p3 = new Person(82, 23, "Shyam");
        Person p4 = new Person(85, 18, "Karan");
        Person p5 = new Person(76, 19, "Kahna");
        Person p6 = new Person(87, 23, "Lokesh");
        Person p7 = new Person(97, 25, "Harendra");
        Person p8 = new Person(57, 45, "Pankaj");
        List<Person> heights = new ArrayList<>();
        heights.add(p1);
        heights.add(p2);
        heights.add(p3);
        heights.add(p4);
        heights.add(p5);
        heights.add(p6);
        heights.add(p7);
        heights.add(p8);
        Collections.sort(heights, new MyComparator());
        for (Person p : heights) {
            System.out.println(p.toString());

        }

    }

}
