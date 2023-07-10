package collections.exercises;

import java.util.*;

public class Trimmer {
    public List<String> trim(List<String> l){
        for(String s : l){
            s.trim();
            System.out.format("\"%s\"%n", s);
        }
        return l;
    }

    public List<String> trim3(List<String> l) {

        for (ListIterator<String> iterator = l.listIterator(); iterator.hasNext(); ){
            iterator.set(iterator.next().trim());
    }

        return l;
    }

    public Set<String> trimSet(Set<String> s){

        for(Iterator<String> ss = s.iterator(); ss.hasNext() ; ){

            String trim = ss.next().trim();
            ss.remove();
            s.add(trim);

        }

        return s;
            }


    static void trim2(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {

        List<String> l = Arrays.asList(" red ", " white ", " blue ");
        Trimmer trimmer = new Trimmer();
        trimmer.trim(l);
        System.out.println("l1: ");
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }

        List<String> l2 = Arrays.asList(" red ", " white ", " blue ");
        trimmer.trim2(l2);
        System.out.println("l2: ");
        for (String s : l2) {
            System.out.format("\"%s\"%n", s);
        }


//        Trimmer trimmer = new Trimmer();
//        Arrays.asList(args).stream().forEach(System.out::println);
//        List<String> s = trimmer.trim(Arrays.asList(args));
//        s.stream().forEach(System.out::println);

    }
}
