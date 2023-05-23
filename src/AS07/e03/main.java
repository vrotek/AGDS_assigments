package AS07.e03;

import java.util.Random;

public class main {

    public static int h(String s){
        final int g = 31;
        int hash = 0;
        for(int i = 0; i < s.length(); i++){
            hash += g*hash +  s.charAt(i) ;
        }

        return hash;
    }



    public static int c(int x){
        return (x & 0x7FFFFFFF) % 5;
    }



    public static void main(String[] args) {
        String[] strings = {"ABC","A","B","Z","Some very long sentence that takes up lots and lots of space"};

        for (String el: strings) {
            System.out.println(el + " -> " + h(el) + " -> " + c(h(el)));
        }



    }
}
