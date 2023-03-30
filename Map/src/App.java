import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Map<String, Person> pepole = new HashMap<String,Person>();
        // Person p1 = new Person("andrea", "andrea", "fbdfsjhxzhf");
        // pepole.put(p1.getCf(), p1);
        // Person p2 = new Person("dario", "allrmi", "gfhdfgd");
        // pepole.put(p2.getCf(), p2);
        // Person p3 = new Person("serena", "franchi", "sgsfrwewre");
        // pepole.put(p3.getCf(), p3);
        // Person p4 = new Person("herb", "keison", "kmtujtyjt");
        // pepole.put(p4.getCf(), p4);
        // Person p5 = new Person("sony", "cui", "sfasfad");
        // pepole.put(p5.getCf(), p5);

        // //System.out.println(pepole.get("gfhdfgd").getName());
        // //System.out.println("**********************");
        // for (String key : pepole.keySet()) {
        //     //System.out.println(pepole.get(key).getName());
        // }
        // //System.out.println("**********************");

        // pepole.remove("gfhdfgd");
        // for (String key : pepole.keySet()) {
        //     System.out.println(pepole.get(key).getName());
        // }
        //******************* */
        Map<PepoleKey, Person> pepole2 = new HashMap<>();
        Person pp1 = new Person("andrea", "andrea", "fbdfsjhxzhf");
        Person pp2 = new Person("dario", "allrmi", "gfhdfgd");

        PepoleKey pk1 = new PepoleKey(pp1.getCf(), 10);
        pepole2.put(pk1, pp1);
        PepoleKey pk2 = new PepoleKey(pp1.getCf(), 20);
        pepole2.put(pk2, pp2);

        for (PepoleKey key : pepole2.keySet()) {
            System.out.println(pepole2.get(key).getName());
        }    
    }
}
