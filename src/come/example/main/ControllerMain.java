package come.example.main;

import come.example.frameWork.Controller;
import come.example.myProject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();

        //템플릿 메소드 사용
        c1.execute();
    }
}
