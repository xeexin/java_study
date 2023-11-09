package come.example.myProject;

import come.example.frameWork.Controller;

public class FirstController extends Controller { //상속 받았기 때문에 접근 가능
    @Override
    public void run() {
        System.out.println("1.나만 별도로 동작하는 코드");
    }


}
