public class EmailChecker {
    public static void main(String[] args) {
        String email = "Helloworldatgmaildotcom";

        // System.out.println(checkEmail(email));
        System.out.println(LoopChange(email));
    }

    public static String checkEmail(String txt) {

        String ans = "";
        char first = txt.charAt(0);
        char last = txt.charAt(txt.length() - 1);

        for (int i = 1; i < txt.length() - 1; i++) {
            ans += txt.charAt(i);
        }

        ans = ans.replace("at", "@");
        ans = ans.replace("dot", ".");

        return first + ans + last;
    }

    public static String LoopChange(String txt){

        String text = "";
        char first = txt.charAt(0);
        char last = txt.charAt(txt.length()-1);
        for (int i = 1; i < txt.length()-1; i++) {
            String label = txt.charAt(i)+"";
            for (int j = i+1; j < i+2; j++) {
                String compare = label+txt.charAt(j);
                if(compare.equals("at")){
                    text+="@";
                    i++;
                    break;
                }
                if(compare.equals("do")){
                    String nextChar = txt.charAt(j+1)+"";
                    if(nextChar.equals("t")){
                        text+=".";
                        i+=2;
                        break;
                    }
                }
                else{
                    text+=label;
                }
            } 
        }
        return first+text+last;
    }
}
