import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Using a Consumer to define what to do with each element
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        // Using forEach method to iterate over the elements and apply the Consumer
        nums.forEach(con);
    }
}
