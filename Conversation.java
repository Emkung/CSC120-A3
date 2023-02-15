import java.util.*;
class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner rounds = new Scanner(System.in);
    String question = "How many rounds?";
    System.out.println(question);
    int rounds1 = rounds.nextInt();
    // rounds.close();
    Random r = new Random();
      // Scanner thoughts = new Scanner(System.in);;
    String question2 = "Hi there!  What's on your mind?";
    System.out.println("\n" + question2);
    for (int i = 0; i < rounds1; i++){
      Scanner input = new Scanner(System.in);
      String thoughts1 = input.nextLine();
      String thoughts3 = thoughts1;
      String[] randomResponse = {"mhm", "that's so interesting!", "I agree", "hmmmm"};
      // char[] t_chars = thoughts3.toCharArray();
      // char[] isPunctuation = {',','.', ';', '!', '?'};
      // for (int j = 0; j < t_chars.length; j++){
      //   for (int c = 0; c < isPunctuation.length; c++){
      //     if (t_chars[t_chars.length-1] == isPunctuation[c]){
      //       thoughts3 = thoughts3.replace(t_chars[t_chars.length-1], '?');
      //     }else if (t_chars[t_chars.length-1] != isPunctuation[c]){
      //       t_chars[t_chars.length] = '?';
      //       String completeThought = new String(t_chars);
      //       thoughts3 = completeThought;
      //     }if (t_chars[j] == isPunctuation[c]){
      //       thoughts3 = thoughts3.replace(t_chars[j], ' ');
      //     }
      //   }
      String [] t_split = thoughts3.split("\\s+");
      String[] toMirror = {"I", "me", "you", "my", "your", "am", "are"};
      String[] replacement = {"you", "you","me", "your", "my", "are", "am"};
      String str = "";
      int counter = 0;
      String currentWord;
      for (int i2 = 0; i2 < t_split.length; i2++){
        currentWord = "";
        for(int h = 0; h < toMirror.length; h++){
          if(t_split[i2].equalsIgnoreCase(toMirror[h])){
            counter ++;
            currentWord = replacement[h];
          }
          }if (currentWord.equals("")){
            str += t_split[i2] + " ";
          }else{ 
            str += currentWord + " ";
        }
      }if (counter > 0){
        System.out.println(str + "?");
      }if (counter <= 0){
        System.out.println(randomResponse[r.nextInt(randomResponse.length)]);

      }
    }String gb = "See ya!\n";
  System.out.println(gb);
  

      
  } 
}

  




