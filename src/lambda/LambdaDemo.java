package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {

        File dir = new File("./src/file");
//        File[] subs = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.getName().contains("t");
//            }
//        });


        File[] subs = dir.listFiles(f -> f.getName().contains("t"));



//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.getName().contains("t");
//            }
//        };
//
//        /** java 箭头函数基础语法  也叫 lambda 表达式*/
//
//        FileFilter filter1 = (File file) ->{
//            return file.getName().contains("t");
//        };
//        /**  参数类型可以忽略不写 */
//        FileFilter filter2 = (File file) ->{
//            return file.getName().contains("t");
//        };
//        /**  只有一个参数时 小括号可以不写 */
//        FileFilter filter3 = (file) -> file.getName().contains("t");
//        FileFilter filter4 = file -> file.getName().contains("t");



    }
}
