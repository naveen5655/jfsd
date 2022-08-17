package naveen;

public class Player {
	private int PlayerId;
	private String name;
	private int age;
	private int matches;
	public Player() {
		
	}
	public Player( String name, int age, int matches) {
		super();
		this.name = name;
		this.age = age;
		this.matches = matches;
	}
	public int getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	

}
