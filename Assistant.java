// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Assistant.java
* This is a simple Assistant class
* @author Michael Bertagna
* @author Assistant ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Assistant class extends from the Faculty class.
* It contains basic Assistant attributes: yearsUntilTenure, and attributes inherited from the Faculty and Affiliate classes.
*/

public class Assistant extends Faculty{
  /**
   * years until tenure
   */
  protected int m_yearsUntilTenure;

  /**
   * The default constructor - creates a new Assistant with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0,
   * facultyID=0, department=null, yearlySalary=0, numberOfPapers=0,
   * yearsUntilTenure=0.
   */
  public Assistant(){
    super();
    m_yearsUntilTenure=0;
  }

  /**
  * The overloaded constructor - creates a new Assistant with
  * specified attributes.
  * @param name               - String name of Assistant
  * @param age                - Int age of Assistant
  * @param address            - String address of Assistant
  * @param phoneNumber        - String phone number of Assistant
  * @param yearEnteredChapman - int year Assistant entered Chapman
   * @param facultyID         - int id of Assistant
   * @param department        - String department of Assistant
   * @param yearlySalary      - Double yearly salary of Assistant
   * @param numberOfPapers    - int number of papers of Assistant
   * @param yearsUntilTenure  - int years until tenure
   */
  public Assistant(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int facultyID, String department, double yearlySalary, int numberOfPapers,
  int yearsUntilTenure){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    facultyID, department, yearlySalary, numberOfPapers);
    m_yearsUntilTenure=yearsUntilTenure;
  }

  /**
   * The copy constructor - creates a deep copy of the Assistant
   * @param otherAssistant - Assistant to copy
   */
  public Assistant(Assistant otherAssistant){
    super(otherAssistant);
    m_yearsUntilTenure=otherAssistant.m_yearsUntilTenure;
  }

  /**
   * Returns yearsUntilTenure
   * @return int years until tenure
   */
  public int getYearsUntilTenure(){
    return m_yearsUntilTenure;
  }

  /**
   * Sets yearsUntilTenure
   * @param yearsUntilTenure - int years until tenure
   */
  public void setYearsUntilTenure(int yearsUntilTenure){
    m_yearsUntilTenure=yearsUntilTenure;
  }

  /**
   * Returns true if two Assistants equal, else False
   * @param  otherAssistant - Assistant for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Assistant otherAssistant){
    return(super.equals(otherAssistant)&&
    m_yearsUntilTenure==otherAssistant.m_yearsUntilTenure);
  }

  /**
   * Compares two Assistants based on year came to Chapman (earlier year is greater)
   * @param  otherAssistant - Assistant to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Assistant otherAssistant){
    return super.compareTo(otherAssistant);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Years Until Tenure: "+m_yearsUntilTenure);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_yearsUntilTenure);
  }
}
