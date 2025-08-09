package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int maxSize;

    public LRUCache(int maxSize) {
        super(maxSize, 0.75f, true); // true = access order
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    // Example usage
    public static void main(String[] args) {
        LRUCache<Object, String> cache = new LRUCache<Object, String>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache); // {1=A, 2=B, 3=C}

        cache.get(1);              // Access entry 1, now entry 2 is eldest
        cache.put(4, "D");         // Evicts entry 2, as it's least recently used
        System.out.println(cache); // {3=C, 1=A, 4=D}
    }
}
