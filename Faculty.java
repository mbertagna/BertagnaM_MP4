// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Faculty.java
* This is a simple Faculty abstract class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Faculty abstract class extends from the Affiliate class and is used as a base class for more specific Faculty
* It contains basic Faculty attributes: facultyID, department, yearly salary, number of papers, and attributes inherited from the Affiliate class.
*/

public abstract class Faculty extends Affiliate{
  /**
   * The id of the faculty
   */
  protected int m_facultyID;
  /**
   * The department of the faculty
   */
  protected String m_department;
  /**
   * The yearly salary of the faculty
   */
  protected double m_yearlySalary;
  /**
   * The number of papers of the faculty
   */
  protected int m_numberOfPapers;

  /**
   * The default constructor - creates a new Faculty with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0,
   * facultyID=0, department=null, yearlySalary=0, numberOfPapers=0.
   */
  Faculty(){
    super();
    m_facultyID=0;
    m_department=null;
    m_yearlySalary=0.0;
    m_numberOfPapers=0;
  }

  /**
  * The overloaded constructor - creates a new Faculty with
  * specified attributes.
  * @param name               - String name of Faculty
  * @param age                - Int age of Faculty
  * @param address            - String address of Faculty
  * @param phoneNumber        - String phone number of Faculty
  * @param yearEnteredChapman - int year Faculty entered Chapman
   * @param facultyID         - int id of Faculty
   * @param department        - String department of Faculty
   * @param yearlySalary      - Double yearly salary of Faculty
   * @param numberOfPapers    - int number of papers of Faculty
   */
  Faculty(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int facultyID, String department, double yearlySalary, int numberOfPapers){
    super(name, age, address, phoneNumber, yearEnteredChapman);
    m_facultyID=facultyID;
    m_department=department;
    m_yearlySalary=yearlySalary;
    m_numberOfPapers=numberOfPapers;
  }

  /**
   * The copy constructor - creates a deep copy of the Faculty
   * @param otherFaculty - Faculty to copy
   */
  Faculty(Faculty otherFaculty){
    super(otherFaculty);
    m_facultyID=otherFaculty.m_facultyID;
    m_department=otherFaculty.m_department;
    m_yearlySalary=otherFaculty.m_yearlySalary;
    m_numberOfPapers=otherFaculty.m_numberOfPapers;
  }

  /**
   * Returns id
   * @return id as int
   */
  public int getFacultyID(){
    return m_facultyID;
  }
  /**
   * Returns department
   * @return department as String
   */
  public String getDepartment(){
    return m_department;
  }
  /**
   * Returns yearly salary
   * @return salary as Double
   */
  public double getYearlySalary(){
    return m_yearlySalary;
  }
  /**
   * Returns number of papers
   * @return number of papers as int
   */
  public int getNumberOfPapers(){
    return m_numberOfPapers;
  }

  /**
   * Sets the id
   * @param facultyID - int to set id
   */
  public void setFacultyID(int facultyID){
    m_facultyID=facultyID;
  }
  /**
   * Sets department
   * @param department - String department
   */
  public void setDepartment(String department){
    m_department=department;
  }
  /**
   * Sets yearly salary
   * @param yearlySalary - Double yearlySalary
   */
  public void setYearlySalary(double yearlySalary){
    m_yearlySalary=yearlySalary;
  }
  /**
   * Sets number of papers
   * @param numberOfPapers - int number of papers
   */
  public void setNumberOfPapers(int numberOfPapers){
    m_numberOfPapers=numberOfPapers;
  }

  /**
   * Returns true if two Faculty equal, else False
   * @param  otherFaculty - Faculty for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Faculty otherFaculty){
    return (super.equals(otherFaculty)&&
    m_facultyID==otherFaculty.m_facultyID&&
    m_department.equals(otherFaculty.m_department)&&
    m_yearlySalary==otherFaculty.m_yearlySalary&&
    m_numberOfPapers==otherFaculty.m_numberOfPapers);
  }

  /**
   * Compares two Faculty based on year came to Chapman (earlier year is greater)
   * @param  otherFaculty - Faculty to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Faculty otherFaculty){
    return super.compareTo(otherFaculty);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Faculty ID: "+m_facultyID+"\nDepartment: "+m_department+"\nYearly Salary: "+m_yearlySalary+"\nNumber of Papers: "+m_numberOfPapers);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_department+", "+m_facultyID+", "+m_yearlySalary+", "+m_numberOfPapers);
  }
}
