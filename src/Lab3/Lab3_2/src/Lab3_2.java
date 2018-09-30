/*
<응용컴퓨터공학과 32141762 박성원>
1.Person클래스를 상속받은YouTuber 클래스를 작성하라.
 1.String channelName, intsubscribers 멤버를 갖는다.
 2.생성자/getter/setter/toString메소드를 작성하라.
2.Person클래스를 상속받은Foreigner 클래스를 작성하라.
 1.String country 멤버를 갖는다.
 2.생성자/getter/setter/toString 메소드를 작성하라.
3.UserInput클래스에서는 사용자로부터 YouTuber, Foreigner을 입력받는 메소드를 포함한다.
4.Lab3_2 클래스에서는 YouTuber, Foreigner 배열에 사용자 입력을 통하여 데이터를 넣고, 사용자 입력이 완료되면 전체를 출력하라.
5.AddressBook클래스를 상속받은 본인이 원하는 클래스를 추가로 작성하고, Lab3_2에서 테스트한다.
 */
public class Lab3_2 {
    public static void main(String[] args){

        YouTuber[] youtubers = new YouTuber[2];     // 배열 크기[2] 설정
        for (int i=0; i < 2; i++) {
            youtubers[i] = UserInput.getYouTuber();
        }
        for (YouTuber y : youtubers) {
            System.out.println(y);
        }                                      // YouTuber 정보 입력받고 출력

        do {
            Foreigner f = UserInput.getForeigner();
            System.out.println(f);             // Foreigner 정보 입력받고 출력
        } while(!UserInput.getExitKey());      // q 누르면 Exit

        do {
            School s = UserInput.getSchool();
            System.out.println(s);             // School 정보 입력받고 출력
        } while(!UserInput.getExitKey());      // q 누르면 Exit

        System.out.println("끝");
    }
}