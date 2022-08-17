package naveen;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.PlayerDAO;

public class App {
   public static void main(String[] args)
   {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        PlayerDAO dao = (PlayerDAO)context.getBean("PlayerDAO");
	        
	        //inserting new Player
	        Player p = new Player("Naveen", 56, 5655);
	        String s = dao.insertNewPlayer(p);
	        System.out.println(s);
	        
	        //Retreiveing single player
	        p = dao.getPlayer(5);
	        System.out.println("Player ID:" + p.getPlayerId());
	        System.out.println("Player Name:" + p.getName());
	        System.out.println("Player Age:" + p.getAge());
	        System.out.println("Matches Played:" + p.getMatches());
	        
	        //retreiving all players
	        List<Player> plist = dao.getAllPlayers();
	        for(Player p1 : plist) {
	          System.out.println(p1.getPlayerId() + "\t" + p1.getName() + "\t" + p1.getAge() + "\t" + p1.getMatches());
	        }
   }
}
