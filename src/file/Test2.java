package file;

import java.io.File;
import java.io.FileFilter;

public class Test2 {
    public static void main(String[] args) {
        File dir = new File("./src/file");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.startsWith("D");
                }
            };
            File[] subs = dir.listFiles(filter);
            for (int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
