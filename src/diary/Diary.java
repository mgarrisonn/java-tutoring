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
    private List<Page> pages;

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
        Page pageToAdd = new Page();
        if(dealWithDuplicateDates(userInput)){
            System.out.println("There is already an entry for " + userInput);
            System.out.println("What would you like to do?");
            System.out.println("1: Add to current entry");
            System.out.println("2: Overwrite this entry");
            System.out.println("3: Go back to main menu");
            int dupeSelection = input.getInt(1, 3);
            switch (dupeSelection){
                case 1:
                    System.out.println("TBD add current");
                    break;
                case 2:
                    System.out.println("TBD overwrite");
                    break;
                case 3:
                    System.out.println("Back to main.");
                    break;
            }
        }else {
            System.out.println("Type the body of this days entry.");
            String userContent = input.getString();

            List<String> fileContents = Files.readAllLines(dataFile);
            fileContents.add((userInput + userContent));
            Collections.sort(fileContents);
            Files.write(dataFile, fileContents);
            this.pages = generatePages();
        }
    }

    private void addToCurrent(String date){
        Page currentPage = new Page();
        for(Page page : this.pages){
            if(page.getDate().equals(date)){
                currentPage = page;
            }
        }
        System.out.println(currentPage.getContent());
        System.out.println("Write what you would like to add.");
        String newContent = currentPage.getContent() + " " + input.getString();
        currentPage.setContent(newContent);
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

    private boolean dealWithDuplicateDates(String date){
        boolean isDuplicate = false;

        for(int i = 0; i < this.pages.size(); i++){
            if(this.pages.get(i).getDate().equals(date)){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    }

    public void showPageByDate(){
        System.out.println("Enter the date of the page you want to see.");
        String selectedDate = getDate();
        for(Page singlePage : this.pages){
            if(singlePage.getDate().equals(selectedDate)){
                System.out.println(singlePage.getDate());
                System.out.println("==================================================================");
                System.out.println(singlePage.getContent());
                System.out.println("==================================================================\n");
            }
        }
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
