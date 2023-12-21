package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IODemo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/text.txt");
        String text = Files.readString(path);
        String[] words = text.split("[\\s,.:!?;]+");

        System.out.println("Задание 1. Найти и вывести в консоль все слова, начинающиеся с гласной буквы");
        for (String word : words) {
            if (word.matches("^(?ui:[аеёиоуыэюяaeiou]).*"))
                System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Задание 2.Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова");
        for (int i = 0; i < (words.length - 1); i++) {
            char c1 = words[i].charAt(words[i].length() - 1);
            char c2 = words[i + 1].charAt(0);
            if (c1 == c2)
                System.out.println(words[i] + " " + words[i + 1]);
        }

        System.out.println("Задание 3. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд");
        path = Path.of("src/text2.txt");
        List<String> strings = Files.readAllLines(path);
        for (String str : strings) {
            int count = 0, maxCount = 0;
            char[] chars = str.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c))
                    count++;
                else count = 0;
                if (count > maxCount)
                    maxCount = count;
            }
            System.out.println("В строке \"" + str + "\" наибольшее число цифр, идущих подряд - " + maxCount);
        }

        System.out.println("Задание 4. Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении атрибутов и методов класса заменить на слово private. Результат сохранить в другой заранее созданный файл");
        path = Path.of("src/IncomingCode.java");
        strings = Files.readAllLines(path);
        List<String> outputStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("class") | !string.contains("public"))
                outputStrings.add(string);
            else outputStrings.add(string.replace("public", "private"));
        }
        FileWriter writer = new FileWriter("src/OutgoingCode.java.txt");
        for(String str: outputStrings) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        System.out.println("done");

        System.out.println("Задание 5. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки");
        outputStrings = new ArrayList<>();
        for (String string : strings) {
            outputStrings.add(new StringBuilder(string).reverse().toString());
        }
        writer = new FileWriter("src/ReversedCode.java.txt");
        for(String str: outputStrings) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        System.out.println("done");
    }
}
