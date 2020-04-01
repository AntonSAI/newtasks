package les_1.task_5;

import les_1.task_5.annotation.ThisCodeSmells;
import les_1.task_5.annotation.UseArrayList;
import les_1.task_5.annotation.UseStackOnly;

public class Beagle extends Dog {
    @ThisCodeSmells
    private String name;
    @UseStackOnly
    private int age;

    public Beagle() {
    }

    public Beagle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Deprecated
    public void guard() {
    }

    @Override
    public boolean isDomastic(Object o) {
        return false;
    }

    @Override
    @UseArrayList
    public void addPetToy() {
        super.addPetToy();
    }

    @ThisCodeSmells
    public void play() {
        playWithBall();
    }

    private void playWithBall() {
        System.out.println("play with ball");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
