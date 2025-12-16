package Strings;

public class Panagram {

    public static void main(String[] args) {

        String a = "The quick brown fox jumps over the lazy dog";
        String b = "";
        int count = 0;
        a = a.toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < a.length(); i++){


               if(b.contains(String.valueOf(a.charAt(i)))){
                   continue;
               }
               else {
                   b = b + a.charAt(i);
                   count++;
               }
           }


        System.out.println(count);
        if(count == 26){
            System.out.println("Panagram");
        }
        else {
            System.out.println("not a panagram");
        }

    }
}
