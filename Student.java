// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Student.java
* This is a simple Student abstract class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Student abstract class extends from the Affiliate class and is used as a base class for more specific Students.
* It contains basic Student attributes: studentID, major, minor, class standing, and attributes inherited from the Affiliate class.
*/

public abstract class Student extends Affiliate{
  /**
   * The id of the student
   */
  protected int m_studentID;
  /**
   * The major of the student
   */
  protected String m_major;
  /**
   * The minor of the student
   */
  protected String m_minor;
  /**
   * The class standing of the student
   */
  protected String m_classStanding;

  /**
   * The default constructor - creates a new Student with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, studentID=0,
   * major=null, minor=null, classStanding=null.
   */
  Student(){
    super();
    m_studentID=0;
    m_major=null;
    m_minor=null;
    m_classStanding=null;
  }

  /**
   * The overloaded constructor - creates a new Student with
   * specified attributes.
   * @param name               - String name of Student
   * @param age                - Int age of Student
   * @param address            - String address of Student
   * @param phoneNumber        - String phone number of Student
   * @param yearEnteredChapman - int year Student entered Chapman
   * @param studentID          - int id of Student
   * @param major              - String major of Student
   * @param minor              - String minor of Student
   * @param classStanding      - String class standing of Student
   */
  Student(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int studentID, String major, String minor, String classStanding){
    super(name, age, address, phoneNumber, yearEnteredChapman);
    m_studentID=studentID;
    m_major=major;
    m_minor=minor;
    m_classStanding=classStanding;
  }

  /**
   * The copy constructor - creates a deep copy of the Student
   * @param otherStudent - Student to copy
   */
  Student(Student otherStudent){
    super(otherStudent);
    m_studentID=otherStudent.m_studentID;
    m_major=otherStudent.m_major;
    m_minor=otherStudent.m_minor;
    m_classStanding=otherStudent.m_classStanding;
  }

  /**
   * Returns id
   * @return id as int
   */
  public int getStudentID(){
    return m_studentID;
  }
  /**
   * Returns major
   * @return major as String
   */
  public String getMajor(){
    return m_major;
  }
  /**
   * Returns minor
   * @return minor as String
   */
  public String getMinor(){
    return m_minor;
  }
  /**
   * Returns class standing
   * @return class standing as String
   */
  public String getClassStanding(){
    return m_classStanding;
  }

  /**
   * Sets the id
   * @param studentID - int to set id
   */
  public void setStudentID(int studentID){
    m_studentID=studentID;
  }
  /**
   * Sets the major
   * @param major - String to set major
   */
  public void setMajor(String major){
    m_major=major;
  }
  /**
   * Sets the minor
   * @param minor - String to set minor
   */
  public void setMinor(String minor){
    m_minor=minor;
  }
  /**
   * Sets the class standing
   * @param classStanding - String to set class standing
   */
  public void setClassStanding(String classStanding){
    m_classStanding=classStanding;
  }

  /**
   * Returns true if two Students equal, else False
   * @param  otherStudent - Student for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Student otherStudent){
    return (super.equals(otherStudent)&&
    m_studentID==otherStudent.m_studentID&&
    m_major.equals(otherStudent.m_major)&&
    m_minor.equals(otherStudent.m_minor)&&
    m_classStanding.equals(otherStudent.m_classStanding));
  }

  /**
   * Compares two Students based on year came to Chapman (earlier year is greater)
   * @param  otherStudent - Student to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Student otherStudent){
    return super.compareTo(otherStudent);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Student ID: "+m_studentID+"\nMajor: "+m_major+"\nMinor: "+m_minor+"\nClass Standing: "+m_classStanding);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_classStanding+", "+m_studentID+", "+m_major+", "+m_minor);
  }
}
