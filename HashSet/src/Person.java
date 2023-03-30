public class Person {
    private String name;
    private String surname;
    private int age;
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return this.getName()==p.name && this.getSurname()==p.surname && this.getAge()==p.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.surname.hashCode()+this.age;
    }
}