interface P1 {
    
    int CONSTANT_P1 = 10;

    
    void methodP1();
}


interface P2 {
    
    int CONSTANT_P2 = 20;

    
    void methodP2();
}


interface P12 extends P1, P2 {
    
}


class Q implements P12 {
    
    public void methodP1() {
        System.out.println("Method from P1");
    }

    
    public void methodP2() {
        System.out.println("Method from P2");
    }
}

public class p8 {
    public static void main(String[] args) {
        
        Q q = new Q();

        
        q.methodP1();
        q.methodP2();

        
        System.out.println("Constant from P1: " + P1.CONSTANT_P1);
        System.out.println("Constant from P2: " + P2.CONSTANT_P2);
    }
}
