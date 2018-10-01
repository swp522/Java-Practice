public class School extends AddressBook{

    private String schoolname;
    private int grade;

    public School(){
        this("", "", "" ,"", 0);
    }

    public School(String name, String address, String phonenumber, String schoolname, int grade){
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;

        this.schoolname = schoolname;
        this.grade = grade;
    }

    public String getSchoolName(){
        return schoolname;
    }

    public void setSchoolname(String schoolname){
        this.schoolname = schoolname;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void callAddressBook(){
        getName();
        setName(name);
        getAddress();
        setAddress(address);
        getPhonenumber();
        setPhonenumber(phonenumber);
    }

    public String toString(){
        return String.format("%s,%s,%s,%d,%s", name, address, phonenumber, grade, schoolname.toString());
    }
}