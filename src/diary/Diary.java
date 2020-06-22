package diary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    List<Page> pages = new ArrayList<>();

    private static String directory = "src/diary";
    private static String filename = "diary.txt";

    private static Path dataDirectory = Paths.get(directory);
    private static Path dataFile = Paths.get(directory, filename);

    public Diary() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> fileContents = Files.readAllLines(dataFile);

        for(String pageString : fileContents){
            this.pages.add(new Page(pageString));
        }
    }

    public void showAllPages(){
        for(Page onePage : this.pages){
            System.out.println(onePage.getDate());
            System.out.println("==================================================================");
            System.out.println(onePage.getContent());
            System.out.println("==================================================================\n");
        }
    }

    public void addPage(String date, String content) throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        Page newPage = new Page(date, content);
        this.pages.add(newPage);

        List<String> fileContents = Files.readAllLines(dataFile);
        fileContents.add((date + content));
        Files.write(dataFile, fileContents);
    }
}
