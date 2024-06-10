import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoIO {
    public static void main(String[] args) throws IOException {

        // 1. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
        System.out.println("1. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.");
        try ( BufferedReader reader = new BufferedReader( new FileReader("resources/text.txt")) ){
            String line;
            String[] words;
            while( (line = reader.readLine())!=null){
                words = line.split("[\\s]*[,\\.!?\\-;:]*([\\s]+|$)");
                for(String word: words)
                    if(word.matches("[эЭоОыЫуУаАеЕёЁиИюЮяЯ][А-яё]*"))
                        System.out.println(word);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }

        // 2. Задан файл с текстом, найти и вывести в консоль все слова,
        //      для которых последняя буква одного слова совпадает с первой буквой следующего слова
        System.out.println("\n2. Задан файл с текстом, найти и вывести в консоль все слова, " +
                        "для которых последняя буква одного слова совпадает с первой буквой следующего слова");
        try( Scanner scan = new Scanner(new BufferedReader(new FileReader("resources/text.txt"))) ){
            String[] words;
            String lastword="";
            char last='\n';
            while(scan.hasNext()){
                words = scan.nextLine().split("[\\s]*[,\\.!?\\-;:]*([\\s]+|$)");
                for( String word: words){
                    if (word.toLowerCase().charAt(0)==last)
                        System.out.println(lastword+"+"+word);
                    lastword = word;
                    last = lastword.toLowerCase().charAt(lastword.length()-1);
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

        // 3. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
        System.out.println("\n3. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.");
        try( Scanner scan = new Scanner(new BufferedReader(new FileReader("resources/example_in.txt"))) ){
            Pattern pattern = Pattern.compile("\\d+");
            while(scan.hasNext()){
                Matcher matcher = pattern.matcher(scan.nextLine());
                String digit="";
                int len=0;
                while(matcher.find()){
                    String newMatch = matcher.group();
                    if (newMatch.length()>len){
                        digit = newMatch;
                        len = digit.length();
                    }
                }
                System.out.printf("Максимальное число цифр в строке: %d (%s)\n", len, digit);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

        // 4. Задан файл с java-кодом. Прочитать текст программы из файла
        //      и все слова public в объявлении атрибутов и методов класса заменить на слово private.
        //      Результат сохранить в другой заранее созданный файл.
        System.out.println("\n4. Задан файл с java-кодом. \n" +
                "Прочитать текст программы из файла и все слова public в объявлении атрибутов и методов класса заменить на слово private.\n" +
                "Результат сохранить в другой заранее созданный файл.");
        try(BufferedReader reader = new BufferedReader(new FileReader("resources/MyArrList_in.java"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("resources/MyArrList_out.java")) ){
            String line;
            while( ((line= reader.readLine()).indexOf("class")==-1)
                    && (line!= null) ) {};
            while( (line = reader.readLine())!= null )
                writer.write( line.replaceAll("public", "private") + "\n");
            System.out.println("результаты записаны в resources/MyArrList_out.java");
        }catch(Exception ex){
            System.out.println(ex);
        }

        // 5. Задан файл с java-кодом. Прочитать текст программы из файла и
        //      записать в другой файл в обратном порядке символы каждой строки.
        System.out.println("\n5. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.");
        try(Scanner scan = new Scanner( new BufferedReader(new FileReader("resources/MyArrList_in.java")) );
            FileWriter writer = new FileWriter("resources/MyArrList_out2.java") ){
            while(scan.hasNext())
                writer.write(new StringBuilder(scan.nextLine()).reverse()+"\n");
            System.out.println("результаты записаны в resources/MyArrList_out2.java");
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}
