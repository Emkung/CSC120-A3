import java.util.*;
/**
 * this class creates a chat bot that either mirrors the user words or responds with a random answer for a certain amount of rounds answered by the user
 */
class Conversation {
    /**
    * this is the method that produces the scanner objects for user inputs and produces robot created answers
    *@param arguments the string arrays accepted into the command prompt
    */
    public static void main(String[] arguments) {
        ArrayList < String > transcript = new ArrayList < String > ();
        //created array list to store transcript
        Scanner rounds = new Scanner(System.in);
        //scanner to input rounds
        String question = "How many rounds?";
        System.out.println(question);
        int rounds1 = rounds.nextInt();
        transcript.add(question);
        transcript.add(Integer.toString(rounds1));
        Random r = new Random();
        String question2 = "\nHi there!  What's on your mind?";
        System.out.println(question2);
        transcript.add(question2);
        for (int i = 0; i < rounds1; i++) {
            Scanner input = new Scanner(System.in);
            //scanner to input answers 
            String thoughts1 = input.nextLine();
            String thoughts3 = thoughts1;
            String[] randomResponse = {
                "mhm",
                "that's so interesting!",
                "I agree",
                "hmmmm"
            };
            String[] t_chars = thoughts3.split("");
            //Punctuation to identify in the answer 
            String[] isPunctuation = {
                ",",
                ".",
                ";",
                "!",
                "?"
            };
            List < String > t_chars_list = new LinkedList < String > (Arrays.asList(t_chars));
            List < String > isPunctuation_list = new LinkedList < String > (Arrays.asList(isPunctuation));
            List < Integer > indexes = new ArrayList < Integer > ();
            //loops through and get rid of puntuation 
            int counter2 = 0;
            for (int j = 0; j < t_chars_list.size(); j++) {
                for (int c = 0; c < isPunctuation_list.size(); c++) {
                    if (t_chars_list.get(t_chars_list.size() - 1 - j).equals(isPunctuation_list.get(c))) {
                        indexes.add(j);
                        t_chars_list.remove(t_chars_list.get(t_chars_list.size() - 1 - j));
                    }
                    if (t_chars_list.get(t_chars_list.size() - 1) != isPunctuation_list.get(c)) {
                        counter2++;
                    }
                }
            }
            if (counter2 > 0) {
                t_chars_list.add("?");
                String result = String.join("", t_chars_list);
                thoughts3 = result;
            }
            String[] t_split = thoughts3.split("\\s+");
            //list of pronouns to identify in the input 
            String[] toMirror = {
                "I",
                "me",
                "you",
                "my",
                "your",
                "am",
                "are"
            };
            //Replace the pronouns with the pronouns of first person or second person counterpart depending on the pronouns in the input given
            String[] replacement = {
                "you",
                "you",
                "me",
                "your",
                "my",
                "are",
                "am"
            };
            String str = "";
            int counter = 0;
            String currentWord;
            //a loop to loop through my splited input to find pronouns and replace it to form anew string 
            for (int i2 = 0; i2 < t_split.length; i2++) {
                currentWord = "";
                for (int h = 0; h < toMirror.length; h++) {
                    if (t_split[i2].equalsIgnoreCase(toMirror[h])) {
                        counter++;
                        currentWord = replacement[h];
                    }
                }
                if (currentWord.equals("")) {
                    str += t_split[i2] + " ";
                } else {
                    str += currentWord + " ";
                }
            }
            if (counter > 0) {
                System.out.println(str);
                transcript.add(str);
            }
            if (counter <= 0) {
                String rando = randomResponse[r.nextInt(randomResponse.length)];
                System.out.println(rando);
                transcript.add(rando);

            }
        }
        String gb = "See ya!\n";
        System.out.println(gb);
        System.out.println();
        transcript.add(gb);
        System.out.println("TRANSCRIPT:");
        // for each sentence in transcript print it in a individual line
        for (String word: transcript) {
            System.out.println(word);
        }
    }
}
  



  




