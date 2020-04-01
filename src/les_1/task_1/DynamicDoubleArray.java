package les_1.task_1;

import java.util.Arrays;

public class DynamicDoubleArray {
    private double[] actualArray;
    private double[] newArray;
    private int arrayCapacity;
    private int actualIndex;

    public DynamicDoubleArray(int arrayCapacity) {
        this.arrayCapacity = arrayCapacity;
        actualArray = new double[arrayCapacity];
    }

    public void add(double number) {
        if (actualIndex >= arrayCapacity) {
            newArray = new double[++arrayCapacity];
            for (int i = 0; i < arrayCapacity; i++) {
                if (i == actualIndex) {
                    continue;
                }
                newArray[i] = actualArray[i];
            }
            actualArray = newArray;
            actualArray[actualIndex++] = number;
        } else {
            actualArray[actualIndex++] = number;
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
            newArray = new double[--arrayCapacity];
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
        return "DynamicDoubleArray " + Arrays.toString(actualArray);
    }
}
