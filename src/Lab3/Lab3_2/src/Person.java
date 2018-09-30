public class Person {

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
}