package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

//      1. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.

        String letters = "аеёиоуэюя";
        List<String> list = getList(Files.readAllLines(Paths.get("text.txt")));
        list.stream()
                .filter(w -> letters.contains(w.substring(0,1)))
                .forEach(System.out::println);

//      2. Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова
//      совпадает с первой буквой следующего словa

        for (int i = 0; i < list.size() - 2; i++) {
            String s = list.get(i);
            String w = list.get(i + 1);
            if (s. length() > 2 && w.length() > 2 && s.substring(s.length() - 1,
                    s.length()).equals(w.substring(0, 1))) System.out.println(s + " " + w);
        }

//      3. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.

        StringBuilder allFile = new StringBuilder();
        for (String string : list) {
            allFile.append(string);
        }
        Pattern pattern = Pattern.compile("[^0-9]+");
        Matcher matcher = pattern.matcher(allFile.toString());
        String numbers = matcher.replaceAll(" ");
        OptionalInt res = Arrays.stream(numbers.split(" "))
                .mapToInt(String::length)
                .max();
        if (res.isPresent()) System.out.println(res.getAsInt());

//        4. Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении атрибутов
//        и методов класса заменить на слово private. Результат сохранить в другой заранее созданный файл.

        Files.createFile(Paths.get("text2.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("text2.txt"));
        for (String string : list) {
            writer.append(string.replace("public", "private")).append("\n");
        }
        writer.close();

//        5. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в
//        обратном порядке символы каждой строки.

        Collections.reverse(list);
        for (String string : list) {
            writer.append(string).append(" ");
        }
        writer.close();
    }

    public static List<String> getList (List<String> list) {
        return list.stream()
                .flatMap(s -> Stream.of(s.split("\\s+")))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("\\p{Punct}", ""))
                .toList();
    }
}
