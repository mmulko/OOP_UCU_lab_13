import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Human student = () -> System.out.println("hello free main");
        student.process();
        List<String> arr = Arrays.asList("1", "2", "3");
        List<Integer> newArr = arr.stream().map(Integer::parseInt).map(x -> x * x).collect(Collectors.toList());
        System.out.println(newArr);
    }
}
