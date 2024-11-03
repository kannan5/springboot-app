package learn_spring_framework_01.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Down");
    }

    public void right(){
        System.out.println("Go Right");
    }

    public void left(){
        System.out.println("Go Left");
    }
}
