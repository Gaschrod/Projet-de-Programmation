import java.util.*;

/** a class to represent type BOOL as a set in JML 
 * @author Tim Wahls & Nestor Catano & Victor Rivera
 */

public class BOOL extends BSet<Boolean> {
	public static final BOOL instance = new BOOL();

	/* @ public static initially BOOL.instance.has(true) && BOOL.instance.has(false); */
	
	private BOOL() {
		add(true);
		add(false);
	}
	
	/*@ requires true;
	 	assignable \nothing;
	 	ensures \result == (p ==> q);
	*/
	public static boolean implication(boolean p, boolean q){
		return (!p || q);
	}
	
	/*@ requires true;
	 	assignable \nothing;
	 	ensures \result == (p <==> q);
	*/
	public static boolean bi_implication(boolean p, boolean q){
		return (p && q) || (!p && !q);
	}
}