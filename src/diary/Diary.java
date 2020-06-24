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
    // Only instance property
    private List<Page> pages;

    //private and static because these are only used in this class
    private static String directory = "src/diary";
    private static String filename = "diary.txt";
    private static Path dataDirectory = Paths.get(directory);
    private static Path dataFile = Paths.get(directory, filename);
    //To get user input
    private static Input input = new Input();

    // Public methods to use the diary
    //Constructor calls static method to read the file
    public Diary() throws IOException {
        this.pages = generatePages();
    }

    // Exactly what it sounds like
    public void showAllPages(){
        for(Page onePage : this.pages){
            showPage(onePage);
        }
    }

    // User enters date correctly formatted to see entry for that day
    public void showPageByDate(){
        System.out.println("Enter the date of the page you want to see.");
        String selectedDate = getDate();
        boolean foundIt = false;
        for(Page singlePage : this.pages){
            if(singlePage.getDate().equals(selectedDate)){
                foundIt = true;
                showPage(singlePage);
            }
        }
        if(!foundIt){
            System.out.println("There is no entry for that day.");
        }
    }

    // Call this to add a page
    // Calls static methods in case there is already a page for that date
    public void addPage() throws IOException {
        String userDate = getDate();
        Page pageToAdd = new Page();
        if(dealWithDuplicateDates(userDate)){
            System.out.println("There is already an entry for " + userDate);
            System.out.println("What would you like to do?");
            System.out.println("1: Add to current entry");
            System.out.println("2: Overwrite this entry");
            System.out.println("3: Go back to main menu");
            int dupeSelection = input.getInt(1, 3);
            switch (dupeSelection){
                case 1:
                    addToCurrent(userDate);
                    break;
                case 2:
                    overwriteCurrent(userDate);
                    break;
                case 3:
                    System.out.println("Back to main.");
                    break;
            }
        }else {
            System.out.println("Type the body of this days entry.");
            String userContent = input.getString();

            pageToAdd.setDate(userDate);
            pageToAdd.setContent(userContent);
            this.pages.add(pageToAdd);
            updatePages();
            this.pages = generatePages();
        }
    }

    //Private methods for utility
    // Give it a page and it will show it
    private static void showPage(Page pageToShow){
        System.out.println(pageToShow.getDate());
        System.out.println("==================================================================");
        System.out.println(pageToShow.getContent());
        System.out.println("==================================================================\n");
    }

    // Method called from addPage() if user wants to add to existing page
    private void addToCurrent(String date) throws IOException {
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
        updatePages();
    }

    // Method called from addPage() if user wants to overwrite existing page
    private void overwriteCurrent(String date) throws IOException {
        System.out.println("Type the new content of " + date);
        String newContent = input.getString();
        Page overwritePage = new Page(date + newContent);
        for(int i = 0; i < this.pages.size(); i++){
            if(this.pages.get(i).getDate().equals(date)){
                this.pages.set(i, overwritePage);
            }
        }
        updatePages();
    }

    // Uses Regex to ensure user types a date that works with the rest of the app
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

    // Reads contents from file and returns a list of pages
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

    // Called from several methods to write to file
    // Instanced method but grouped with other utility methods
    private void updatePages() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> pagesToStrings = new ArrayList<>();
        for(Page page : this.pages){
            String pageString = page.getDate() + page.getContent();
            pagesToStrings.add(pageString);
        }

        Collections.sort(pagesToStrings);
        Files.write(dataFile, pagesToStrings);
    }

    // Checks if there is an existing page for the date passed to it
    // Also Instanced but grouped with other utility methods
    private boolean dealWithDuplicateDates(String date){
        boolean isDuplicate = false;

        for (Page page : this.pages) {
            if (page.getDate().equals(date)) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
}
