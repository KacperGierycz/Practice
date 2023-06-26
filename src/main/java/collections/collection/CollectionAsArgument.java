package collections.collection;

import collections.set.Person;

import java.util.*;

public class CollectionAsArgument {

    List<String> firstOfList = Arrays.asList("John","Lisa","Anna","Anna");

    Collection<String> c=new ArrayList<>(firstOfList);

    HashSet<String> b = new HashSet<>(c);



}
