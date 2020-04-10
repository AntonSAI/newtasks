package les_2.task_1;

import java.util.Comparator;
import java.util.List;

public class PersonSorter {
    public void sortByName(List<Person> list) {
        list.sort((Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void sortByAge(List<Person> list) {
        list.sort((Person o1, Person o2) -> o1.getAge().compareTo(o2.getAge()));
    }
}
