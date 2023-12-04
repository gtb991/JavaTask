package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseToLowercase {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "gReen", "YeLLow");

        System.out.println("List of colors: " +colors);

        List<String>  uppercaseString = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\nUppercase String "+uppercaseString);

        List<String>  lowercaseString = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("\nLowercase String "+lowercaseString);
    }

}
