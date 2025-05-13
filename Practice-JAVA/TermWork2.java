public class TermWork2 {
    
    static boolean Anagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        for(int i =0;i<str1.length();i++){
            freq1[str1.charAt(i) - 'a']++;
        }
        for(int i =0;i<str2.length();i++){
            freq2[str2.charAt(i) - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq1[i] == freq2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcad";
        boolean result = Anagram(s1, s2);
        System.out.println(result);
    }

}
