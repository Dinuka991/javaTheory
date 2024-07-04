package array;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        int d = 1;
        a.forEach(System.out::print);
        System.out.println();
        System.out.println(rotLeft(a, d));

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Array left rotation
        List<Integer> result = new ArrayList<>();
        for (int i = d; i < a.size(); i++) {
            result.add(a.get(i));
        }
        for (int i = 0; i < d; i++) {
            result.add(a.get(i));
        }
        return result;
    }

}
