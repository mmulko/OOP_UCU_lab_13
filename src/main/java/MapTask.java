import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {
        return arr.stream().map(Integer::parseInt).map(x -> x * x).collect(Collectors.toList());
        // add filter
    }
}
