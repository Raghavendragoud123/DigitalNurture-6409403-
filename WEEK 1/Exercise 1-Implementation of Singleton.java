public class Singleton {
    // Private static variable to hold the single instance
    private static volatile Singleton instance = null;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }


    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Verify that obj1 and obj2 are the same
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Are both instances same?\n " + (obj1 == obj2));
    }
}
