import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "Value 1");
        map.put(key2, "Value 2");

        System.out.println("Map before nulling keys: " + map);

        // Remove strong references to key1 and key2
        key1 = null;
        key2 = null;

        // Suggest to JVM to run garbage collector
        System.gc();

        // Wait for GC to run
        Thread.sleep(1000);

        // Entries whose keys were weakly referenced are removed
        System.out.println("Map after GC and nulling keys: " + map);
    }
}

