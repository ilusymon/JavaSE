package atguigu.day10homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/4 23:20
 */
public class Test {
    public static void main(String[] args) {
        Apple green = new Apple(5, "青色");
        Apple red = new Apple(3, "红色");
        Worker worker = new Worker();
        worker.pickApple(new CompareBig(), green, red);
        worker.pickApple(new CompareColor(), green, red);
    }
}
