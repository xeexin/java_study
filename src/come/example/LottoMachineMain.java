package come.example;

public class LottoMachineMain {
    public static void main(String[] args) {
        Balls[] balls = new Balls[LottoMachine.MAX_BALL_CNT];
        for (int i = 0; i < LottoMachine.MAX_BALL_CNT; i++) {
            balls[i] = new Balls(i + 1);
        }

        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.SetBall(balls);
        lottoMachine.mix();
        Balls[] ret = lottoMachine.getBalls();

        for (int x = 0; x < LottoMachine.RETURN_BALL_CNT; x++) {
            System.out.println(ret[x].getNum());
        }
    }
}
