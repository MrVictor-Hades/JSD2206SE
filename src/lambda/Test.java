package lambda;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles(file -> file.getName().contains("o"));
        for (int i=0;i< subs.length;i++){
            System.out.println(subs[i]);
        }
    }
}
