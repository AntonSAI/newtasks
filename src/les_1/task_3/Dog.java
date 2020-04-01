package les_1.task_3;

import java.util.ArrayList;
import java.util.List;

public abstract class Dog implements Animal, Predicate {
    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void run() {
    }

    @Override
    public void sound() {
    }

    @SuppressWarnings({"unchecked", "unused"})
    public void addPetToy() {
        List list = new ArrayList();
        list.add("ball");
        list.get(0).toString();
    }

    public void guard() {
    }
}
