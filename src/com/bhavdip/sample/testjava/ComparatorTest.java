package com.bhavdip.sample.testjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A",10));
        list.add(new Student("B",10));
        list.add(new Student("D",30));
        list.add(new Student("C",20));

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                if(s1.getMarks() > s2.getMarks()){
                    return -1;
                }else if(s1.getMarks() < s2.getMarks()){
                    return 1;
                } else {
                    return s1.getName().compareTo(s2.getName());
                }
            }
        });

        System.out.println("List-"+list);
    }


}


// B - 10

// A - 10
// C - 20
// D - 30
// D, C, [A, B]

