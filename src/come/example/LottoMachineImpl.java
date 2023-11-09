package come.example;

//인터페이스 구현 시, 인터페이스가 갖고 있는 메소드 반드시 구현해 줘야 함
public class LottoMachineImpl implements LottoMachine {
    private Balls[] balls;

    @Override

    public void SetBall(Balls[] ball) {
        this.balls = ball;

    }

    // Math.random() -> 0.0 ~ 1.0
    @Override
    public void mix() {
        for (int x = 0; x < 10000; x++) {
            int x1 = (int) (Math.random() * LottoMachine.MAX_BALL_CNT);
            int x2 = (int) (Math.random() * LottoMachine.MAX_BALL_CNT);

            if (x1 != x2) {
                Balls tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }
        }
    }

    @Override
    public Balls[] getBalls() {
        Balls[] ret = new Balls[LottoMachine.RETURN_BALL_CNT];
        for (int x = 0; x < LottoMachine.RETURN_BALL_CNT; x++) {
            ret[x] = balls[x];
        }
        return ret;
    }
}
