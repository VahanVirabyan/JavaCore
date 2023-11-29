package homework1.fileanalyzer;

import java.util.Map;
public class FileAnalyzerMain {
    public static void main(String[] args) {

        String path = "C:\\Users\\vagan\\IdeaProjects\\JavaCore2023\\Example\\mytext.txt";
        Map<String, Integer> stringIntegerMap = FileAnalyzer.wordMap(path);

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }

        System.out.println("totalWordCount -> " + FileAnalyzer.totalWordCount(path));
        System.out.println("uniqueWordCount -> " + FileAnalyzer.uniqueWordCount(path));

        Map<String, Integer> stringIntegerMap1 = FileAnalyzer.topFrequentWords(path, 5);

        System.out.println("topFrequentWords");
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
        System.out.println("countWordOccurrences -> " + FileAnalyzer.countWordOccurrences(path, "English"));
    }
}
