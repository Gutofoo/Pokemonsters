public class Player {
	
	private String name;
	private Monster monster;
	private int money;

	public Player(String name, Monster monster, int money) {
		this.name = name;
		this.monster = monster;
		this.money = money;
	}

	public void healMonster(int cost) {
		money -= cost;
		monster.heal();
	}

	public String getName() {
		return name;
	}

	public Monster getMonster() {
		return monster;
	}

	public int getMoney() {
		return money;
	}
}