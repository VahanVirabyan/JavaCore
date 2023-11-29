package homework1.util;

public class FileUtilTest {

    public static void main(String[] args) {

        String path = "C:\\Users\\vagan\\IdeaProjects\\JavaCore2023\\Example";
        String fileName = "mytext1.txt";
        System.out.println(FileUtil.fileSearch(path, fileName));
        FileUtil.contentSearch(path, "asdf");
    }

}
