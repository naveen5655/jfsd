package DAO;
import java.util.*;
import naveen.Player;
public interface PlayerDAO {
    public String insertNewPlayer(Player player);
    public Player getPlayer(int playerId);
    public List<Player> getAllPlayers();
}
