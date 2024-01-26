public class PermutationsOfString {

    public static void permutations(String str, String ans){
        //Base Case
        if(str.length() == 0){
            System.out.println(ans);
        }
        //Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" if i=c ---> curr = c
            //remove : "ab" + "de" --> "abde"
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr,ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        permutations(str,"");
    }
}
