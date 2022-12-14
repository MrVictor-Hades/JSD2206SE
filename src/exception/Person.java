package exception;

/**
 * 异常的抛出
 * 使用throw关键字可以在一个方法中主动对外抛出一个异常给方法调用者解决.
 * 通常下述情况我们会主动对外抛出异常:
 * 1:当前方法遇到一个异常,但是该异常不应当被当前方法处理时可以主动抛出给调用者
 * 2:程序可以正常运行,但是已经不满足该方法解决的实际业务问题时,可以将其当做一个
 *   错误抛出给调用者.
 *
 * 本案例演示的就是第二种情况
 */
public class Person {
    private  int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age<0 || age>100){
            /*throw new RuntimeException("年龄不合法");*/
            // throw new Exception("年龄不合法");
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }


}
