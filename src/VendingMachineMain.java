public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product1 = vm1.pushProductBtn(100);
        System.out.println(product1);

        String product2 = vm2.pushProductBtn(200);
        System.out.println(product2);


        //static 메소드는 클래스 이름에 붙는 것이 관례
        //이텔릭체임
        //VendingMachine.printVerion();


    }
}
