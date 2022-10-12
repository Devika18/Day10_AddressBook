package AddressBook;

public class AddressBookMain {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long phoneNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook UseCase Program");
    }
    public AddressBokkMain(String firstName, String lastName, String address, String city, String state, int zipCode, long phoneNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
    public AddressBookMain(){

    }
    public String getCity(){

        return city;
    }
    public void setCity(String city){

        this.city = city;
    }
    public long getMobileNumber(){

        return phoneNumber;
    }
    public void setMobileNumber(long phoneNumber){

        this.phoneNumber = phoneNumber;
    }

    public String getState(){

        return state;
    }
    public void setState(String state){

        this.state = state;
    }
    public int getZipCode(){

        return zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
    public String getAddress(){

        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getFirstName(){

        return firstName;
    }
    public void setFirstName(String firstName){

        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){

        this.lastName = lastName;
    }
    public String toString(){
        return "Address[FirstName ="+ firstName+ ",LastName="+lastName+",Address="+address+",City="+city+",State="+state+",ZipCode="+zipCode+",MobileNumber="+phoneNumber+"]";

    }

}
