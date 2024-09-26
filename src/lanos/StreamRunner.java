package lanos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "deepak", "sandhya","anupama");
        List<String> messages = names.stream()
                .map(name -> name.concat(" is my friend."))
                .collect(Collectors.toList());

        System.out.println(messages);
}
}