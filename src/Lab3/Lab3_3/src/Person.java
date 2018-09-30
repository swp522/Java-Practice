import java.lang.Comparable;
import java.util.Comparator;

public class Person implements Comparable<Person>{

    String name;
    int age;
    double weight;
    double height;
    Gender gender;

    public Person(){
        this("", 0, 0.0, 0.0, Gender.FEMALE);
    }

    public Person(String name, int age, double weight, double height, Gender gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString(){
        return String.format("%s,%d,%2f,%2f,%s", name, age, weight, height, gender.toString());
    }

    @Override
    public int compareTo(Person p){
        return name.compareTo(p.name);
    }

    public static Comparator<Person> AgeComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getAge() - p2.getAge();
        }
    };

    public static Comparator<Person> WeightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            double delta = p1.getWeight() - p2.getWeight();
            if(delta > 0.00001) return 1;
            if(delta < -0.00001) return -1;
            return 0;
        }
    };

    public static Comparator<Person> HeightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            double delta = p1.getHeight() - p2.getHeight();
            if(delta > 0.00001) return 1;
            if(delta < -0.00001) return -1;
            return 0;
        }
    };
}