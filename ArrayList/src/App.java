import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> pepole = new ArrayList<>();

        pepole.add(new Person("alberto", "rossi", 23));
        pepole.add(new Person("giorgio", "marza", 22));
        pepole.add(new Person("valeria", "sammarco", 20));
        pepole.add(new Person("giorgia", "rossi", 30));

        for (Person person : pepole) {
            System.out.println(person.getName()+"....."+person.getSurname());
        }
        System.out.println("*******************************");

        Person p = new Person("sofi", "queen", 20);
        System.out.println(pepole.contains(p));
        pepole.add(p);
        System.out.println(pepole.contains(p));
        System.out.println("*******************************");

        ArrayList<Person> pepole2 = new ArrayList<>();
        pepole.add(new Person("giorgio", "marza", 22));
        pepole.add(new Person("valeria", "sammarco", 20));
        System.out.println(pepole.containsAll(pepole2));
        System.out.println("*******************************");

        pepole2.removeAll(pepole);
        for (Person person : pepole) {
            System.out.println(person.getName()+"....."+person.getSurname());
        }
        System.out.println("*******************************");

        System.out.println(pepole.size());
        System.out.println(pepole.get(3).getName());
    }
}
