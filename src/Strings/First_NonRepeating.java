package Strings;

public class First_NonRepeating {

    public static void main(String[] args) {
        String s = "geekforfgeeks";

        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for (int j = 0; j < s.length(); j++){

                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(s.charAt(i)+" is the first non repeating character in the given word");
                break;
            }
        }
    }
}
