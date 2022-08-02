package exception;

/** JAVA 异常处理机制
 * JAVA 中所有的异常的顶级超类为：Throwable
 * */

public class    TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String str = null;
//            System.out.println(str.length());

            String str = "";
            System.out.println(str.charAt(0));
        }/*catch (NullPointerException e){
            System.out.println("出现了空指针，并解决了。");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了字符串下标越界，并解决了");
        }*/
        catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现空指针货字符串下标越界并解决了");
        }catch (Exception e){
            System.out.println("通用解决办法");

        }
        System.out.println("程序结束了");

    }
}
