// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.lang.NumberFormatException;

/** AffiliatesDriver.java
* This is a simple AffiliatesDriver class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The AffiliatesDriver class is used to to drive the following classes:
* Affiliate, Printable, Student, Staff, Faculty, Assistant, Associate, Full,
* Graduate, Undergraduate, FullTimeStaff, and PartTimeStaff.
* The AffiliatesDriver class consists of methods for running the associated classes
* in order to faciliate a platform in which to create, store, and manipulate a university database.
* The main method is implemented in this driver class to run the database and encompass database options.
*/

public class AffiliatesDriver{
  /**The database (collection of all affiliates of university).*/
  private HashMap<Integer, Affiliate> m_dataBase;

  /**
   * The default constructor - creates a new empty dataBase Collection.
   */
  public AffiliatesDriver(){
    m_dataBase = new HashMap<Integer, Affiliate>();
  }

  /**
   * The overloaded constructor - creates a dataBase Collection with specificed affiliates.
   * @param dataBase - HashMap<Integer, Affiliate> conatining specificed Affiliates
   */
  public AffiliatesDriver(HashMap<Integer, Affiliate> dataBase){
    m_dataBase = dataBase;
  }

  /**
   * Copy constructor - creates a shallow copy of an AffiliatesDriver Object
   * @param otherAffiliatesDriver - the AffiliatesDriver object to make a copy of
   */
  public AffiliatesDriver(AffiliatesDriver otherAffiliatesDriver){
    m_dataBase = otherAffiliatesDriver.m_dataBase;
  }

  /**
   * Returns the dataBase as a HashMap<Integer, Affiliate>
   * @return the dataBase as a HashMap<Integer, Affiliate>
   */
  public HashMap<Integer,Affiliate> getDataBase(){
    return m_dataBase;
  }

  /**
   * Sets the dataBase Collection.
   * @param dataBase - HashMap<Integer, Affiliate> to set the dataBase as
   */
  public void setDataBase(HashMap<Integer, Affiliate> dataBase){
    m_dataBase = dataBase;
  }

  /**
   * Prompts user for int until valid int inputted, lets user know if not valid
   * @return valid int
   */
  private int intProtector(){
    Scanner s = new Scanner(System.in);
    while(!s.hasNextInt()){
      System.out.println("\nInvalid Input: Please enter an integer.");
      s.next();
    }
    return s.nextInt();
  }

  /**
   * Prompts user for int until valid double inputted, lets user know if not valid
   * @return valid double
   */
  private double dubProtector(){
    Scanner s = new Scanner(System.in);
    while(!s.hasNextDouble()){
      System.out.println("\nInvalid Input: Please enter an integer or a decimal.");
      s.next();
    }
    return s.nextDouble();
  }

  /**
   * * Facilitates a menu that allows for manipulating the specified database, menu options include:
   * 1)Create an affiliate record
   * 2)Print information for an Affiliate given the id
   * 3)List all affiliates in order of seniority
   * 4)Delete a record given the id
   * 5)Save your database to a file
   * 6)Restore your database from a file
   */
  public void menu(){
    System.out.println("\n1) Create an affiliate record");
    System.out.println("2) Print information for an affiliate");
    System.out.println("3) List all affiliates in order of senority");
    System.out.println("4) Delete an affiliate record");
    System.out.println("5) Save database to file");
    System.out.println("6) Restore dataBase from a file\n7) Exit\n");
    System.out.println("Enter the number associated with the desired action: ");
    int action = intProtector();//stores user option


    Scanner idScnr = new Scanner(System.in);//scans for id
    int printId;
    int deleteId;
    Scanner fileScnr = new Scanner(System.in);//scans for file name
    PrintWriter pw = null;
    String writingFile;
    BufferedReader br = null;
    String readingFile;


    while(action!=7){//loop runs until user enters option 7 and exits
      switch(action){//executes desired option
        case 1://for adding affiliate record to databasee
        System.out.println();
        createAffiliateRecord();
        System.out.println();
        break;
        case 2://for printing a single affiliate
        System.out.println("\nEnter the id of the affiliate to be printed: ");
        printId = intProtector();
        System.out.println();
        printAffiliate(printId);
        System.out.println();
        break;
        case 3://for printing all affilates in database
        listAffiliatesInSenority();
        break;
        case 4://for deleting an affiliate in the database
        System.out.println("\nEnter the id of the affiliate to be deleted: ");
        deleteId = intProtector();
        System.out.println();
        deleteRecord(deleteId);
        break;
        case 5://for saving the database to a file
        System.out.println("\nEnter Database File Name (do not include .txt): ");
        writingFile = (fileScnr.nextLine())+".txt";
        try{
          pw = new PrintWriter(new FileWriter(writingFile));
          writeDataBaseFile(pw);

        }catch(FileNotFoundException e){
          System.err.println("File not found! Please Try Again.");
          System.err.println(e.getMessage());
        }catch(IOException e){
          System.err.println("Read/write error!");
          System.err.println(e.getMessage());
        }finally{
          if(pw != null){
            pw.close();
          }
        }
        System.out.println();
        break;
        case 6://for gathering database from a file
        System.out.println("\nEnter Database File Name (do not include .txt): ");
        readingFile = (fileScnr.nextLine())+".txt";
        try{
          br = new BufferedReader(new FileReader(readingFile));
          readDataBaseFile(br);

        }catch(FileNotFoundException e){
          System.err.println("File not found! Please Try Again.");
          System.err.println(e.getMessage());
        }catch(IOException e){
          System.err.println("Read/write error!");
          System.err.println(e.getMessage());
        }finally{
          try{
            if(br != null){
              br.close();
            }
          }catch(IOException i){
            i.printStackTrace();
          }
        }
        System.out.println();
        break;
      }
      System.out.println("1) Create an affiliate record");
      System.out.println("2) Print information for an affiliate");
      System.out.println("3) List all affiliates in order of senority");
      System.out.println("4) Delete an affiliate record");
      System.out.println("5) Save database to file");
      System.out.println("6) Restore dataBase from a file\n7) Exit");
      System.out.println("Enter the number associated with the desired action: ");
      action = intProtector();//gather another user action
    }
  }

