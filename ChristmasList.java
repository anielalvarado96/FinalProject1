import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;


public class ChristmasList {
    static String[][] songNames = new String[25][2];

    public static void main(String[] args){ 

        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x    Welcome to the Christmas Songs List Application v. 1.0   x");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x-x Written by: Aniel Alvarado  x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x-x Date Created: 12/20/20  x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x                                                             x");
        System.out.println("x Course: CMP128 Section: 83149 Semester: Fall 2020           x");
        System.out.println("x Professor Michael Sidaras-Tirrito                           x");
        System.out.println("x County College of Morris                                    x");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x                                                             x");
        System.out.println("x                                                             x");
        System.out.println("x x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println("x   Merry Christmas to All, And to All a Good Night!          x");
        System.out.println("x         from ‘Twas the Night Before Christmas               x");
        System.out.println("x      A song adapted from the poem, “A Visit From            x");
        System.out.println("x        St. Nicholas,” by Clement Clarke Moore               x");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println( "1. Load Current Christmas Song List from Text File \n2. Load Specific Christmas Song List from Text File \n3. Display Current Christma sSong List on Screen\n4. Edit the Christmas Song List \n5. Create a New Christmas Song List \n6. Save the Christmas Song List to Original File \n7. Save the Christmas Song List to a New File \n8. Exit the Program"  );
        System.out.print( "Selection (numeric): " );

        int choiceEntry;


        do {

            Scanner in = new Scanner ( System.in );
            choiceEntry = in.nextInt();
            switch (choiceEntry){
                case 1:
                optionOne();
                break;
                case 2:
                System.out.println ( "Please Type Text File Name: " );
                Scanner txtFileName = new Scanner ( System.in );
                optionTwo(txtFileName.nextLine() + ".txt");
                break;
                case 3:
                System.out.println ( "Here are the loaded Christmas Songs: " );
                optionThree();
                break;
                case 4:
                System.out.println ( "Edit the Christmas Song List: " );
                optionFour();
                break;
                case 5:
                System.out.println ( "Create a New Christmas Song List" );
                optionFive();
                break;
                case 6:
                System.out.println ( "Save the Christmas Song List to Original File" );
                optionSix();
                break;
                case 7:
                System.out.println ( "Save the Christmas Song List to a New File" );
                optionSeven();
                break;
                case 8:
                System.out.println ( "Exit the program" );
                optionEigth();
                break;
                default:
                System.err.println ( "Unrecognized option" );
                break;
            }
        } while (choiceEntry != 8);

    }

    static void optionOne(){
        try {
            File myObj = new File("CurrentChristmasSongList.txt");
            int songCount = 0;
            int artistCount = 0;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              if(artistCount == 0){
                songNames[songCount][artistCount] = data;
                System.out.println(songNames[songCount][artistCount]);
                artistCount++;
              } else {
                songNames[songCount][artistCount] = data;
                System.out.println(songNames[songCount][artistCount]);
                songCount++;
                artistCount = 0;
              }
              
            //   if(songCount == 25){ break; }
            }
            myReader.close();

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          System.out.println( "1. Load Current Christmas Song List from Text File \n2. Load Specific Christmas Song List from Text File \n3. Display Current Christma sSong List on Screen\n4. Edit the Christmas Song List \n5. Create a New Christmas Song List \n6. Save the Christmas Song List to Original File \n7. Save the Christmas Song List to a New File \n8. Exit the Program"  );
          System.out.print( "Selection (numeric): " );
  
    }

    static void optionTwo(String fileName){
        
        try {
            List<String> songNames = new ArrayList<String>();
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              songNames.add(data);
              System.out.println(songNames);
            }
            
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    static void optionThree(){
        int i;
        int j;
        for(i = 0; i< 25; i++){
            for(j = 0; j< 2; j++){
                System.out.println(songNames[i][j]);
            }
        }
        System.out.println( "1. Load Current Christmas Song List from Text File \n2. Load Specific Christmas Song List from Text File \n3. Display Current Christma sSong List on Screen\n4. Edit the Christmas Song List \n5. Create a New Christmas Song List \n6. Save the Christmas Song List to Original File \n7. Save the Christmas Song List to a New File \n8. Exit the Program"  );
        System.out.print( "Selection (numeric): " );
    }
    
    static void optionFour(){
 
    }
    static void optionFive(){

    }
    static void optionSix(){

    }
    static void optionSeven(){

    }

    static void optionEigth(){
        System.out.print( "Are you sure you want to exit? (Y/n)" );
        Scanner scanner = new Scanner ( System.in );
        String answer = scanner.nextLine();
        if(answer.equals("Y")){
            System.out.println("LEAVING NOW");
            System.exit(0);

        }

        System.out.println( "1. Load Current Christmas Song List from Text File \n2. Load Specific Christmas Song List from Text File \n3. Display Current Christma sSong List on Screen\n4. Edit the Christmas Song List \n5. Create a New Christmas Song List \n6. Save the Christmas Song List to Original File \n7. Save the Christmas Song List to a New File \n8. Exit the Program"  );
        System.out.print( "Selection (numeric): " );

    }

    


}


