// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Staff.java
* This is a simple Staff abstract class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Staff abstract class extends from the Affiliate class and is used as a base class for more specific Staff
* It contains basic Staff attributes: staffID, title, building, and attributes inherited from the Affiliate class.
*/

public abstract class Staff extends Affiliate{
  /**
   * The id of the Staff
   */
  protected int m_staffID;
  /**
   * The title of the Staff
   */
  protected String m_title;
  /**
   * The building of the Staff
   */
  protected String m_building;

  /**
   * The default constructor - creates a new Staff with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0, staffID=0,
   * title=null, building=null.
   */
  public Staff(){
    super();
    m_staffID=0;
    m_title=null;
    m_building=null;
  }

  /**
   * The overloaded constructor - creates a new Staff with
   * specified attributes.
   * @param name               - String name of Staff
   * @param age                - Int age of Staff
   * @param address            - String address of Staff
   * @param phoneNumber        - String phone number of Staff
   * @param yearEnteredChapman - int year Staff entered Chapman
   * @param staffID            - int id of the Staff
   * @param title              - String title of the Staff
   * @param building           - String building of the Staff
   */
  public Staff(String name, int age, String address, String phoneNumber, int yearEnteredChapman,
  int staffID, String title, String building){
    super(name, age, address, phoneNumber, yearEnteredChapman);
    m_staffID=staffID;
    m_title=title;
    m_building=building;
  }

  /**
   * The copy constructor - creates a deep copy of the Staff
   * @param otherStaff - Staff to copy
   */
  Staff(Staff otherStaff){
    super(otherStaff);
    m_staffID=otherStaff.m_staffID;
    m_title=otherStaff.m_title;
    m_building=otherStaff.m_building;
  }

  /**
   * Returns id
   * @return id as int
   */
  public int getStaffID(){
    return m_staffID;
  }
  /**
   * Returns title
   * @return title as String
   */
  public String getTitle(){
    return m_title;
  }
  /**
   * Returns building
   * @return building as String
   */
  public String getBuilding(){
    return m_building;
  }

  /**
   * Sets the id
   * @param staffID - int to set id
   */
  public void setStaffID(int staffID){
    m_staffID=staffID;
  }
  /**
   * Sets the title
   * @param title - String to set title
   */
  public void setTitle(String title){
    m_title=title;
  }
  /**
   * Sets the building
   * @param building - String to set building
   */
  public void setBuilding(String building){
    m_building=building;
  }

  /**
   * Returns true if two Staff equal, else False
   * @param  otherStaff - Staff for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Staff otherStaff){
    return (super.equals(otherStaff)&&
    m_staffID==otherStaff.m_staffID&&
    m_title.equals(otherStaff.m_title)&&
    m_building.equals(otherStaff.m_building));
  }

  /**
   * Compares two Staff based on year came to Chapman (earlier year is greater)
   * @param  otherStaff - Staff to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Staff otherStaff){
    return super.compareTo(otherStaff);
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    super.print();
    System.out.println("Staff ID: "+m_staffID+"\nTitle: "+m_title+"\nBuilding: "+m_building);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return (super.filePrint()+", "+m_building+", "+m_staffID+", "+m_title);
  }
}
