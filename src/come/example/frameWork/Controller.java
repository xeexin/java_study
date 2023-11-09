package come.example.frameWork;

/*
순서:
초기화 : 같은 코드
실행 : 다른 코드
마무리 : 같은 코드
 */
public abstract class Controller {

    //init(), close()는 사용자가 직접 호출하면 안됨! -> protected 접근제한자 사용
    //protected 같은 패키지 이거나 상속 받았을 경우 접근 가능!

    protected final void init() { //final이 붙으면 오버라이딩 금지됨
        System.out.println("초기화");
    }
    protected final void close() {
        System.out.println("마무리");
    }

    //매번 달라지는 실행 코드
    protected abstract void run();

    //순서에 따라 메소드 호출
    // 이것이 바로 템플릿 메소드
    public void execute() {
        this.init(); //this 생략가능
        this.run();
        this.close();
    }
}
