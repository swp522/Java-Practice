import java.util.Comparator;

public class Foreigner extends Person {

    private String country;

    public Foreigner(){
        this("", 0, 0.0, 0.0, Gender.FEMALE, "");
    }

    public Foreigner(String name, int age, double weight, double height, Gender gender, String country){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;

        this.country = country;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void callPerson(){
        getName();
        setName(name);
        getAge();
        setAge(age);
        getWeight();
        setWeight(weight);
        getHeight();
        setHeight(height);
        getGender();
        setGender(gender);
    }

    public String toString(){
        return String.format("%s,%d,%2f,%2f,%s,%s", name, age, weight, height, gender, country.toString());
    }

    public static Comparator<Foreigner> CountryComparator = new Comparator<Foreigner>() {
        @Override
        public int compare(Foreigner f1, Foreigner f2) {
            String country1 = f1.getCountry();
            String country2 = f2.getCountry();

            return country1.compareTo(country2);
        }
    };
}