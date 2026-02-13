package OOP.blocks;

public class Cat {

    public static String name;

    public Cat() {
        System.out.println("Constructor called");
    }

    //non-static initializer block
    {
        System.out.println("Non-static block called");
    }

    //static initializer block
    static {
        System.out.println("Static block called");
    }
}
