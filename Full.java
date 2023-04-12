// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Full.java
* This is a simple Full class
* @author Michael Bertagna
* @author Full ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Full class extends from the Faculty class.
* It contains basic Full attributes: yearsUntilRetirement, and attributes inherited from the Faculty and Affiliate classes.
*/

public class Full extends Faculty{
  /**
   * years until retirement
   */
  protected int m_yearsUntilRetirement;

  /**
   * The default constructor - creates a new Full with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0,
   * facultyID=0, department=null, yearlySalary=0, numberOfPapers=0,
   * yearsUntilRetirement=0.
   */
  public Full(){
    super();
    m_yearsUntilRetirement=0;
  }

  /**
  * The overloaded constructor - creates a new Full with
  * specified attributes.
  * @param name               - String name of Full
  * @param age                - Int age of Full
  * @param address            - String address of Full
  * @param phoneNumber        - String phone number of Full
  * @param yearEnteredChapman - int year Full entered Chapman
   * @param facultyID         - int id of Full
   * @param department        - String department of Full
   * @param yearlySalary      - Double yearly salary of Full
   * @param numberOfPapers    - int number of papers of Full
   * @param yearsUntilRetirement  - int years until Retirement
   */
  public Full(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int facultyID, String department, double yearlySalary, int numberOfPapers,
  int yearsUntilRetirement){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    facultyID, department, yearlySalary, numberOfPapers);
    m_yearsUntilRetirement=yearsUntilRetirement;
  }

  /**
   * The copy constructor - creates a deep copy of the Full
   * @param otherFull - Full to copy
   */
  public Full(Full otherFull){
    super(otherFull);
    m_yearsUntilRetirement=otherFull.m_yearsUntilRetirement;
  }

  /**
   * Returns yearsUntilRetirement
   * @return int years until Retirement
   */
  public int getyearsUntilRetirement(){
    return m_yearsUntilRetirement;
  }

  /**
   * Sets yearsUntilRetirement
   * @param yearsUntilRetirement - int years until Retirement
   */
  public void setyearsUntilRetirement(int yearsUntilRetirement){
    m_yearsUntilRetirement=yearsUntilRetirement;
  }

  /**
   * Returns true if two Fulls equal, else False
   * @param  otherFull - Full for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Full otherFull){
    return(super.equals(otherFull)&&
    m_yearsUntilRetirement==otherFull.m_yearsUntilRetirement);
  }

  /**
   * Compares two Fulls based on year came to Chapman (earlier year is greater)
   * @param  otherFull - Full to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Full otherFull){
    return super.compareTo(otherFull);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Years Until Retirement: "+m_yearsUntilRetirement);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_yearsUntilRetirement);
  }
}
