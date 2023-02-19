import java.util.*;
class RevStr{
    public static void main(String [] args){
        StringBuilder str = new StringBuilder("Biswarup");
        for(int i=0;i<str.length()/2;i++){
            char end = str.charAt(str.length()-1-i);
            char front = str.charAt(i);
            str.setCharAt(i,end);
            str.setCharAt(str.length()-1-i,front);
        }
        System.out.println(str);
    }
}