  /**
   * Creates an affiliate of desired type and adds it to the database.
   */
  public void createAffiliateRecord(){
     Scanner numScnr = new Scanner(System.in);
     Scanner strScnr = new Scanner(System.in);
     String department;
     double yearlySalary;
     int numberOfPapers;
     int yearsUntilTenure;
     int yearsSinceTenure;
     int yearsUntilRetirement;
     String major;
     String minor;
     String classStanding;
     int numPapersPublished;
     String thesisAdvisor;
     int numCoursesTaken;
     double scholarshipAmount;
     String title;
     String building;
     double hourlySalary;

     System.out.println("1 Assistant\n2 Associate\n3 Full\n4 Graduate\n5 Undergraduate\n6 Full-Time Staff\n7 Part-Time Staff\nEnter the number corresponding to the type of affiliate you would like to add:");
     int num = intProtector();//gathers int based on desired affiliate to create
     System.out.println();

     //prompts and gathers id, name, age, address, phone number, and year entered university
     System.out.println("ID: ");
     int id = intProtector();
     System.out.println("Name: ");
     String name = strScnr.nextLine();
     System.out.println("Age: ");
     int age = intProtector();
     System.out.println("Address: ");
     String address = strScnr.nextLine();
     System.out.println("Phone Number: ");
     String phoneNumber = strScnr.nextLine();
     System.out.println("Year Entered Chapman: ");
     int yearEnteredChapman = intProtector();

     switch(num){//chooses case based on desired affiliate creation
       case 1://gathers attributes and creates Assistant
          System.out.println("Department: ");
          department = strScnr.nextLine();
          System.out.println("Yearly Salary: ");
          yearlySalary = dubProtector();
          System.out.println("Number of Papers: ");
          numberOfPapers = intProtector();
          System.out.println("Years Until Tenure: ");
          yearsUntilTenure = intProtector();

          m_dataBase.put(id, new Assistant(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsUntilTenure));
          break;
       case 2://gathers attributes and creates Associate
          System.out.println("Department: ");
          department = strScnr.nextLine();
          System.out.println("Yearly Salary: ");
          yearlySalary = dubProtector();
          System.out.println("Number of Papers: ");
          numberOfPapers = intProtector();
          System.out.println("Years Since Tenure: ");
          yearsSinceTenure = intProtector();

          m_dataBase.put(id, new Associate(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsSinceTenure));
          break;
       case 3://gathers attributes and creates Full
          System.out.println("Department: ");
          department = strScnr.nextLine();
          System.out.println("Yearly Salary: ");
          yearlySalary = dubProtector();
          System.out.println("Number of Papers: ");
          numberOfPapers = intProtector();
          System.out.println("Years Until Retirement: ");
          yearsUntilRetirement = intProtector();

          m_dataBase.put(id, new Full(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsUntilRetirement));
          break;
       case 4://gathers attributes and creates Graduate
          System.out.println("Major: ");
          major = strScnr.nextLine();
          System.out.println("Minor: ");
          minor = strScnr.nextLine();
          System.out.println("Class Standing: ");
          classStanding = strScnr.nextLine();
          System.out.println("Number of Papers Published: ");
          numPapersPublished = intProtector();
          System.out.println("Thesis Advisor: ");
          thesisAdvisor = strScnr.nextLine();

          m_dataBase.put(id, new Graduate(name, age, address, phoneNumber, yearEnteredChapman,
          id, major, minor, classStanding,
          numPapersPublished, thesisAdvisor));
          break;
       case 5://gathers attributes and creates Undergraduate
          System.out.println("Major: ");
          major = strScnr.nextLine();
          System.out.println("Minor: ");
          minor = strScnr.nextLine();
          System.out.println("Class Standing: ");
          classStanding = strScnr.nextLine();
          System.out.println("Number of Courses Taken: ");
          numCoursesTaken = intProtector();
          System.out.println("Scholarship Amount: ");
          scholarshipAmount = dubProtector();

          m_dataBase.put(id, new Undergraduate(name, age, address, phoneNumber, yearEnteredChapman,
          id, major, minor, classStanding,
          numCoursesTaken, scholarshipAmount));
          break;
       case 6://gathers attributes and creates FullTimeStaff
          System.out.println("Title: ");
          title = strScnr.nextLine();
          System.out.println("Building: ");
          building = strScnr.nextLine();
          System.out.println("Yearly Salary: ");
          yearlySalary = dubProtector();

          m_dataBase.put(id, new FullTimeStaff(name, age, address, phoneNumber, yearEnteredChapman,
          id, title, building,
          yearlySalary));
          break;
        case 7://gathers attributes and creates PartTimeStaff
          System.out.println("Title: ");
          title = strScnr.nextLine();
          System.out.println("Building: ");
          building = strScnr.nextLine();
          System.out.println("Yearly Salary: ");
          hourlySalary = dubProtector();

          m_dataBase.put(id, new PartTimeStaff(name, age, address, phoneNumber, yearEnteredChapman,
          id, title, building,
          hourlySalary));
          break;
     }
  }

