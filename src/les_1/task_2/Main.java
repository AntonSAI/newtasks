package les_1.task_2;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> d = new DynamicArray<>(2);
        d.add("qwer1");
        d.add("qwer2");
        d.add("qwer3");
        d.add("qwer4");
        d.add("qwer5");
        d.get(4);
        System.out.println(d.toString());
        d.remove(3);
        System.out.println(d.toString());
    }
}
