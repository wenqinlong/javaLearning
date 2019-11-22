class BaseClass {
    public BaseClass() {}
    {
        System.out.println("I’m BaseClass class");
    }
    static {
        System.out.println("static BaseClass");
    }
}
public class Base extends BaseClass {
    public Base() {}
    {
        System.out.println("I’m Base class");
    }
    static {
        System.out.println("static Base");
    }
    public static void main(String[] args) {
        new Base();
    }
}

//父类静态代码块 ->子类静态代码块 ->父类非静态代码块 -> 父类构造函数 -> 子类非静态代码块 -> 子类构造函数
//简单记忆线程安全的集合类： 喂！SHE！  喂是指  vector，S是指 stack， H是指    hashtable，E是指：Eenumeration 