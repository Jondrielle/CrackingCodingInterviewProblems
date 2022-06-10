import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args){
        System.out.println(UniqueString("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
        System.out.println(UniqueString("ewjwaw"));
        System.out.println(UniqueString("absoethyu./20481?"));
        System.out.println(UniqueString("12345678900987162534"));
        System.out.println(UniqueString("dksolqpa][{}"));
    }

    public static boolean UniqueString(String string) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        boolean notUnique = false;

        if (string.length() > 128);
        else{
            for(int i = 0; i < string.length();i++){
                if(hashMap.containsKey(string.charAt(i))){
                    return false;
                }
                else
                    hashMap.putIfAbsent(string.charAt(i),1);
            }
            notUnique = true;
        }
        return notUnique;
    }
}
