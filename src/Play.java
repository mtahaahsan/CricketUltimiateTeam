import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Play {
    Hashtable<Player, Player> players;

    public static void main(String[] args) {
        Hashtable<Player, Player> players = addPlayers();
        Player player1 = getPlayer(players);
        Batter batter1 = (Batter) player1;
        System.out.println(player1.getFirstName());
        System.out.println(batter1.getAttack());


    }

    public static Hashtable<Player,Player> addPlayers(){
        Player afridi = new Batter("Batter", "Shahid", "Afridi","Pakistani", 92, 36);
        Player hassan = new Bowler("Bowler", "Hassan", "Ali","Pakistani",86, 83);
        Player sarfraz = new Batter("Batter", "Sarfraz","Ahmed", "Pakistani", 80, 79);
        Player shadab = new Bowler("Bowler", "Shadab","khan","Pakistani",84,85 );
        Player babar = new Batter("Batter", "Babar", "Azam", "Pakistani", 75, 87);
        Player usman = new Bowler("Bowler", "Usman", "Khawaja", "Pakistani", 84, 76);
        Player hafeez = new Batter("Batter","Mohammad", "Hafeez", "Pakistani", 82,82);
        Player imad = new Bowler("Bowler", "Imad", "Wasim", "Pakistani", 86,80);
        Player fakhar = new Batter("Batter", "Fakhar", "Zaman", "Pakistani", 87,76);
        Player shaheen = new Bowler("Bowler", "Shaheen", "Afridi", "Pakistani", 85,82);
        Hashtable players= new Hashtable();
        players.put(0,afridi);
        players.put(1,hassan);
        players.put(2,sarfraz);
        players.put(3,shadab);
        players.put(4,babar);
        players.put(5,usman);
        players.put(6,hafeez);
        players.put(7,imad);
        players.put(8,fakhar);
        players.put(9,shaheen);
        return players;
    }

    public static Player getPlayer(Hashtable<Player, Player> players){
        int random = (int) (Math.random()*10);
        Player current = players.get(random);
        while(current.role != "Batter"){
            random = (int) (Math.random()*10);
            current = players.get(random);
        }
        return current;
    }
}
