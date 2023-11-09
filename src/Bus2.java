public class Bus2 extends Car2 {
    public Bus2() {
        super("BUS");
        System.out.println("Bus2 기본 생성자");
    }

    // 추상 메소드 반드시 오버라이딩 해줘야 함
    @Override
    public void run() {
        System.out.println("후륜 구동으로 달리다");

    }
}
