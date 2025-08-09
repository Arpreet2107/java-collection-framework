package WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<Object, String> cache = new WeakHashMap<>();

        Object userSession1 = new Object();
        Object userSession2 = new Object();

        // Add to cache
        cache.put(userSession1, "User Data 1");
        cache.put(userSession2, "User Data 2");

        System.out.println("Cache size before GC: " + cache.size());

        // Access data
        System.out.println("Session1 data: " + cache.get(userSession1));

        // Remove strong references
        userSession1 = null;

        // Suggest garbage collection
        System.gc();
        Thread.sleep(1000);

        System.out.println("Cache size after GC: " + cache.size());

        // Remaining entries
        cache.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
