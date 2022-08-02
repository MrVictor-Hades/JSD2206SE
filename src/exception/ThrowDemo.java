package exception;

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        try {
            p.setAge(20);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄"+p.getAge()+"岁");
    }
}
