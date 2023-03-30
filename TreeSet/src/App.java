import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> numbers = new TreeSet<>(
            Set.of(2,5,3,7,4,9,0)
        );
        System.out.println(numbers);
    }
}
