package collections.map;

import java.util.HashMap;
import java.util.Map;

public class AddAllToDefault {

    static <K, V> Map<K, V> newAttributeMap(Map<K, V>defaults, Map<K, V> overrides) {
        Map<K, V> result = new HashMap<K, V>(defaults);
        result.putAll(overrides);
        return result;
    }
}
