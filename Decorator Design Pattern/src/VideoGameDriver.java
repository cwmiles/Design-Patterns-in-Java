import java.text.NumberFormat;
import java.util.Locale;

public class VideoGameDriver {
	
	public VideoGameDriver() {}
	
	public void play() {
		Player mage = new Mage("Alex");
		mage = new Skill(mage);
		mage = new ArmorUpgrade(mage);
		
		Player warrior = new Warrior("Jenny");
		warrior = new WeaponUpgrade(warrior);
		warrior = new ArmorUpgrade(warrior);
		
		Player healer = new Healer("Ben");
		healer = new Skill(healer);
		
		System.out.println("***** Players ******\n");
		displayPlayer(mage);
		displayPlayer(warrior);
		displayPlayer(healer);
	}
	
	private void displayPlayer(Player player) {
		System.out.println(player);
		System.out.println("Power:  " + player.getPower());
		System.out.println();
	}

	public static void main(String[] args) {
		VideoGameDriver driver = new VideoGameDriver();
		driver.play();
	}
}
