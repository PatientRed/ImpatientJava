package abc1;

import abc1.ch1.Ch1;
import abc1.ch2.Point;
import abc1.ch2.PointC;
import abc1.ch2.TimeOfDay;
import abc1.ch3.Ch3;
import abc1.ch4.Ch4;
import abc1.ch6.Ch6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Hello {
    public static void main(String[] a) {
        System.out.println("No hello.");
        //firstChapter();
        //secondChapter();
        //thirdChapter();
        //fourthChapter();
        //sixthChapter();
        unaryTraining();
    }

    public static void firstChapter() {
        Ch1.first(8);
        System.out.println(Ch1.second(-500));
        System.out.println(Ch1.secondAlt(-500));
        System.out.println(Ch1.third(6, 4, 3));
        System.out.println(Ch1.thirdAlt(5, 6, 8));
        Ch1.fourth();
        Ch1.fifth();
        //System.out.println(First.sixth(1000));
        System.out.println(Ch1.eighth("abcde"));
        Ch1.ninth();
        System.out.println(Ch1.tenth());
        Ch1.fifteenth(507);
        Ch1.fifteenth(608);
        Ch1.fifteenth(20);
        for (int i = 0; i < 5; i++)
            System.out.println(Arrays.toString(Ch1.eighteenth()));
    }

    public record Range(int from, int to) {
        public Range {
            if (from > to) {
                int temp = from;
                from = to;
                to = temp;
            }
        }
    }

    public static void secondChapter() {
        var temp = new Range(4, 7);
        System.out.printf("%1$d %2$d", temp.from, temp.to);
        System.out.println();
        temp = new Range(7, 4);
        System.out.printf("%1$d %2$d", temp.from, temp.to);
        System.out.println();
        var point = new Point(3, 4);
        System.out.println(point.translate(1, 3).scale(0.5));
        var pointC = new PointC(3, 4);
        pointC.translate(1, 3);
        pointC.scale(0.5);
        System.out.println(pointC);
        var tod = new TimeOfDay(11, 18).plusMinutes(54);
        System.out.println(tod);
        System.out.println(tod.minutesFrom(new TimeOfDay(13, 9)));
        System.out.println(tod.minutesFrom(new TimeOfDay(11, 10)));
    }

    public static void thirdChapter() {
        Ch3.ex1();
        Ch3.ex2();
        Ch3.ex8();
        Ch3.ex9();
    }

    public static void fourthChapter() {
        Ch4.ex3();
        Ch4.ex8();
    }

    public static void sixthChapter() {
        Ch6.pleaseDo();
    }

    public static void training() {
        var x = new Random();
        x.ints().close();
        System.out.println(x.nextInt());
        System.out.println(x.nextInt());
        System.out.println(x.nextInt());
        System.out.println(x.nextInt());

        var z = 2;
        //z.toString();
    }

    public static void unaryTraining() {
        var temp = new LinkedList<Point>();
        temp.add(new Point(1, 1));
        temp.add(new Point(2, 1));
        temp.add(new Point(3, 2));
        temp.add(new Point(3, 3));

        temp.replaceAll(el -> el.translate(1, 1));

        for (var t : temp)
            System.out.println(t);
    }
}