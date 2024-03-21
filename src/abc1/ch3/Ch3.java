package abc1.ch3;

import java.util.*;
import java.util.stream.Collectors;

public class Ch3 {
    static Measurable[] temp;

    static {
        var temp2 = new Employee[5];

        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = new Employee((i + 1) * 1000);

            temp = temp2;
        }

    }

    public static void ex1() {

        System.out.println(Measurable.avg(temp));
    }

    public static void ex2() {
        System.out.println(Measurable.largest(temp));
    }

    static void luckySort(ArrayList<String> arr, Comparator<String> comp) {
        final var requirement = arr.stream().sorted(comp).collect(Collectors.toCollection(ArrayList<String>::new));

        var i = 0;
        do {
            Collections.shuffle(arr);
            i++;
        } while (!arr.equals(requirement));

        System.out.printf("Runs: %d", i);
        System.out.println();
    }

    public static void ex8() {
        var temp = new ArrayList<String>();
        temp.add("gstew");
        temp.add("325235h");
        temp.add("krep");
        temp.add("krep 5");

        luckySort(temp, String::compareTo);
    }

    static class Greeter implements Runnable {
        String name;
        int n;

        @Override
        public void run() {
            for (int i = 0; i < n; i++)
                System.out.println("Hello, " + name);
        }

        public Greeter(String name, int n) {
            this.name = name;
            this.n = n;
        }
    }

    public static void ex9() {
        new Thread(new Greeter("John", 10)).start();
        new Thread(new Greeter("Bean", 10)).start();
    }
}
