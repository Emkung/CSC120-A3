import java.util.*;
class Conversation {
  public static void main(String[] arguments) {
    // You will start the conversation here.
    ArrayList<String> transcript = new ArrayList<String>();
    Scanner rounds = new Scanner(System.in);
    String question = "How many rounds?";
    System.out.println(question);
    int rounds1 = rounds.nextInt();
    transcript.add(question);
    transcript.add(Integer.toString(rounds1));
    Random r = new Random();
    String question2 = "\nHi there!  What's on your mind?";
    System.out.println(question2);
    transcript.add(question2);
    for (int i = 0; i < rounds1; i++){
      Scanner input = new Scanner(System.in);
      String thoughts1 = input.nextLine();
      String thoughts3 = thoughts1;
      String[] randomResponse = {"mhm", "that's so interesting!", "I agree", "hmmmm"};
      String[] t_chars = thoughts3.split("");
      String[] isPunctuation = {",",".", ";", "!", "?"};
      List<String> t_chars_list = new LinkedList<String>(Arrays.asList(t_chars));
      List<String> isPunctuation_list = new LinkedList<String>(Arrays.asList(isPunctuation));
      int counter2 = 0;
      for (int j = 0; j < t_chars_list.size(); j++){
        for (int c = 0; c < isPunctuation_list.size(); c++){
          if (t_chars_list.get(j).equals(isPunctuation_list.get(c))){
            t_chars_list.remove(isPunctuation_list.get(c));

            // String result = String.join(" ", t_chars_list);
            // thoughts3 = result;
          // if (t_chars[t_chars.length-1] == isPunctuation[c]){
          //   t_chars_list.remove(t_chars_list.get(t_chars_list.size()-1));
          //   t_chars_list.add("?");
          //   String result = String.join(" ", t_chars_list);
          //   thoughts3 = result;
          }if (t_chars_list.get(t_chars_list.size()-1) != isPunctuation_list.get(c)){
            counter2 ++;
          }
          }
        }if (counter2 > 0){
          t_chars_list.add("?");
          String result = String.join("", t_chars_list);
          thoughts3 = result;
          }
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
        System.out.println(str);
        transcript.add(str);
      }if (counter <= 0){
        String rando = randomResponse[r.nextInt(randomResponse.length)];
        System.out.println(rando);
        transcript.add(rando);

      }
    }String gb = "See ya!\n";
  System.out.println(gb);
  System.out.println();
  transcript.add(gb);
  System.out.println("TRANSCRIPT:");

  for(String word : transcript){
    System.out.println(word);
  }
}
}
  



  




