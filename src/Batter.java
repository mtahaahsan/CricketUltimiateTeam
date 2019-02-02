public class Batter extends Player{
    int attack;
    int defend;


    public Batter(String myRole, String myFirstName, String myLastName, String myNation, int attacking, int defending) {
        super(myRole, myFirstName, myLastName, myNation);
        attack = attacking;
        defend = defending;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefend() {
        return defend;
    }
}
