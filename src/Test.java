import java.util.Date;

/**
 * @author JLW
 * @create 2021-05-12 10:51
 */
public class Test extends Date {
    public static void main(String[] args) {

        new Test().test();

    }

    public void test(){
        System.out.println(getClass().getSuperclass().getName()); // java.util.Date
        System.out.println(super.getClass().getName()); // Test
    }

}
