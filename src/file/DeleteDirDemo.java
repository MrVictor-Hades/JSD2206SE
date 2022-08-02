package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir  = new File("./a/b/c/d/e/f/g/h");
        if (dir.exists()){
            dir.delete();
            System.out.println("该目录已删除");
        }else {
            System.out.println("该目录不存在");
        }
    }
}
