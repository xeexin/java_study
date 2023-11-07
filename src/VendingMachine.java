public class VendingMachine {
    //field  (가지는 것들) 예) 동전통, 상품 케이스
    //constructor 생성자
    //method


    // 메소드 선언
    // [접근제한자] [static] 리턴타입 메소드이름([매개변수])
    public String pushProductBtn(int menuId) {
        System.out.println(menuId + "를 전달");
        return "coke";
    }

    public static void printVerion() {
        System.out.println("print Version");

    }

}
