import java.io.*;
import java.util.*;

public class Pokemonsters {

	Player player;

	public static void main(String[] args) {
		player = new Player(getPlayerName(), createMonster());
		startgame();
		System.out.println("Thanks for playing!");
	}

	public static void startgame() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//0 - menu
		//1 - battle
		//2 - heal
		//3 - quit
		int state = 0;
		int healingcost = 10;
		cls();
		while (player.getMonster().isAlive()) {
			int response = -1;
			if (state == 0) {
				System.out.println("1 Battle");
				System.out.println("2 Heal - " + healingcost + " gold");
				System.out.println("3 Quit Game");
				System.out.println();
				System.out.println("Player money - " + player.getMoney());
				System.out.print("Pick an action number: ");
				response = Integer.parseInt(br.readLine());
				state = response;
				if (state < 1 || state > 3)
					state = 0;
			} else if (state == 1) {
				startbattle();
			} else if (state == 2) {
				healplayer();
				cls();
				System.out.println("Your monster was healed!\n");
			} else if (state == 3) {
				return;
			}
		}
		cls();
		System.out.println(player.getMonster().getName() + " died in a battle.");
	}

	public static void startbattle() {
		Monster enemy;
		int randommonster = (int) (1 + Math.random() * 3);
		if (randmomonster == 1) {
			enemy = new FireMon(player.getMonster().getLevel());
		} else if (randommonster == 2) {
			enemy = new WaterMon(player.getMonster().getLevel());
		} else if (randommonster == 3) {
			enemy = new EarthMon(player.getMonster().getLevel());
		}
		while (player.getMonster().isAlive() && enemy.getMonster().isAlive()) {
			displayFight(enemy);
		}
	}

	public static void displayFight(Monster enemy) {
		System.out.println(player.getMonster().getName());
		System.out.println("-----");
		System.out.println("Health: " + player.getMonster().getHealth());
		System.out.println();
		System.out.println(enemy.getName());
		System.out.println("-----");
		System.out.println("Health: " + player.getMonster().getHealth());
		System.out.println("\n");
		System.out.println(player.getMonster().getMoveList());
	}

	public static void healplayer() {
		player.healMonster();
	}

	public static String getPlayerName() throws IOException {
		cls();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		while (name.length() == 0) {
			System.out.print("Input your name: ");
			name = br.readLine();
			System.out.println("Is your name " + name + "?");
			System.out.print("y/n: ");
			if (br.readline().charAt(0) == 'n')
				name = "";
		}
		return name;
	}

	public static Monster createMonster() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type = -1;
		while (type == -1) {
			cls();
			System.out.println("1 FireMon");
			System.out.println("2 WaterMon");
			System.out.println("3 EarthMon");
			System.out.print("Pick a number: ");
			type = Integer.parseInt(br.readLine());
			if (type < 1 || type > 3)
				type = -1;
		}
		String name = "";
		String newname = "";
		if (type == 1) name = "FireMon";
		else if (type == 2) name = "WaterMon";
		else if (type == 3) name = "EarthMon";
		while (newname.length() == 0) {
			cls();
			System.out.println("Pick a new name for " + name);
			System.out.print("New Name: ");
			newname = br.readLine();
			System.out.println("Is your monster's name " + newname + "?");
			System.out.print("y/n: ");
			if (br.readLine().getCharAt(0) == 'n')
				newname = "";
		}
		name = newname;
		if (type == 1) {
			return new FireMon(name);
		} else if (type == 2) {
			return new WaterMon(name);
		} else if (type == 3) {
			return new EarthMon(name);
		}
		return null;
	}

	public static 

	public static void cls() {
		for (int i = 0; i < 10; i++) {
			System.out.println("\n\n\n\n\n");
		}
	}
}