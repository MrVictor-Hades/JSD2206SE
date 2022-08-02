package file;
import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./Demo.txt");

        String name = file.getName();

        // 获取当前file表示的文件的大小（单位是字母）
        long len = file.length();
        System.out.println("大小："+len+"个字节");

        boolean cw = file.canWrite();
        boolean cr = file.canRead();
        System.out.println("是否可写："+cw);
        System.out.println("是否刻度："+cr);
    }
}
