package stream.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.IntSummaryStatistics;

public class FindElements {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 7, 7, 9, 9};
        System.out.println(findSecondLargest1(arr));
        System.out.println(findSecondLargest2(arr));
        System.out.println(findSecondLargest3(arr));
        System.out.println(findSecondLargest4(arr));
        System.out.println(findSecondLargest5(arr));
        System.out.println(findSecondLargest6(arr));
        System.out.println(findSecondLargest7(arr));
        System.out.println(findSecondLargest8(arr));
        System.out.println(findSecondLargest9(arr));
        System.out.println(findSecondLargest10(arr));
    }

    // Type 1: Using Streams
    public static int findSecondLargest1(int[] arr) {
        return Arrays.stream(arr).boxed().distinct().sorted((a, b) -> b - a).skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("No second largest element found"));
    }

    // Type 2: Using Collections.reverseOrder()
    public static int findSecondLargest2(int[] arr) {
        return Arrays.stream(arr).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("No second largest element found"));
    }

    // Type 3: Sorting the Array
    public static int findSecondLargest3(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < max) {
                return arr[i];
            }
        }
        throw new RuntimeException("No second largest element found");
    }

    // Type 4: Using Comparator.reverseOrder()
    public static int findSecondLargest4(int[] arr) {
        return Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("No second largest element found"));
    }

    // Type 5: Using PriorityQueue
    public static int findSecondLargest5(int[] arr) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(arr).distinct().forEach(maxHeap::offer);
        if (maxHeap.size() < 2) {
            throw new RuntimeException("No second largest element found");
        }
        maxHeap.poll(); // Remove the largest element
        return maxHeap.poll(); // Return the second largest element
    }

    // Type 6: Efficient Single Pass
    public static int findSecondLargest6(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found");
        }
        return second;
    }

    // Type 7: Using TreeSet
    public static int findSecondLargest7(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.stream(arr).boxed().toList());
        if (set.size() < 2) {
            throw new RuntimeException("No second largest element found");
        }
        set.pollLast(); // Remove the largest element
        return set.pollLast(); // Return the second largest element
    }

    // Type 8: Using Streams to Find Max and Second Max
    public static int findSecondLargest8(int[] arr) {
        IntSummaryStatistics stats = Arrays.stream(arr).distinct().summaryStatistics();
        int max = stats.getMax();
        return Arrays.stream(arr).distinct().filter(x -> x != max).max().orElseThrow(() -> new RuntimeException("No second largest element found"));
    }

    // Type 9: Using a Custom Method
    public static int findSecondLargest9(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found");
        }
        return second;
    }

    // Type 10: Using Bubble Sort to Find Top 2
    public static int findSecondLargest10(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[n - 2];
    }
}
