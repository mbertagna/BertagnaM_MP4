// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Graduate.java
* This is a simple PartTimeStaff class
* @author Michael Bertagna
* @author Assistant ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The PartTimeStaff class extends from the Staff class.
* It contains basic PartTimeStaff attributes: hourlySalary and attributes inherited from the Staff and Affiliate classes.
*/

public class PartTimeStaff extends Staff{
  /**
   * hourly salary
   */
  protected double m_hourlySalary;

  /**
   * The default constructor - creates a new PartTimeStaff with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, staffID=0,
   * title=null, building=null, hourlySalary=0.
   */
  public PartTimeStaff(){
    super();
    m_hourlySalary=0;
  }

  /**
  * The overloaded constructor - creates a new PartTimeStaff with
  * specified attributes.
  * @param name               - String name of Staff
  * @param age                - Int age of Staff
  * @param address            - String address of Staff
  * @param phoneNumber        - String phone number of Staff
  * @param yearEnteredChapman - int year Staff entered Chapman
  * @param staffID            - int id of the Staff
  * @param title              - String title of the Staff
  * @param building           - String building of the Staff
   * @param hourlySalary      - double of hourly salary
   */
  public PartTimeStaff(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int staffID, String title, String building,
  double hourlySalary){
    super(name, age, address, phoneNumber, yearEnteredChapman,
    staffID, title, building);
    m_hourlySalary=hourlySalary;
  }

  /**
   * The copy constructor - creates a deep copy of the PartTimeStaff
   * @param otherPartTimeStaff - PartTimeStaff to copy
   */
  public PartTimeStaff(PartTimeStaff otherPartTimeStaff){
    super(otherPartTimeStaff);
    m_hourlySalary=otherPartTimeStaff.m_hourlySalary;
  }

  /**
   * Returns hourly salary
   * @return double hourly salary
   */
  public double getHourlySalary(){
    return m_hourlySalary;
  }

  /**
   * Sets hourly salary
   * @param hourlySalary double hourly salary
   */
  public void setHourlySalary(double hourlySalary){
    m_hourlySalary=hourlySalary;
  }

  /**
   * Returns true if two PartTimeStaff equal, else False
   * @param  otherPartTimeStaff - PartTimeStaff for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(PartTimeStaff otherPartTimeStaff){
    return (super.equals(otherPartTimeStaff)&&
    m_hourlySalary==otherPartTimeStaff.m_hourlySalary);
  }

  /**
   * Compares two PartTimeStaff based on year came to Chapman (earlier year is greater)
   * @param  otherPartTimeStaff - PartTimeStaff to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(PartTimeStaff otherPartTimeStaff){
    return super.compareTo(otherPartTimeStaff);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Hourly Salary: "+m_hourlySalary);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_hourlySalary);
  }
}
