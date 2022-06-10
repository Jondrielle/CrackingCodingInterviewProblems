import java.util.HashMap;

public class Permutation {

    public static void main(String[] args) {
        // write your code here
        System.out.println(CheckPermutation("ane","wkwda"));
        System.out.println(CheckPermutation("ane","esk"));
        System.out.println(CheckPermutation("ane","Ane"));
        System.out.println(CheckPermutation("1dieks","s1idke"));
    }

    public static boolean CheckPermutation(String stringOne, String stringTwo){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int incrementValue = 1;

        stringOne = stringOne.toLowerCase();
        stringTwo = stringTwo.toLowerCase();

        if(stringOne.length() != stringTwo.length())
            return false;
        else {
            for (int i = 0; i < stringOne.length(); i++){
                if(hashMap.containsKey(stringOne.charAt(i))){
                    int newValue = hashMap.get(stringOne.charAt(i)) + incrementValue;
                    hashMap.replace(stringOne.charAt(i),newValue);
                }
                else
                    hashMap.putIfAbsent(stringOne.charAt(i),1);
            }
            for(int i = 0; i < stringTwo.length(); i++){
                if(hashMap.containsKey(stringTwo.charAt(i))){
                    int newValue = hashMap.get(stringTwo.charAt(i)) - incrementValue;
                    if(newValue == 0){
                        hashMap.remove(stringTwo.charAt(i));
                    }
                    else
                        hashMap.replace(stringTwo.charAt(i),newValue);
                }
                else
                    return false;
            }
            if(hashMap.isEmpty())
                return true;
            else
                return false;
        }
    }
}
