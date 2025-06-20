public class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }


    public static Singleton getInstance() {
        if (instance == null) { 
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }


    public static void main(String[] args) {
        
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Are both instances same?\n " + (obj1 == obj2));
    }
}
