package file;

import java.awt.*;
import java.io.File;
import java.io.FileFilter;

/**
 * 获取./src/file目录中所有名字含有 t 的文件
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File("./src/file");

        if (dir.isDirectory()){
            /** 使用匿名内部类创建一个文件过滤器 */
            FileFilter filter = new FileFilter() {
                /** 重写 accept 方法（accept 接受）*/
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("t");
                }
            };
            File[] subs = dir.listFiles(filter);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }


    }
}
