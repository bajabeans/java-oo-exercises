package robot;

public class Attacker extends Robot{
	
	private boolean charge = false;
	
	public Attacker(String name, int positionX, int positionY, int speed, String orientation)
	{
		super(name, positionX,positionY,speed,orientation);
	}
	
	public void chargeAttack()
	{
		charge = true;
	}
	
	public boolean getCharge()
	{
		return this.charge;
	}
	public void attack()
	{
		int damageDone = (int)(Math.random() *10);
		int damageTaken = (int)(Math.random() * 10);
		if(charge == true)
		{
			charge = false;
			System.out.println("I attacked and did " + (damageDone*2) + " damage!");
		}
		else
		{
			System.out.println("I attacked and did " + damageDone + " damage!");
		
		}
		if(Math.random() < .5)
		{
			System.out.println("Ahhh, I'm hit for " + damageTaken + "!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attacker at1 = new Attacker("atlas 1" , 0, 0, 2, "North");
		at1.chargeAttack();
		at1.attack();

	}



}
