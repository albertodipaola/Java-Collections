import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("giusy", "moretti", 54);
        Person p2 = new Person("giusy", "moretti", 54);
        Set<Person> pepole = Set.of(
            new Person("anjodbja", "kmdsknds", 11),
            new Person("anjodrsggsgfbja", "kmvdsknds", 11),
            new Person("dfgdf", "kmdskgfgnds", 11),
            new Person("gbdbgd", "kmdsfgfvknds", 11),
            new Person("bdbgdv", "drdrddd", 11),
            p1,
            p2
        );

        for (Person person : pepole) {
            System.out.println(person.getName()+"....."+person.getSurname());
        }
        System.out.println("************************");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
