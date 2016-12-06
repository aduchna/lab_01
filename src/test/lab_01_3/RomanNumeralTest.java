package lab_01_3;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import lab_01_3.RomanNumeral;

public class RomanNumeralTest {
	
	RomanNumeral roman1 = new RomanNumeral(4522);
	RomanNumeral roman2 = new RomanNumeral(-2);
	RomanNumeral roman3 = new RomanNumeral(76);
	RomanNumeral roman4 = new RomanNumeral(341);

	@Test(expected = IllegalArgumentException.class)
	public void outOfRangeValue(){
		roman1.toString();
		}
	
	@Test(expected = IllegalArgumentException.class)
	public void minusValue(){
		roman2.toString();
		}
	
	@Test
	public void toStringTest_TC1(){
	assertThat(roman3.toString(),is("LXXVI"));
	}
	
	@Test
	public void toStringTest_TC2(){
	assertThat(roman4.toString(),is("XLXLVIII"));
	}
}