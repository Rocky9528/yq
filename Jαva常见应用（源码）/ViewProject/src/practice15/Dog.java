package practice15;

public class Dog {
	private int id ; 
	private String name;
	private int score ; 
	private int level ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "id:"+this.getId()+",name:"+this.getName()+",score:"+this.getScore()+",level:"+this.getLevel();
	}
	
}
