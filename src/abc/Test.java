package abc;


public class Test extends A{
    public String printStr(String input){
        return input;
    }

    public static void main(String[] args) {
        A a = new Test();
        System.out.println(a.printStr());
        System.out.println(a.printStr("B"));
    }
}





