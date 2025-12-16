package Strings;

public class Sort {

    public static void main(String[] args) {

        String s1 = "GeekforGeeks";
        for (int i = 0; i < s1.length(); i++){
            int a = s1.codePointAt(i);
            char ch = s1.charAt(i);
            System.out.println(ch+": "+a);
        }
    }
}
