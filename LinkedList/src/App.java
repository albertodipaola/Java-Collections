import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Person> pepole = new LinkedList<>();

        pepole.addLast(new Person("Andrea", "MIninni", 29));
        pepole.addLast(new Person("cosimo", "lorenzi", 19));
        pepole.addLast(new Person("gianna", "fragola", 20));
        for (Person person : pepole) {
            System.out.println(person.getName()+"......"+person.getSurname());
        }
        System.out.println("*******************************");

        pepole.addFirst(new Person("giovanni", "ballerini", 26));
        pepole.addLast(new Person("francesca", "remi", 44));
        pepole.add(3, new Person("carlo", "esposito", 33));
        for (Person person : pepole) {
            System.out.println(person.getName()+"......"+person.getSurname());
        }
        System.out.println("*******************************");

        pepole.removeFirst();
        pepole.removeLast();
        pepole.remove(1);
        for (Person person : pepole) {
            System.out.println(person.getName()+"......"+person.getSurname());
        }
        System.out.println("*******************************");
        System.out.println(pepole.getFirst().getName());
        System.out.println(pepole.getLast().getName());

    }
}
