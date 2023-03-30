import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("giusy", "moretti", 54);
        Person p2 = new Person("giusy", "moretti", 54);
        HashSet<Person> hashSetPepole = new HashSet<>(
            Set.of(
                new Person("anjodbja", "kmdsknds", 11),
                new Person("anjodrsggsgfbja", "kmvdsknds", 11),
                new Person("dfgdf", "kmdskgfgnds", 11),
                new Person("gbdbgd", "kmdsfgfvknds", 11),
                new Person("bdbgdv", "drdrddd", 11),
                p1
            )
        );

        for (Person person : hashSetPepole) {
            System.out.println(person.getName()+"....."+person.getSurname());
        }
        System.out.println("************************");

        Set<Person> treeSetPepole = new TreeSet<>();

    }
}
