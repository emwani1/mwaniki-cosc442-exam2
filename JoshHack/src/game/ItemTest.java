package game;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	Item item;
	char glypy = 'a';
	Color color = new Color (2,3,4,5);
	String name = "knife";
	String appearance = "nice";
	
	

	@Before
	public void setUp() throws Exception {
		item = new Item (glypy,color,name,appearance);
	}

	@After
	public void tearDown() throws Exception {
		item = null;
	}

	@Test
	public void testGlyph() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(glypy,item.glyph());
	}
	

	@Test
	public void testColor() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(color,item.color());
	}

	@Test
	public void testName() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(name,item.name());
	}

	@Test
	public void testAppearance() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(appearance,item.appearance());
	}

	@Test
	public void testFoodValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(0,item.foodValue(),0.001);
	}

	@Test
	public void testModifyFoodValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyFoodValue(modify);
		assertEquals(10,item.foodValue(),0.001);
	}

	@Test
	public void testAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(0,item.attackValue(),0.001);
	}

	@Test
	public void testModifyAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyAttackValue(modify);
		assertEquals(10,item.attackValue(),0.001);
	}

	@Test
	public void testDefenseValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(0,item.defenseValue(),0.001);
	}

	@Test
	public void testModifyDefenseValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyDefenseValue(modify);
		assertEquals(10,item.defenseValue(),0.001);
	}

	@Test
	public void testThrownAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(0,item.attackValue(),0.001);
	}
	

	@Test
	public void testModifyThrownAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyAttackValue(modify);
		assertEquals(10,item.attackValue(),0.001);
	}

	@Test
	public void testRangedAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(0,item.rangedAttackValue(),0.001);
	}

	@Test
	public void testModifyRangedAttackValue() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyRangedAttackValue(modify);
		assertEquals(10,item.rangedAttackValue(),0.001);
	}

	@Test
	public void testQuaffEffect() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		assertEquals(null,item.quaffEffect());
	}

	@Test
	public void testSetQuaffEffect() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		Effect effect = new Effect (10);
		item.setQuaffEffect(effect);
		assertEquals(effect,item.quaffEffect());
	}

	@Test
	public void testWrittenSpells() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		List<Spell> sp = new ArrayList<Spell>();
		assertEquals(sp,item.writtenSpells());
	}

	@Test
	public void testAddWrittenSpell() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		Effect effect = new Effect (10);
		int manaCost = 10;
		String name = "abracadbra";
		item.addWrittenSpell(name, manaCost, effect);
		List<Spell> sp = item.writtenSpells();
		assertEquals(sp,item.writtenSpells());
	}

	@Test
	public void testDetails() {
		try{
			setUp();
			
		}catch(Exception e ){
			e.printStackTrace();
		}
		int modify = 10;
		item.modifyThrownAttackValue(modify);
		String details = "";
		details += "  thrown:" + item.thrownAttackValue();
		
		assertEquals(details,item.details());
		
		
	}

}
