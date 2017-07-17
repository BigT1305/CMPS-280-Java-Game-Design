//Dustin M. Branch
import java.util.Scanner;
public class Characters{
	private int HP;
	private int attackDamage;
	private String name;
	private String attackName;
	
	public Characters(){	//Default constructor
		HP = 100;
		attackDamage = 10;
		name = "";
		attackName = "";
	}
	public Characters(int HP, int attackDamage, String name, String attackName){	//Regular Constructor
		this.HP = HP;
		this.attackDamage = attackDamage;
		this.name = name;
		this.attackName = attackName;
	}
	//Get methods
	public int getHP(){
		return HP;
	}
	public int getAttackDamage(){
		return attackDamage;
	}
	public String getName(){
		return name;
	}
	public String getAttackName(){
		return attackName;
	}
	//Set methods
	public void setHP(int HP){
		this.HP = HP;
	}
	public void setAttackDamage(int attackDamge){
		this.attackDamage = attackDamge;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAttackName(String attackName){
		this.attackName = attackName;
	}
	//More methods to come most likely
}
