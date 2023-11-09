public class Car2Exam {
    public static void main(String[] args) {
       //  Car2 c = new Car2("HEEJIN") {};  -> 추상클래스 인스턴스 불가
        Bus2 b = new Bus2();
        b.run();
        System.out.println("-------------------");
        SportsCar s = new SportsCar("Sports Car");
        s.run();
        System.out.println("-------------------");
        Car2[] arr = new Car2[2];
        arr[0] = new Bus2();
        arr[1] = new SportsCar("Sports Car");
        for (Car2 c : arr) {
            c.run();
            System.out.println("-------------------");
        }
    }
}
