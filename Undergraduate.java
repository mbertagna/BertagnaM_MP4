// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Undergraduate.java
* This is a simple Undergraduate class
* @author Michael Bertagna
* @author Assistant ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Undergraduate class extends from the Student class.
* It contains basic Undergraduate attributes: numCoursesTaken, scholarshipAmount, and attributes inherited from the Student and Affiliate classes.
*/

public class Undergraduate extends Student{
  /**
   * number of courses taken
   */
  protected int m_numCoursesTaken;
  /**
   * scholarship amount
   */
  protected double m_scholarshipAmount;

  /**
   * The default constructor - creates a new Undergraduate with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, studentID=0,
   * major=null, minor=null, classStanding=null, numCoursesTaken=0, scholarshipAmount=0.
   */
  public Undergraduate(){
    super();
    m_numCoursesTaken=0;
    m_scholarshipAmount=0.0;
  }

  /**
  * The overloaded constructor - creates a new Undergraduate with
  * specified attributes.
  * @param name               - String name of Undergraduate
  * @param age                - Int age of Undergraduate
  * @param address            - String address of Undergraduate
  * @param phoneNumber        - String phone number of Undergraduate
  * @param yearEnteredChapman - int year Undergraduate entered Chapman
  * @param studentID          - int id of Undergraduate
  * @param major              - String major of Undergraduate
  * @param minor              - String minor of Undergraduate
  * @param classStanding      - String class standing of Undergraduate
   * @param scholarshipAmount    - Double scholar ship amount of Undergraduate
   */
  public Undergraduate(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int studentID, String major, String minor, String classStanding,
  int numCoursesTaken, double scholarshipAmount){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    studentID, major, minor, classStanding);
    m_numCoursesTaken=numCoursesTaken;
    m_scholarshipAmount=scholarshipAmount;
  }

  /**
   * The copy constructor - creates a deep copy of the Undergraduate
   * @param otherUndergraduate - Undergraduate to copy
   */
  public Undergraduate(Undergraduate otherUndergraduate){
    super(otherUndergraduate);
    m_numCoursesTaken=otherUndergraduate.m_numCoursesTaken;
    m_scholarshipAmount=otherUndergraduate.m_scholarshipAmount;
  }

  /**
   * Returns numCoursesTaken
   * @return int numCoursesTaken
   */
  public int getnumCoursesTaken(){
    return m_numCoursesTaken;
  }
  /**
   * Returns scholarshipAmount
   * @return Double scholarshipAmount
   */
  public double getThesisAdvisor(){
    return m_scholarshipAmount;
  }

  /**
   * Sets numCoursesTaken
   * @param numCoursesTaken - int numCoursesTaken
   */
  public void setNumCoursesTaken(int numCoursesTaken){
    m_numCoursesTaken=numCoursesTaken;
  }
  /**
   * Sets scholarshipAmount
   * @param scholarshipAmount - Double scholarshipAmount
   */
  public void setScholarshipAmount(double scholarshipAmount){
    m_scholarshipAmount=scholarshipAmount;
  }

  /**
   * Returns true if two Undergraduates equal, else False
   * @param  otherUndergraduate - Undergraduate for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Undergraduate otherUndergraduate){
    return(super.equals(otherUndergraduate)&&
    m_numCoursesTaken==otherUndergraduate.m_numCoursesTaken&&
    m_scholarshipAmount==otherUndergraduate.m_scholarshipAmount);
  }

  /**
   * Compares two Undergraduates based on year came to Chapman (earlier year is greater)
   * @param  otherUndergraduate - Undergraduate to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Undergraduate otherUndergraduate){
    return super.compareTo(otherUndergraduate);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Number of Papers Published: "+m_numCoursesTaken+
    "\nThesis Advisior: "+m_scholarshipAmount);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_numCoursesTaken+", "+m_scholarshipAmount);
  }
}
