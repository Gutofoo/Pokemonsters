public class Humon extends Monster {
	public Humon (int level) {
		generateStats(level);
		name = "HUMON";
		element = "normal";
	}
	
	private void generateStats(int level) {
		int templevel = (int) (level - 3) + Math.rand()*7;
		int temphp = (int) (100 + level/(Math.rand()*6));
		int tempatt = (int) (1 + level/(Math.rand());
		int tempdef (int) (1 + level/(Math.rand()*2));
	}
	
	
}