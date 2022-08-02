package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (
                // 只有实现了 AutoCloseable 接口的类才可以在try（）中定义 .java IO 中所有的流均实现了该接口
                FileOutputStream fos = new FileOutputStream("fos.dat");
          ){
            fos.write(1);
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }
}
