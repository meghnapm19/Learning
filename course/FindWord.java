public class FindWord {
    public static void main(String[] args) {
        String sentence = "Hi My name is Meghna";
        String wordtofind = "Meghna";

        if(sentence.contains(wordtofind)){
            System.out.println(wordtofind +  " is present");
        }
        else{
            System.out.println("word is not present");
        }
    }
}
