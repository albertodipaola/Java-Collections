import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        TreeMap<PepoleKey, Person> pepole = new TreeMap<>(new PepoleKeyComparator());
        Person p1 = new Person("zar", "wer", "bhskdjsdhfgi");
        pepole.put(new PepoleKey(p1.getCf(), 4), p1);
        Person p2 = new Person("kaj", "sandri", "sbdsokhi");
        pepole.put(new PepoleKey(p2.getCf(), 8), p2);

        for (PepoleKey key : pepole.keySet()) {
            System.out.println(pepole.get(key).getName());
        }

    }
}
