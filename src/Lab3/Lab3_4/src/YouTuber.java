public class YouTuber extends Person {

    private String channelName;
    private int subscribers;

    public YouTuber(){
        this("", 0, 0.0, 0.0, Gender.FEMALE,"", 0 );
    }

    public YouTuber(String name, int age, double weight, double height, Gender gender,
                    String channelName, int subscribers){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;

        this.channelName = channelName;
        this.subscribers = subscribers;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setchannelName(String channelName) {
        this.channelName = channelName;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
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
        return String.format("%s,%d,%2f,%2f,%s,%d,%s",
                name, age, weight, height, gender, subscribers, channelName.toString());
    }
}
