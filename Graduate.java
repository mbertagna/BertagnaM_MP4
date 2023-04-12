// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Graduate.java
* This is a simple Graduate class
* @author Michael Bertagna
* @author Assistant ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Graduate class extends from the Student class.
* It contains basic Graduate attributes: numPapersPublished, thesisAdvisor, and attributes inherited from the Student and Affiliate classes.
*/

public class Graduate extends Student{
  /**
   * number of papers published
   */
  protected int m_numPapersPublished;
  /**
   * thesis Advisor
   */
  protected String m_thesisAdvisor;

  /**
   * The default constructor - creates a new Graduate with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, studentID=0,
   * major=null, minor=null, classStanding=null, numPapersPublished=0, thesisAdvisor=null.
   */
  public Graduate(){
    super();
    m_numPapersPublished=0;
    m_thesisAdvisor=null;
  }

  /**
  * The overloaded constructor - creates a new Graduate with
  * specified attributes.
  * @param name               - String name of Graduate
  * @param age                - Int age of Graduate
  * @param address            - String address of Graduate
  * @param phoneNumber        - String phone number of Graduate
  * @param yearEnteredChapman - int year Graduate entered Chapman
  * @param studentID          - int id of Graduate
  * @param major              - String major of Graduate
  * @param minor              - String minor of Graduate
  * @param classStanding      - String class standing of Graduate
   * @param thesisAdvisor    - String thesis Advisor of Graduate
   */
  public Graduate(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int studentID, String major, String minor, String classStanding,
  int numPapersPublished, String thesisAdvisor){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    studentID, major, minor, classStanding);
    m_numPapersPublished=numPapersPublished;
    m_thesisAdvisor=thesisAdvisor;
  }

  /**
   * The copy constructor - creates a deep copy of the Graduate
   * @param otherGraduate - Graduate to copy
   */
  public Graduate(Graduate otherGraduate){
    super(otherGraduate);
    m_numPapersPublished=otherGraduate.m_numPapersPublished;
    m_thesisAdvisor=otherGraduate.m_thesisAdvisor;
  }

  /**
   * Returns numPapersPublished
   * @return int numPapersPublished
   */
  public int getNumPapersPublished(){
    return m_numPapersPublished;
  }
  /**
   * Returns thesisAdvisor
   * @return String thesisAdvisor
   */
  public String getThesisAdvisor(){
    return m_thesisAdvisor;
  }

  /**
   * Sets numPapersPublished
   * @param numPapersPublished - int numPapersPublished
   */
  public void setNumPapersPublished(int numPapersPublished){
    m_numPapersPublished=numPapersPublished;
  }
  /**
   * Sets thesisAdvisor
   * @param thesisAdvisor - String thesisAdvisor
   */
  public void setThesisAdvisor(String thesisAdvisor){
    m_thesisAdvisor=thesisAdvisor;
  }

  /**
   * Returns true if two Graduates equal, else False
   * @param  otherGraduate - Graduate for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Graduate otherGraduate){
    return(super.equals(otherGraduate)&&
    m_numPapersPublished==otherGraduate.m_numPapersPublished&&
    m_thesisAdvisor.equals(otherGraduate.m_thesisAdvisor));
  }

  /**
   * Compares two Graduates based on year came to Chapman (earlier year is greater)
   * @param  otherGraduate - Graduate to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Graduate otherGraduate){
    return super.compareTo(otherGraduate);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Number of Papers Published: "+m_numPapersPublished+
    "\nThesis Advisor: "+m_thesisAdvisor);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_numPapersPublished+", "+m_thesisAdvisor);
  }
}
