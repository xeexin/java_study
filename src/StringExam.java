public class StringExam {
    public static void main(String[] args) {
        String str1 = "Hello"; // 상수(변하지 않는 값) 취급
        String str2 = "Hello"; // str1의 hello를 가리킴
        String str3 = new String("Hello"); // 새로운 객체 생성 = 메모리 상에 새로 올라간다
        String str4 = new String("Hello");


        // '==' : 같은 것을 참조하는가
        if (str1 == str2) {
            System.out.println("str1 == str2");
        }

        if (str1 == str3) {
            System.out.println("str1 == str3");
        }

        if (str3 == str4) {
            System.out.println("str3 == str4");
        }

        // 메모리를 적게 쓰는 것이 좋고 같은 것을 참조하는 문자열을 확인해야함으로 new 사용 안쓰는게 좋다.
        // 그럼 값이 같은걸 비교할때 어떻게 하는가

        if (str1.equals(str3)) {
            System.out.println("str1 equals str3");
        }

        // 추출 : option + command + v
        String s = str1.toUpperCase();
        System.out.println(s);

        String substring = str1.substring(3);
        System.out.println(substring);

    }
}
