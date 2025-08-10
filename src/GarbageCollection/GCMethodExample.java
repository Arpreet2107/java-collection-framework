package GarbageCollection;

public class GCMethodExample {
    public static void createObjects() {
        GCMethodExample obj1 = new GCMethodExample();
        GCMethodExample obj2 = new GCMethodExample();
        // After method completes, obj1 and obj2 are no longer reachable
    }

    public static void main(String[] args) {
        createObjects();

        // Request GC
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Objects created inside method are eligible for GC after method finishes.");
    }
}
