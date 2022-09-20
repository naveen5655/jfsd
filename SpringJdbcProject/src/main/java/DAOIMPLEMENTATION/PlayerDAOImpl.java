package DAOIMPLEMENTATION;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import DAO.PlayerDAO;
import naveen.Player;

@Repository("PlayerDAO")
public class PlayerDAOImpl implements PlayerDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
	public String insertNewPlayer(Player player) {
		String vsql = "insert into Player(name,age,matches) values (?,?,?)";
		int n = getJdbcTemplate().update(vsql,new  Object[] {player.getName(),player.getAge(),player.getMatches()});
		if(n==1)
			return "Record Insertion sucessfully";
		else
		    return "Record Insertion Fail";
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Override
	public Player getPlayer(int playerId) {
		String vsql = "select player_id,name,age,matches from player where player_id=?";
		Player p =(Player)getJdbcTemplate().queryForObject(vsql, new Object[] {playerId}, new BeanPropertyRowMapper(Player.class));
		return p;
	}

	@Override
	public List<Player> getAllPlayers() {
		String vsql = "select player_id,name,age,matches from player";
		List<Player> plist =getJdbcTemplate().query(vsql, new BeanPropertyRowMapper(Player.class));
		return plist;
	}

}
