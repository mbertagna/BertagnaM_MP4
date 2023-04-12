// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Associate.java
* This is a simple Associate class
* @author Michael Bertagna
* @author Associate ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Associate class extends from the Faculty class.
* It contains basic Associate attributes: yearsSinceTenure, and attributes inherited from the Faculty and Affiliate classes.
*/

public class Associate extends Faculty{
  /**
   * years since tenure
   */
  protected int m_yearsSinceTenure;

  /**
   * The default constructor - creates a new Associate with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0,
   * facultyID=0, department=null, yearlySalary=0, numberOfPapers=0,
   * yearsSinceTenure=0.
   */
  public Associate(){
    super();
    m_yearsSinceTenure=0;
  }

  /**
  * The overloaded constructor - creates a new Associate with
  * specified attributes.
  * @param name               - String name of Associate
  * @param age                - Int age of Associate
  * @param address            - String address of Associate
  * @param phoneNumber        - String phone number of Associate
  * @param yearEnteredChapman - int year Associate entered Chapman
   * @param facultyID         - int id of Associate
   * @param department        - String department of Associate
   * @param yearlySalary      - Double yearly salary of Associate
   * @param numberOfPapers    - int number of papers of Associate
   * @param yearsSinceTenure  - int years Since tenure
   */
  public Associate(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int facultyID, String department, double yearlySalary, int numberOfPapers,
  int yearsSinceTenure){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    facultyID, department, yearlySalary, numberOfPapers);
    m_yearsSinceTenure=yearsSinceTenure;
  }

  /**
   * The copy constructor - creates a deep copy of the Associate
   * @param otherAssociate - Associate to copy
   */
  public Associate(Associate otherAssociate){
    super(otherAssociate);
    m_yearsSinceTenure=otherAssociate.m_yearsSinceTenure;
  }

  /**
   * Returns years Since tenure
   * @return int yearsSinceTenure
   */
  public int getyearsSinceTenure(){
    return m_yearsSinceTenure;
  }

  /**
   * Sets yearsSinceTenure
   * @param yearsSinceTenure - int years Since tenure
   */
  public void setyearsSinceTenure(int yearsSinceTenure){
    m_yearsSinceTenure=yearsSinceTenure;
  }

  /**
   * Returns true if two Associates equal, else False
   * @param  otherAssociate - Associate for comparison
   * @return boolean: true if equal and false if not equal
   */
  public boolean equals(Associate otherAssociate){
    return(super.equals(otherAssociate)&&
    m_yearsSinceTenure==otherAssociate.m_yearsSinceTenure);
  }

  /**
   * Compares two Associates based on year came to Chapman (earlier year is greater)
   * @param  otherAssociate - Associate to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Associate otherAssociate){
    return super.compareTo(otherAssociate);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Years Since Tenure: "+m_yearsSinceTenure);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_yearsSinceTenure);
  }
}
