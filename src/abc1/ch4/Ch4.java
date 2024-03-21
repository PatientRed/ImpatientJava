package abc1.ch4;

import abc1.ch4.ex3.LabeledPoint;

public class Ch4 {
    public static void ex3() {
        var p1 = new Point(1, 1);
        var p2 = new LabeledPoint(1, 1, "wtf");
//
//        System.out.println(LabeledPoint.protectedTest(p1));
//        System.out.println(LabeledPoint.protectedTest(p2));
    }

    public static Object ex7Add(Object o1, Object o2) {
        if (o1 instanceof Number n1 && o2 instanceof Number n2)
            return n1.doubleValue() + n2.doubleValue();
        else if (o1 instanceof Boolean b1 && o2 instanceof Boolean b2)
            return b1 && b2;
        else
            return o1.toString() + o2.toString();
    }

    public static void ex8()
    {
        System.out.println(Color.GREEN.getRed());
        System.out.println(Color.GREEN.getGreen());
        System.out.println(Color.GREEN.getBlue());
        System.out.println(Color.YELLO.getRed());
        System.out.println(Color.YELLO.getGreen());
        System.out.println(Color.YELLO.getBlue());
    }
}
