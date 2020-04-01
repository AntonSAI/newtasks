package les_1.task_2;


import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] actualArray;
    private Object[] newArray;
    private int arrayCapacity;
    private int actualIndex = 0;

    public DynamicArray(int arrayCapacity) {
        this.arrayCapacity = arrayCapacity;
        actualArray = new Object[arrayCapacity];
    }

    public void add(T item) {
        if (actualIndex >= arrayCapacity) {
            newArray = new Object[++arrayCapacity];
            for (int i = 0; i < arrayCapacity; i++) {
                if (i == actualIndex) {
                    continue;
                }
                newArray[i] = actualArray[i];
            }
            actualArray = newArray;
            actualArray[actualIndex++] = item;
        } else {
            actualArray[actualIndex++] = item;
        }
    }

    public void get(int index) {
        if (index >= 0 & index < actualIndex) {
            System.out.println(actualArray[index]);
        } else {
            System.out.println("excess array of numbers");
        }
    }

    public void remove(int index) {
        if (index >= 0 & index < actualIndex) {
            newArray = new Object[--arrayCapacity];
            for (int i = 0; i < arrayCapacity; i++) {
                if (i >= index) {
                    newArray[i] = actualArray[i + 1];
                } else {
                    newArray[i] = actualArray[i];
                }
            }
            actualArray = newArray;
        } else {
            System.out.println("excess array of numbers");
        }
    }

    @Override
    public String toString() {
        return "DynamicArray" + Arrays.toString(actualArray);
    }
}
