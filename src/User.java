public class User {
    private String email;
    private String pw;
    private String name;


    // 생성자 하나라도 만들면, 기본생성자 자동으로 안만들어짐
    public User(String name, String email) {
        //this 는 첫번째 줄에 있어야함
        this(name, email, null); //코드 중복 방지, 파라미터 많이 받아드리는 생성자를 this 생성자로 변경
    }

    //생성자 오버로딩
    public User(String name, String email, String pw) {
        this.email = email;
        this.pw = pw;
        this.name = name;
    }

    // getter & setter : 프로퍼티
    public String getEmail() {
        return email;
    }
    public String getPw() {
        return pw;
    }
    public String getName() {
        return name;
    }



    //민감한 정보는 포함 안되게!
    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
