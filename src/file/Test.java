package file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        for (int i=0;i<=100;i++){
            File file = new File("./test"+i+"txt");
            if (file.exists()){
                file.delete();
                System.out.println("该文件已删除");
            }else {

                System.out.println("不存在");
            }
        }



    }
}
