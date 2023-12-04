package Streams;

import java.util.Arrays;
import java.util.List;

public class AvgOfIntegers {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,6,10,15,20,25,30,34,46);
        System.out.println("List of numbers"+ nums);

        double avg = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of a list: "+avg);
    }
}
