package quizes.String;

import java.util.Arrays;
import java.util.List;

public class Join {

    public static void main(String[] args)
    {
        String[] strings = {"Java", "Python", "JavaScript", "HTML", "CSS"};

        List stringsList = Arrays.asList(strings);

        String languages = String.join("_", strings);

        String languagesFromList = String.join("_",stringsList);

        System.out.println(languages);

        System.out.println(languagesFromList);
    }

}
