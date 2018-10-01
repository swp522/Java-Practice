public class PersonFactory {
    public static Person getInstance(PersonMode mode){
        switch (mode){
            case PERSON:
                Person person = new Person();
                return person;
            case YOU_TUBER:
                YouTuber youtuber = new YouTuber();
                return youtuber;
            case FOREIGNER:
                Foreigner foreigner = new Foreigner();
                return foreigner;
            default:
                return null;
        }
    }
}
