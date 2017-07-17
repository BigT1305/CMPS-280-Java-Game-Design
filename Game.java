//Dustin M. Branch Final Project
import java.util.Scanner;
public class Game{
	public static void main(String [] args){
		Scanner numberInput = new Scanner(System.in);
		Scanner wordInput = new Scanner(System.in); //For String input only
		int difficulty;
		int numberOfEnemiesFacing = 0; //This variable will be used when add the level map code. Plans for it is to be used for the array of enemies determining how many the player faces.
		Characters [] playerTeam = new Characters[4];
		
		difficulty = selectDifficulty();
		
		if(difficulty == 1){
			//Some code that affects enemies health and attack damage
			Characters [] enemies = new Characters[numberOfEnemiesFacing];
		}
		else if(difficulty == 2){
			//Some code that affects enemies health and attack damage
			Characters [] enemies = new Characters[numberOfEnemiesFacing];
		}
		else{
			//Some code that affects enemies health and attack damage
			Characters [] enemies = new Characters[numberOfEnemiesFacing]; 
		}
		
		playerTeam = createTeam(playerTeam);
		
	}
	//Difficulty setting? 
	public static int selectDifficulty(){
		Scanner input = new Scanner(System.in);
		int userChoice;
		
		System.out.println("To start, select your difficulty.");
		System.out.println("1-Easy \n2-Medium \n3-Hard");
		userChoice = input.nextInt();
		
		return userChoice;
	}
	public static Characters[] createTeam(Characters [] team){
		//Any values for health and attack damage and attack names are open for change; this is mainly for a working game at the moment.
		//Tried to put this method in the Characters class code but kept getting a error so I moved over here.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Next, we're going to create your team.");
		System.out.println("The first hero on your team is your tank. Tanks absorb a large amount of damage, but return little.\nEnter the name of your first hero!");
		team[0] = new Characters(700, 50, input.next(), "Axe Swing");
		
		System.out.println("The second hero on your team is your mage. Mages deal heavy damage, but are very squishy. \nEnter the name of your second hero!");
		team[1] = new Characters(400, 100, input.next(), "Dark Magic");
		
		System.out.println("The third hero on your team is your marksmen. Marksmen deal heavy damage, but are also squishy. \nEnter the name of your third hero!");
		team[2] = new Characters(400, 150, input.next(), "Peircing Bow");
		
		System.out.println("Finally, the fourth hero on your team is your healer. Healers deal very small amounts of damage, but rather heal your teammates. \nEnter the name of your fourth hero!");
		team[3] = new Characters(450, 25, input.next(), "Some basic attack");//Need a name for their attack
		
		return team;
	}
	public static Characters[] createEnemyTeam(Characters [] enemyTeam, int numberOfEnemies){
		Characters mainBossName = new Characters(1500, 200, "MissingName", "Sword Slash");
		Characters orcs = new Characters(1000, 100, "Orc", "Club Smash");
		Characters dungeonDwellers = new Characters(500, 50, "Dungeon Dwellers", "Fierce Scratch");
		Characters skeletonWarriors = new Characters(250, 25, "Skeleton Warriors", "Dagger Slash");
		
		if(numberOfEnemies == 1){
			for(int i = 0; i < numberOfEnemies; i++){
				enemyTeam[i] = mainBossName;
			}
		}
		if(numberOfEnemies == 2){
			for(int i = 0; i < numberOfEnemies; i++){
				enemyTeam[i] = orcs;
			}
		}
		if(numberOfEnemies == 3){
			for(int i = 0; i < numberOfEnemies; i++){
				enemyTeam[i] = dungeonDwellers;
			}
		}
		else{
			for(int i = 0; i < numberOfEnemies; i++){
				enemyTeam[i] = skeletonWarriors;
			}
		}
		
		return enemyTeam;
	}
}
