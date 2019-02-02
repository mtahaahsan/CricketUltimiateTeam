public class Player{
    String role;
    String firstName;
    String lastName;
    String nation;
    public Player(String myRole, String myFirstName, String myLastName, String myNation){
        role = myRole;
        firstName = myFirstName;
        lastName = myLastName;
        nation = myNation;
    }

    public String getRole(){
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNation() {
        return nation;
    }

}
