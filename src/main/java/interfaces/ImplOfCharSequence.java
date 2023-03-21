package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplOfCharSequence implements java.lang.CharSequence{
    LinkedList<Character> charList;

    ImplOfCharSequence(String s){
        charList = new LinkedList<Character>();
        for (char c : s.toCharArray()){
            charList.add(c);
        }
    }
    @Override
    public int length() {
        return charList.size();
    }

    @Override
    public char charAt(int index) {
        return charList.get(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new ImplOfCharSequence(charList.subList(start, end).toString());
    }

    public String getRevers(){
        LinkedList<Character> revertCharList = new LinkedList<Character>();
        System.out.println(length());
        for(Character c : charList){

            revertCharList.addFirst(c);
        }
        System.out.println(revertCharList.size());
        System.out.println(revertCharList);
        return revertCharList.toString();
    }

    public static void main(String[] args) {
        ImplOfCharSequence n1 = new ImplOfCharSequence("Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards. Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods.");
        System.out.println(n1.getRevers());


    }

}
