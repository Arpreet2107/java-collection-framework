package GarbageCollection;

public class ReqGCwithFinalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collection performed by JVM for this object.");
    }

    public static <GarbageCollectionDemo> void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc();

        // Delay to allow GC to complete (not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}
