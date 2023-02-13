import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    Scanner rounds = new Scanner(System.in);
    System.out.println("How many rounds?");
    int rounds1 = rounds.nextInt();
    for (int i = 0; i < rounds1; i++){
      Scanner thoughts = new Scanner(System.in);
      System.out.println("Hi there!  What's on your mind?");
      String thoughts1 = thoughts.nextLine();
      thoughts1 = thoughts1.replace(",", "");
      thoughts1 = thoughts1.replace(".", "");
      thoughts1 = thoughts1.replace(";", "");
      thoughts1 = thoughts1.replace("!", "");
      thoughts1 = thoughts1.replace("?", "");
      String [] t_split = thoughts1.split("\\s+");
      // System.out.print(Arrays.toString(t_split));
      for (int i2 = 0; i2 < t_split.length; i2++){
      if (t_split[i2].equalsIgnoreCase("I")){
        thoughts1 = thoughts1.replace("I", "you");
      }if (t_split[0].equalsIgnoreCase("I")){
        thoughts1 = thoughts1.replace("I", "You");
      }if (t_split[i2].equalsIgnoreCase("you")){
        thoughts1 = thoughts1.replace("you", "I");
        thoughts1 = thoughts1.replace("You", "I");
      }if (t_split[i2].equalsIgnoreCase("me")){
        thoughts1 = thoughts1.replace("me", "you");
        thoughts1 = thoughts1.replace("Me", "You");
      }if (t_split[i2].equalsIgnoreCase("am")){
        thoughts1 = thoughts1.replace("am", "are");
        thoughts1 = thoughts1.replace("Am", "Are");
      }if (t_split[i2].equalsIgnoreCase("my")){
        thoughts1 = thoughts1.replace("my", "your");
        thoughts1 = thoughts1.replace("My", "Your");
      }if (t_split[i2].equalsIgnoreCase("your")){
        thoughts1 = thoughts1.replace("your", "my");
        thoughts1 = thoughts1.replace("Your", "My");
      }
      
      }thoughts1 = thoughts1 + "?";
    Scanner thoughts_2 = new Scanner(System.in);
    System.out.println(thoughts1);
    String thoughts2 = thoughts_2.nextLine();
    System.out.println("See ya!");
    ArrayList<String> convo = new ArrayList<String>();
    // convo.add(toString(rounds));
    // convo.add(thoughts1);
    // convo.add(thoughts2)

    
    }
  }

}

