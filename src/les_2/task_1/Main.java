package les_2.task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonSorter p = new PersonSorter();
        List<Person> list = new ArrayList<>();
        list.add(new Person("name1", 14));
        list.add(new Person("name4", 12));
        list.add(new Person("name2", 10));
        list.add(new Person("name0", 9));
//        System.out.println("before sort:");
//        list.forEach(System.out::println);
//        System.out.println("after sort by name");
//        p.sortByName(list);
//        list.forEach(System.out::println);
//        System.out.println("after sort by age");
//        p.sortByAge(list);
//        list.forEach(System.out::println);

        System.out.println("after sort by name");
        Comparator<Person> byName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        list.sort(byName);
        list.forEach(System.out::println);

        System.out.println("after sort by age");
        Comparator<Person> byAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };
        list.sort(byAge);
        list.forEach(System.out::println);

        Collections.sort(list, Person::compareByName);
        list.forEach(System.out::println);
    }
}
