package diary;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Diary {
    List<Page> pages = new ArrayList<>();

    private static String directory = "src/diary";
    private static String filename = "diary.txt";
    private static Input input = new Input();

    private static Path dataDirectory = Paths.get(directory);
    private static Path dataFile = Paths.get(directory, filename);

    public Diary() throws IOException {
        this.pages = generatePages();
    }

    public void showAllPages(){
        for(Page onePage : this.pages){
            System.out.println(onePage.getDate());
            System.out.println("==================================================================");
            System.out.println(onePage.getContent());
            System.out.println("==================================================================\n");
        }
    }

    public void addPage() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        String userInput = getDate();
        System.out.println("Type the body of this days entry.");
        String userContent = input.getString();

        List<String> fileContents = Files.readAllLines(dataFile);
        fileContents.add((userInput + userContent));
        Collections.sort(fileContents);
        this.pages = generatePages();

        Files.write(dataFile, fileContents);
    }

    private static String getDate(){
        System.out.println("Please enter the date like so: YYYY-MM-DD");
        String userInput = input.getString();

        if(userInput.matches("^\\d{4}-\\d{2}-\\d{2}$")){
            return userInput;
        }else {
            System.out.println("Invalid format. Try again.");
            return getDate();
        }
    }

    private static List<Page> generatePages() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> newFileContents = Files.readAllLines(dataFile);
        List<Page> returnList = new ArrayList<>();

        for(String pageString : newFileContents){
            returnList.add(new Page(pageString));
        }

        return returnList;
    }
}
