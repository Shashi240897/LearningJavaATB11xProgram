package Strings;

public class SubStringOfString {

    public static void main(String[] args) {
        subString("cat is good");
    }

    public static void subString(String name){


        for (int i = 0; i < name.length(); i++){
            String sub = " ";
            for (int j = i; j < name.length(); j++){

                sub = sub + name.charAt(j);
                System.out.println(sub);
            }
            System.out.println();
        }
    }
}
