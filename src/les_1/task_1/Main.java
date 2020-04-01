package les_1.task_1;

public class Main {
    public static void main(String[] args) {
        DynamicDoubleArray d = new DynamicDoubleArray(2);
        d.add(1.0);
        d.add(2.0);
        d.add(3.0);
        d.add(4.0);
        d.add(5.0);
        System.out.println(d.toString());
        d.get(4);
        d.remove(2);
        System.out.println(d.toString());
    }
}
