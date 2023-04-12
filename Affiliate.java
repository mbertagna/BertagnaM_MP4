// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP4: University Database

/** Affiliate.java
* This is a simple Affiliate abstract class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP4: University Database
* @version 1.0
*/

/** The Affiliate abstract class is used as a base class for more specific Affiliates and
* contains basic Affiliate attributes: name, age, address, phone number, and year entered Chapman.
*/

public abstract class Affiliate implements Printable, Comparable<Affiliate>{
  /**
   * The name of the affiliate.
   */
  protected String m_name;
  /**
   * The age of the affiliate.
   */
  protected int m_age;
  /**
   * The address of the affiliate.
   */
  protected String m_address;
  /**
   * The phone number of the affiliate.
   */
  protected String m_phoneNumber;
  /**
   * The year the affiliate came to Chapman.
   */
  protected int m_yearEnteredChapman;

  /**
   * The default constructor - creates a new Affiliate with name=null,
   * age=0, address=null, phoneNumber=null, yearEnteredChapman=0.
   */
  public Affiliate(){
    m_name=null;
    m_age=0;
    m_address=null;
    m_phoneNumber=null;
    m_yearEnteredChapman=0;
  }

  /**
   * The overloaded constructor - creates a new Affiliate with
   * specified attributes.
   * @param name               - String name of Affiliate
   * @param age                - Int age of Affiliate
   * @param address            - String address of Affiliate
   * @param phoneNumber        - String phone number of Affiliate
   * @param yearEnteredChapman - int year Affiliate entered Chapman
   */
  public Affiliate(String name, int age, String address, String phoneNumber, int yearEnteredChapman){
    m_name=name;
    m_age=age;
    m_address=address;
    m_phoneNumber=phoneNumber;
    m_yearEnteredChapman=yearEnteredChapman;
  }

  /**
   * The copy constructor - creates a deep copy of an Affiliate
   * @param otherAffiliate - Affiliate to copy
   */
  public Affiliate(Affiliate otherAffiliate){
    m_name=otherAffiliate.m_name;
    m_age=otherAffiliate.m_age;
    m_address=otherAffiliate.m_address;
    m_phoneNumber=otherAffiliate.m_phoneNumber;
    m_yearEnteredChapman=otherAffiliate.m_yearEnteredChapman;
  }

  /**
   * Returns name of Affiliate
   * @return name as a String
   */
  public String getName(){
    return m_name;
  }
  /**
   * Returns age of Affiliate
   * @return age as an int
   */
  public int getAge(){
    return m_age;
  }
  /**
   * Returns the address of Affiliate
   * @return address as a String
   */
  public String getAddress(){
    return m_address;
  }
  /**
   * Returns the phone number of Affiliate
   * @return phone number as a String
   */
  public String getPhoneNumber(){
    return m_phoneNumber;
  }
  /**
   * Returns the year the Affiliate entered Chapman as an int
   * @return year the Affiliate entered Chapman as an int
   */
  public int getYearEnteredChapman(){
    return m_yearEnteredChapman;
  }

  /**
   * Sets the name
   * @param name - String to set name as
   */
  public void setName(String name){
    m_name=name;
  }
  /**
   * Sets the age
   * @param age - int to set the age as
   */
  public void setAge(int age){
    m_age=age;
  }
  /**
   * Sets the address
   * @param address - String to set address as
   */
  public void setAddress(String address){
    m_address=address;
  }
  /**
   * Sets the phone number
   * @param phoneNumber - String to set the phone number as
   */
  public void setPhoneNumber(String phoneNumber){
    m_phoneNumber=phoneNumber;
  }
  /**
   * Sets the year the Affiliate entered Chapman
   * @param yearEnteredChapman - int to set year Affiliate entered Chapman as
   */
  public void setYearEnteredChapman(int yearEnteredChapman){
    m_yearEnteredChapman=yearEnteredChapman;
  }

  /**
   * Returns true if two Affiliates equal, else False
   * @param  otherAffiliate - Affiliate for comparison
   * @return                boolean: true if equal and false if not equal
   */
  public boolean equals(Affiliate otherAffiliate){
    return (m_name.equals(otherAffiliate.m_name)&&
    m_age==otherAffiliate.m_age&&
    m_address.equals(otherAffiliate.m_address)&&
    m_phoneNumber.equals(otherAffiliate.m_phoneNumber)&&
    m_yearEnteredChapman==otherAffiliate.m_yearEnteredChapman);
  }

  /**
   * Compares two Affiliates based on year came to Chapman (earlier year is greater)
   * @param  otherAffiliate - Affiliate to compare to
   * @return                int 1(if greater), -1(if less than), and 0(if equal)
   */
  public int compareTo(Affiliate otherAffiliate){
    int comparison=0;
    if (getYearEnteredChapman()<otherAffiliate.getYearEnteredChapman()){
      comparison=1;
    }
    else if (getYearEnteredChapman()>otherAffiliate.getYearEnteredChapman()){
      comparison=-1;
    }
    else{
      comparison=0;
    }
    return comparison;
  }

  /**
   * Pretty prints attributes
   */
  public void print(){
    System.out.println("Name: "+m_name+"\nAge: "+m_age+"\nAddress: "+m_address+"\nPhone Number: "
    +m_phoneNumber+"\nYear Entered Chapman: "+m_yearEnteredChapman);
  }

  /**
   * Returns a pretty String of attributes for use in writing to files
   * @return String of pretty printed attributes
   */
  public String filePrint(){
    return(m_address+", "+m_age+", "+m_name+", "
    +m_phoneNumber+", "+m_yearEnteredChapman);
  }
}
