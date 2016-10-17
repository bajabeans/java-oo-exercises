package robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void testAddSpeed() {
		Robot r = new Robot("r1", 4, 2, 5, "North");
		assertTrue("Problem setting speed", r.getSpeed() == 5);
		r.addSpeed(5);
		assertTrue("Problem adding speed", r.getSpeed() == 10);
	}

	@Test
	public void testChangePosition() {
		Robot r = new Robot("r1", 4, 2, 5, "North");
		assertTrue("Problem setting initial position X", r.getPostionX() == 4);
		assertTrue("Problem setting initial position Y", r.getPositionY() == 2);
		r.changePosition();
		assertTrue("Problem changing position X", r.getPostionX() == 4);
		assertTrue("Problem changing position Y", r.getPositionY() == 7);
		
	}
	
	@Test
	public void testChangeOrientation() {
		Robot r = new Robot("r1", 4, 2, 5, "North");
		assertTrue("Problem setting orientation", r.getOrientation() == "North");
		r.changeOrientation("left");
		assertTrue("Problem changing orientation", r.getOrientation() == "West");
	}
	
	@Test
	public void testCharge() {
		Attacker a = new Attacker("r1", 4, 2, 5, "North");
		assertTrue("Problem with initial charge, should be False", a.getCharge() == false );
		a.chargeAttack();
		assertTrue("Issue with charging attack, should be True", a.getCharge() == true);
	}
}

