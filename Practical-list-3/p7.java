interface Hello {
    void HELLO();
}

interface World {
    void WORLD();
}

class Hello_World implements Hello, World {
    public void HELLO() {
        System.out.println("Hello");
    }

    public void WORLD() {
        System.out.println("World");
    }
}

public class p7 {
    public static void main(String[] args) {
        Hello_World obj = new Hello_World();
        obj.HELLO();
        obj.WORLD();
    }
}