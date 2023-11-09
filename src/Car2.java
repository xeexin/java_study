public abstract class Car2 {
    public Car2(String name) {
        super(); // 자동으로 들어감.
        System.out.println("Car2 생성자 호출");
    }

    //추상메소드. run()이라는 메소드가 필요하다
    // run()은 근데 다 다르게 동작한다.
    public abstract void run();
}
