package diary;

import util.Input;

import java.io.IOException;

public class DiaryApp {
    private static Input input = new Input();

    public static void main(String[] args) throws IOException {
        Diary myDiary = new Diary();
        boolean keepGoing = true;

        while (keepGoing){
            System.out.println("Welcome to your diary. What would you like to do?");
            System.out.println("1: View all pages");
            System.out.println("2: View page by date");
            System.out.println("3: Add a new page");
            System.out.println("4: Exit");

            int userInput = input.getInt(1, 4);

            switch (userInput){
                case 1:
                    myDiary.showAllPages();
                    break;
                case 2:
                    myDiary.showPageByDate();
                    break;
                case 3:
                    myDiary.addPage();
                    break;
                case 4:
                    System.out.println("Bye.");
                    keepGoing = false;
                    break;
            }
        }
    }
}
