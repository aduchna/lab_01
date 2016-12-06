package lab_01_3;

public class RomanNumeral {

	private int number;
	
	public RomanNumeral(int number) {
		this.number = number;
	}
	
	public String toString() {
	    if (number < 1 || number > 3999)
	    	throw new IllegalArgumentException ("Invalid Roman Number Value");
	    String s = "";
	    while (number >= 1000) {
	        s += "M";
	        number -= 1000;        }
	    while (number >= 900) {
	        s += "CM";
	        number -= 900;
	    }
	    while (number >= 500) {
	        s += "D";
	        number -= 500;
	    }
	    while (number >= 400) {
	        s += "CD";
	        number -= 400;
	    }
	    while (number >= 100) {
	        s += "C";
	        number -= 100;
	    }
	    while (number >= 90) {
	        s += "XC";
	        number -= 90;
	    }
	    while (number >= 50) {
	        s += "L";
	        number -= 50;
	    }
	    while (number >= 40) {
	        s += "XL";
	        number -= 40;
	    }
	    while (number >= 10) {
	        s += "X";
	        number -= 10;
	    }
	    while (number >= 9) {
	        s += "IX";
	        number -= 9;
	    }
	    while (number >= 5) {
	        s += "V";
	        number -= 5;
	    }
	    while (number >= 4) {
	        s += "IV";
	        number -= 4;
	    }
	    while (number >= 1) {
	        s += "I";
	        number -= 1;
	    }    
	    return s;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
