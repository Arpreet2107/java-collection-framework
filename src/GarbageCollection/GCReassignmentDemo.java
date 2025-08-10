package GarbageCollection;

public class GCReassignmentDemo {
    String name;

    public GCReassignmentDemo(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is garbage collected.");
    }

    public static void main(String[] args) {
        GCReassignmentDemo objA = new GCReassignmentDemo("Object A");
        GCReassignmentDemo objB = new GCReassignmentDemo("Object B");

        objA = objB;  // The original Object A becomes unreachable and eligible for GC

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main.");
    }
}
