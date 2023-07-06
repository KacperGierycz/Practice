package collections.map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Validate {

    static <K, V> boolean validate(Map<K, V> attrMap, Set<K> requiredAttrs, Set<K>permittedAttrs) {
        boolean valid = true;
        Set<K> attrs = attrMap.keySet();

        if (! attrs.containsAll(requiredAttrs)) {
            Set<K> missing = new HashSet<K>(requiredAttrs);
            missing.removeAll(attrs);
            System.out.println("Missing attributes: " + missing);
            valid = false;
        }
        if (! permittedAttrs.containsAll(attrs)) {
            Set<K> illegal = new HashSet<K>(attrs);
            illegal.removeAll(permittedAttrs);
            System.out.println("Illegal attributes: " + illegal);
            valid = false;
        }
        return valid;

//        Set<KeyType>commonKeys = new HashSet<KeyType>(m1.keySet());
//        commonKeys.retainAll(m2.keySet());
    }



}

