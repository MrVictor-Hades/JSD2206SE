package abc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSWActivity {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("activity.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        String line = "猛虎龟山苍龙退，为何还要那么累！"+System.getProperty("line.separator");
        osw.write(line);
        osw.write("有些人关系变了备注还未来得及改这是为什么呢");
        System.out.println("写出完毕");
        osw.close();


        /*FileOutputStream fos = new FileOutputStream("activity.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        String line = "猛虎龟山苍龙退，为何还要那么累！";
        osw.write(line);
        osw.write("一把弯弓射大鹏");
        System.out.println("写出完毕");
        osw.close();*/

        /*FileOutputStream fos = new FileOutputStream("activity.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        String line = "猛虎龟山苍龙退，为何还要那么累！";
        osw.write(line);
        osw.write("疯狂语言大实话");
        System.out.println("写出完毕");
        osw.close();*/

    }
}
