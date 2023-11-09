package come.example;


public interface LottoMachine {
    // 인터페이스의 필드는 모두 public static 함으로 생략가능
    // = 메모리에 인스턴스 안만들어도 올라간다
    int MAX_BALL_CNT = 45;
    int RETURN_BALL_CNT = 6;


    // 인터페이스 추상 메소드만 가능하기 때문에 abstract 생략가능
    public void SetBall(Balls[] ball); // 45 ball

    public void mix();

    public Balls[] getBalls(); //return 6 ball
}
