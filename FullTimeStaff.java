// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Graduate.java
* This is a simple FullTimeStaff class
* @author Michael Bertagna
* @author Assistant ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The FullTimeStaff class extends from the Staff class.
* It contains basic FullTimeStaff attributes: yearlySalary and attributes inherited from the Staff and Affiliate classes.
*/

public class FullTimeStaff extends Staff{
  /**
   * yearly salary
   */
  protected double m_yearlySalary;

  /**
   * The default constructor - creates a new FullTimeStaff with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, staffID=0,
   * title=null, building=null, yearlySalary=0.
   */
  public FullTimeStaff(){
    super();
    m_yearlySalary=0;
  }

  /**
  * The overloaded constructor - creates a new FullTimeStaff with
  * specified attributes.
  * @param name               - String name of Staff
  * @param age                - Int age of Staff
  * @param address            - String address of Staff
  * @param phoneNumber        - String phone number of Staff
  * @param yearEnteredChapman - int year Staff entered Chapman
  * @param staffID            - int id of the Staff
  * @param title              - String title of the Staff
  * @param building           - String building of the Staff
   * @param yearlySalary      - Double of yearly salary
   */
  public FullTimeStaff(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int staffID, String title, String building,
  double yearlySalary){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    staffID, title, building);
    m_yearlySalary=yearlySalary;
  }

  /**
   * The copy constructor - creates a deep copy of the FullTimeStaff
   * @param otherFullTimeStaff - FullTimeStaff to copy
   */
  public FullTimeStaff(FullTimeStaff otherFullTimeStaff){
    super(otherFullTimeStaff);
    m_yearlySalary=otherFullTimeStaff.m_yearlySalary;
  }

  /**
   * Returns yearly salary
   * @return double yearly salary
   */
  public double getYearlySalary(){
    return m_yearlySalary;
  }

  /**
   * Sets yearly salary
   * @param yearlySalary double yearly salary
   */
  public void setYearlySalary(double yearlySalary){
    m_yearlySalary=yearlySalary;
  }

  /**
   * Returns true if two FullTimeStaff equal, else False
   * @param  otherFullTimeStaff - FullTimeStaff for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(FullTimeStaff otherFullTimeStaff){
    return (super.equals(otherFullTimeStaff)&&
    m_yearlySalary==otherFullTimeStaff.m_yearlySalary);
  }

  /**
   * Compares two FullTimeStaff based on year came to Chapman (earlier year is greater)
   * @param  otherFullTimeStaff - FullTimeStaff to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(FullTimeStaff otherFullTimeStaff){
    return super.compareTo(otherFullTimeStaff);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Hourly Salary: "+m_yearlySalary);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_yearlySalary);
  }
}
