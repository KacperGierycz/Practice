package collections.map;

import java.util.*;
import java.util.stream.Collectors;


public class StreamsStudents {

    List<Student> students = Arrays.asList(new Student[]{
        new Student("Hektor", 2),
new Student("Achilles", 5)});

    public Map<Boolean, List<Student>> getPartitionForPassingStudents(){
        final Integer PASS_THRESHOLD = 3;
        Map<Boolean, List<Student>> passingFailing = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
        return passingFailing;
    }

    public void print(Map<?,?> c) {
        System.out.println(c);

    }

    public static void main(String[] args) {

        StreamsStudents ss = new StreamsStudents();
        ss.print((Map<?,?>) ss.getPartitionForPassingStudents());

    }


}