  /**
   * Prints desired Affiliate and attributes based on id.
   * @param id - int id of Affiliate to print
   */
  public void printAffiliate(int id){
    if (m_dataBase.containsKey(id)){
    (m_dataBase.get(id)).print();}
    else{
      System.out.println("No affiliate with inputted id. Please try again.");
    }
  }

  /**
   * Prints all Affiliates  and attributes in database in order of seniority.
   */
  public void listAffiliatesInSenority(){
    ArrayList<Affiliate> dataBaseArrList = new ArrayList<Affiliate>(m_dataBase.values());//puts values from database HashMap into ArrayList
    Collections.sort(dataBaseArrList);//sorts Affiliates based on year they came to university (earliest year to latest year)
    for(int i=dataBaseArrList.size()-1 ; i>=0 ; --i){//iterates through each Affiliate in database and prints in order of senority
      System.out.println();
      System.out.println(((dataBaseArrList.get(i)).getClass().getName())+":");
      (dataBaseArrList.get(i)).print();
      System.out.println();
    }
  }

  /**
   * Deletes an affiliate based on id.
   * @param id - int id of Affiliate to delete
   */
  public void deleteRecord(int id){
    if (m_dataBase.containsKey(id)){
    m_dataBase.remove(id);}
    else{
      System.out.println("No affiliate with inputted id. Please try again.\n");
    }
  }

  /**
   * Writes current database to a desired file.
   * @param pw - PrintWriter that writes database to file that it takes as a param elsewhere
   */
  public void writeDataBaseFile(PrintWriter pw){
    ArrayList<Affiliate> dataBaseArrList = new ArrayList<Affiliate>(m_dataBase.values());
    Collections.sort(dataBaseArrList);
    for(int i=dataBaseArrList.size()-1 ; i>=0 ; --i){
      pw.println(((dataBaseArrList.get(i)).getClass().getName())+", "+(dataBaseArrList.get(i)).filePrint());
    }
  }

