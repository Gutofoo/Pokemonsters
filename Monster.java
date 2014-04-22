public class Monster {
	
	String name;
	int level;
	int hp;
	int att;
	int def;
	int speed;
	double crit;

	public Monster(int level, Sting name) {
		this.level = level;
		this.name = name;
		generateStats();
	}

	public int getHp() {
		return hp;
	}

	public int getLevel() {

		return level;
	}
	
	public int getAtt() {
		return att;
	}

	public int getDef() {
		return def;
	}
	
	public double getCrit() {
		return crit;
	}

	public int getSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}

}
