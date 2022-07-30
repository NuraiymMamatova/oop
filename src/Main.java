import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
               // kaitaloo();
                ex(scanner.nextLine());
            }

            public static void kaitaloo() {
                String word = "hello world";
                String word2 = "hello worD";
                char[] chars = {'h', 'g', 'f'};
                char result = word.charAt(5);//бир эле символун чыгарат0
                System.out.println(result);
                String result1 = word.substring(2);//kesip beret
                String result2 = word.substring(3, 8);
                System.out.println(result1 + "  1  " + result2 + "   2   ");
                boolean contains = word.contains("wor"/*top toch kylyp oksoshturup zhazysh kerek*/);//barby zhokpu tecksheret
                System.out.println(contains);
                String result3 = word.toLowerCase(Locale.ROOT);//кичинекей тамга
                String result4 = word.toUpperCase();//чон тамга
                String result5 = word.trim();//башында жана аягында болгон пробелдерди алып коёт
                boolean result6 = word.equals(word2);//salyshtyrat
                boolean result7 = word.equalsIgnoreCase(word2);
                String result8 = word.replace("l", "r");//l dyn baaryn r ga almashtyryp koiot
                int result9 = word.length();//kancha simvol bar ekenin sanap beret misaly "hello word "to on bir simvol bar
                String result10 = word.concat(word2);//sozdordu koshup koiot
                int result11 = word.indexOf('w');//simvol kaisy zherde zhaigashkan zherin korsotot
                //String a = word.startsWith("hello");
                //int result12=word.toCharArray(chars);//bir massivten alyp bashkaga salyp koiot



            }
            public static void ex (String word){
//            String endWord = word.substring(word.length()-2);
//                System.out.println(endWord+word+endWord);
//                if (word.length()<=1){
//                System.out.println("error");
//            }
//            else {
//                System.out.println(word.charAt(word.length()+1)+word.charAt(word.length()-1)+word+(word.charAt(word.length()-1+-2)));
//
//            }
//                if (word.substring(0,2) .equals("hi")){
//                    System.out.println("oa");
//                }
//                for (int i = 0; i <word.length() ; i++) {
//                    System.out.println(word.charAt(i)+" ");
//                }
//                if (word.length()<=3){
//                    System.out.println(word.toUpperCase());
//                }
//                else {
//                    String first = word.substring(0, word.length() - 3);
//                    String second = word.substring(word.length() - 3).toUpperCase();
//                    String result = first + second.toUpperCase();
//                    System.out.println(result);
//                    System.out.println(word);
//                    System.out.println(first);
//                    System.out.println(second);
                //    System.out.println(word.endsWith(word.toUpperCase()));
                //}
                if (word.length()<=3){
                    System.out.println(word.toUpperCase());
                }
                else {
                    String first = word.substring(0, word.length() - 3);
                    String second = word.substring(word.length() - 3).toUpperCase();
                    String result = first + second.toUpperCase();
                }
            }
        }








































