  /**
   * Reads database file and populates database with all affilates in file.
   * @param  br          - BufferedReade that reads file that it takes as a param elsewhere
   * @throws IOException - exception type thrown if reading file issue at runtime
   */
  public void readDataBaseFile(BufferedReader br) throws IOException{
    m_dataBase.clear();
    String currentLine;
    String type;
    String[] dataArr;
    int id;
    String name;
    int age;
    String address;
    String phoneNumber;
    int yearEnteredChapman;
    String department;
    double yearlySalary;
    int numberOfPapers;
    int yearsUntilTenure;
    int yearsSinceTenure;
    int yearsUntilRetirement;
    String major;
    String minor;
    String classStanding;
    int numPapersPublished;
    String thesisAdvisor;
    int numCoursesTaken;
    double scholarshipAmount;
    String title;
    String building;
    double hourlySalary;
    while((currentLine = br.readLine()) != null){//reads each populated line in file until a blank line
      dataArr=currentLine.split(",");//creates array with each String in array

      for(int i = 0 ; i < dataArr.length ; ++i){//trims whitespace off of each attribute String in array
        dataArr[i]=dataArr[i].trim();
      }

      type = dataArr[0];//sets first value in array to type of Affiliate

      //gathers address, age, name, phone number, and year entered university from array
      address = dataArr[1];
      age = Integer.parseInt(dataArr[2]);
      name = dataArr[3];
      phoneNumber = dataArr[4];
      yearEnteredChapman = Integer.parseInt(dataArr[5]);

      switch(type){//picks correct case for specified type of Affiliate
        case "Assistant"://sets attributes of Assistant and adds to database
          department = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          yearlySalary = Double.parseDouble(dataArr[8]);
          numberOfPapers = Integer.parseInt(dataArr[9]);
          yearsUntilTenure = Integer.parseInt(dataArr[10]);
          m_dataBase.put(id, new Assistant(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsUntilTenure));
          break;
        case "Associate"://sets attributes of Associate and adds to database
          department = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          yearlySalary = Double.parseDouble(dataArr[8]);
          numberOfPapers = Integer.parseInt(dataArr[9]);
          yearsSinceTenure = Integer.parseInt(dataArr[10]);
          m_dataBase.put(id, new Associate(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsSinceTenure));
          break;
        case "Full"://sets attributes of Full and adds to database
          department = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          yearlySalary = Double.parseDouble(dataArr[8]);
          numberOfPapers = Integer.parseInt(dataArr[9]);
          yearsUntilRetirement = Integer.parseInt(dataArr[10]);
          m_dataBase.put(id, new Full(name, age, address, phoneNumber, yearEnteredChapman,
          id, department, yearlySalary, numberOfPapers,
          yearsUntilRetirement));
          break;
        case "Graduate"://sets attributes of Graduate and adds to database
          classStanding = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          major = dataArr[8];
          minor = dataArr[9];
          numPapersPublished = Integer.parseInt(dataArr[10]);
          thesisAdvisor = dataArr[11];
          m_dataBase.put(id, new Graduate(name, age, address, phoneNumber, yearEnteredChapman,
          id, major, minor, classStanding,
          numPapersPublished, thesisAdvisor));
          break;
        case "Undergraduate"://sets attributes of Undergraduate and adds to database
          classStanding = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          major = dataArr[8];
          minor = dataArr[9];
          numCoursesTaken = Integer.parseInt(dataArr[10]);
          scholarshipAmount = Double.parseDouble(dataArr[11]);
          m_dataBase.put(id, new Undergraduate(name, age, address, phoneNumber, yearEnteredChapman,
          id, major, minor, classStanding,
          numCoursesTaken, scholarshipAmount));
          break;
        case "FullTimeStaff"://sets attributes of FullTimeStaff and adds to database
          building = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          title = dataArr[8];
          yearlySalary = Integer.parseInt(dataArr[9]);
          m_dataBase.put(id, new FullTimeStaff(name, age, address, phoneNumber, yearEnteredChapman,
          id, title, building,
          yearlySalary));
          break;
        case "PartTimeStaff"://sets attributes of PartTimeStaff and adds to database
          building = dataArr[6];
          id = Integer.parseInt(dataArr[7]);
          title = dataArr[8];
          hourlySalary = Integer.parseInt(dataArr[9]);
          m_dataBase.put(id, new PartTimeStaff(name, age, address, phoneNumber, yearEnteredChapman,
          id, title, building,
          hourlySalary));
          break;
      }
    }
  }


  /** The main method. Exercises the AffiliatesDriver class and associated classes functionality.
  * @param args The command line arguments (not used)
  */
  public static void main(String[] args) {
    AffiliatesDriver dataBase = new AffiliatesDriver();
    dataBase.menu();
  }
}
