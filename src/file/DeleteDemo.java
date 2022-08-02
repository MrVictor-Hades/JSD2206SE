package file;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {

        // 在相对路径中，“./” 可以不写，默认就是从 “./” 开始
        File file = new File("test.txt");
        if (file.exists()){
            file.delete();
            System.out.println("已删除");
        }else {
            System.out.println("该文件不存在");
        }

    }
}
