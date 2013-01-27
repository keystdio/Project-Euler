import java.util.*;

// create a mutable "BigInteger"(not arbitrary-precision, essentially a long type)
// enables a number to be used as an object instead of a primitive type.
public class ObjectNumber implements Comparable<ObjectNumber> {

	/**
	 * @param args
	 */
	private String value;
	
	public ObjectNumber(String value){
		this.value = value;
	}
	
	public int howManyDigits(){
		return value.length();
	}
	
	public void add(long add){
		value = Long.parseLong(value)+add+"";
	}
	
	public void setValue(String s){
		value = s;
	}
	
	public int compareTo(int n){
		int mine = Integer.parseInt(value);
		return mine - n;
	}
	
	public String toString(){
		return value;
	}
	
	public long getValue(){
		return Long.parseLong(value);
	}
	
	public int compareTo(ObjectNumber other){
		return (int)(this.getValue() - other.getValue());
	}
	
	
	public List<Integer> tear(){
		List<Integer> digits = new LinkedList<Integer>();
		for(int i = 0; i < value.length(); i++)
			digits.add(Integer.parseInt(""+value.charAt(i)));
		return digits;
	}
}
