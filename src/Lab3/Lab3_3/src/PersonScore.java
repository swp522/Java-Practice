import java.lang.Comparable;
import java.util.Comparator;

public class PersonScore implements Comparable<PersonScore>{
    private String name;
    private String subject;
    private String score;

    public PersonScore() {
        this(null, null, null);
    }

    public PersonScore(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String toString() {
        return String.format("%s,%s,%s", name, subject, score);
    }

    @Override
    public int compareTo(PersonScore s){
        return name.compareTo(s.name);
    }

    public static Comparator<PersonScore> SubjectComparator = new Comparator<PersonScore>() {
        @Override
        public int compare(PersonScore s1, PersonScore s2) {
            String subject1 = s1.getSubject();
            String subject2 = s2.getSubject();

            return subject1.compareTo(subject2);
        }
    };

    public static Comparator<PersonScore> ScoreComparator = new Comparator<PersonScore>() {
        @Override
        public int compare(PersonScore s1, PersonScore s2) {
            String score1 = s1.getScore();
            String score2 = s2.getScore();

            return score1.compareTo(score2);
        }
    };
}