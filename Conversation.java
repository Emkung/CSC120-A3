import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner rounds = new Scanner(System.in);
    String question = "How many rounds?";
    System.out.println(question);
    int rounds1 = rounds.nextInt();
    for (int i = 0; i < rounds1; i++){
      Scanner thoughts = new Scanner(System.in);
      String question2 = "Hi there!  What's on your mind?";
      System.out.println(question2);
      String thoughts1 = thoughts.nextLine();
      String thoughts3 = thoughts1;
      thoughts3 = thoughts3.replace(",", "");
      thoughts3 = thoughts3.replace(".", "");
      thoughts3 = thoughts3.replace(";", "");
      thoughts3 = thoughts3.replace("!", "");
      thoughts3 = thoughts3.replace("?", "");
      String [] t_split = thoughts3.split("\\s+");
      // System.out.print(Arrays.toString(t_split));
      for (int i2 = 0; i2 < t_split.length; i2++){
      if (t_split[i2].equalsIgnoreCase("I")){
        thoughts3 = thoughts3.replace("I", "you");
      }if (t_split[0].equalsIgnoreCase("I")){
        thoughts3 = thoughts3.replace("I", "You");
      }if (t_split[i2].equalsIgnoreCase("you")){
        thoughts3 = thoughts3.replace("you", "I");
        thoughts3 = thoughts3.replace("You", "I");
      }if (t_split[i2].equalsIgnoreCase("me")){
        thoughts3 = thoughts3.replace("me", "you");
        thoughts3 = thoughts3.replace("Me", "You");
      }if (t_split[i2].equalsIgnoreCase("am")){
        thoughts3 = thoughts3.replace("am", "are");
        thoughts3 = thoughts3.replace("Am", "Are");
      }if (t_split[i2].equalsIgnoreCase("my")){
        thoughts3 = thoughts3.replace("my", "your");
        thoughts3 = thoughts3.replace("My", "Your");
      }if (t_split[i2].equalsIgnoreCase("your")){
        thoughts3 = thoughts3.replace("your", "my");
        thoughts3 = thoughts3.replace("Your", "My");
      }
      
      }thoughts3 = thoughts3 + "?";
    Scanner thoughts_2 = new Scanner(System.in);
    System.out.println(thoughts3);
    String thoughts2 = thoughts_2.nextLine();
    String gb = "See ya!\n";
    System.out.println(gb);
    ArrayList<String> convo = new ArrayList<String>();
    String rounds_str = Integer.toString(rounds1);
    convo.add(question);
    convo.add(rounds_str);
    convo.add(question2);
    convo.add(thoughts1);
    convo.add(thoughts3);
    convo.add(thoughts2);
    convo.add(gb);

    String convostr = String.join("\n", convo);
    System.out.print("Transcript\n" + convostr+"\n");

    
    }
    

  }

}

