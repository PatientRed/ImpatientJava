package abc1.ch1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ch1 {
    public static void first(int i) {
        System.out.print(Integer.toBinaryString(i));
        System.out.printf(", %1$o, %1$x, %2$a", i, 1 / (double) i);
        System.out.println();
    }

    public static int second(int i) {
        if (i < 0)
            i = -i;
        return i % 360;
    }

    public static int secondAlt(int i) {
        return Math.floorMod(i, 360);
    }

    public static int third(int i1, int i2, int i3) {
        return i1 < i2 ? (i2 < i3 ? i3 : i2) : (i1 < i3 ? i3 : i1);
    }

    public static int thirdAlt(int i1, int i2, int i3) {
        return Math.max(Math.max(i1, i2), i3);
    }

    public static void fourth() {
        System.out.printf("%s %s", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println();
        System.out.println(Double.MIN_VALUE < 0);
    }

    public static void fifth() {
        System.out.println((int) Double.MAX_VALUE);
    }

    public static BigInteger sixth(int n) {
        if (n > 1)
            return sixth(n - 1).multiply(BigInteger.valueOf(n));
        else
            return BigInteger.valueOf(1);
    }

    public static ArrayList<String> eighth(String input) {
        var length = input.length();
        var result = new ArrayList<String>(length * length / 2);

        for (int i = 0; i <= length; i++)
            for (int j = i + 1; j <= length; j++)
                result.add(input.substring(i, j));

        return result;
    }

    public static void ninth() {
        var temp1 = "world";
        var temp2 = "wo" + getRld();

        System.out.printf("%s %s", temp1.equals(temp2), temp1 == temp2);
        System.out.println();
    }

    public static String getRld() {
        return "rld";
    }

    public static String tenth() {
        return Long.toUnsignedString(new Random().nextLong(), 36);
    }

    public static void fifteenth(int i) {
        var result = new StringBuilder();
        switch (i % 10) {
            case 5:
                result.append(5);
                break;
            case 0:
                result.append(5);
            case 2, 4, 6, 8:
                result.append(2);
                break;
            default:
                result.append("no");
        }

        System.out.println(result);
    }

    public static int[] eighteenth() {
        var initial = new ArrayList<Integer>();
        var result = new int[6];
        var length = 49;

        for (int i = 0; i < length; i++)
            initial.add(i + 1);

        for (int i = 1; i <= 6; i++) {
            var rnd = new Random().nextInt(0, initial.size());
            result[i - 1] = initial.get(rnd);
            initial.remove(rnd);
        }

        return Arrays.stream(result).sorted().toArray();
    }
}
