public class MathBeanTest {
    public static void main(String[] args) {
        MathBean mathBean = new MathBean(); //heap memory
        mathBean.printClassBean();
        mathBean.printNumber(1000);
        int x = mathBean.getOne();
        System.out.println(x);
        int ret = mathBean.plus(10, 20);
        System.out.println(ret);

    }
}
