import java.util.Scanner;
class Program10 {
    private String strdata;

    Program10(String strdata){
        this.strdata = strdata;
    }

    boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch=='u' || ch == 'A' ||ch == 'E' || ch =='I' || ch == 'O' || ch=='U'){
            return true;
        }
        return false;
    }

    void countWord(){
        String words[] = strdata.split(" ");
        int count = 0;
        for(String word : words){
            char lastWord = word.charAt(word.length() - 1);
            char firstWord = word.charAt(0);
            if(isVowel(lastWord) && isVowel(firstWord)){
                count++;
            }
        }
        System.out.println("Number of words starting and ending with vowel are:" + count);
    }

    void placeWord(){
        String words[] = strdata.split(" ");
        String vwords = "";
        String owords = "";
        for(String word : words){
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if(isVowel(last) && isVowel(first)){
                vwords += word + " ";
            }
            else{
                owords += word + " ";
            }
        }
        String result = vwords + owords;
        System.out.println("Sentence with words starting and ending with a vowel at the beginning: ");
        System.out.println(result);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String strdata = sc.nextLine();
        Program10 ex = new Program10(strdata);
        ex.countWord();
        ex.placeWord();
        sc.close();
    }
}
