
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;


public class INT extends BSet<Integer> {
	public static final INT instance = new INT();
	private java.util.Random rand = new java.util.Random();

    /* @ public initially (\forall int iv; INT.instance.has(iv)); */
	
	public INT() {}
	
	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> obj instanceof Integer;
	 */
	public boolean has(Object obj) {
		return obj instanceof Integer;
	}
	
	/*@ also requires true;
	 	assignable \nothing;
        ensures \result <==> (\forall Integer i; c.contains(i); this.has(i));
     */
	public boolean containsAll(java.util.Collection<?> c) {
		return true;
	}
	
	/*@ also requires other instanceof BSet;
	    assignable \nothing;
        ensures \result <==> (\forall Integer i; this.has(i) <==> ((BSet) other).has(i));
     */
	public boolean equals(Object other) {
		return other instanceof INT;
	}
	
	/*@ also 
	 	requires true;
	 	assignable \nothing;
        ensures \result <==> false;
     */
    public boolean isEmpty() {
    	return false;
    }
    
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
    public int int_size() {
        throw new UnsupportedOperationException("Error: size of the integers not representable");
    }  
    
    /*@ also requires true;
     	assignable \nothing;
        ensures \result == "INT".hashCode();
     */
    public int hashCode() {
    	return "INT".hashCode();
    }
    
    /* inherited specifications should be correct for all set operations */
    
    public boolean isSubset(TreeSet<Integer> s2) {
    	return s2 instanceof INT;
    }
    
    public boolean isProperSubset(TreeSet<Integer> s2) {
    	return false;
    }
    
    public  boolean isSuperset(TreeSet<Integer> s2) {
    	return true;
    }
    
    public boolean isProperSuperset(TreeSet<Integer> s2) {
    	return !(s2 instanceof INT);
    }
    
    public Integer choose() {
    	return rand.nextInt();
    }
    
    public Object clone() {
    	return this;
    }
    
    /*@
     	requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
    public BSet<Integer> insert(Integer i) {
    	throw new UnsupportedOperationException("Error: can't insert into the integers");
    }
    
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
    public BSet<Integer> remove(Integer i) {
    	throw new UnsupportedOperationException("Error: can't remove from the integers");
    }
    
    public BSet<Integer> intersection(TreeSet<Integer> s2) {
    	if (s2 instanceof BSet) {
    		return (BSet<Integer>) s2;
    	} else {
    		return new BSet<Integer>(s2);
    	}
    }
	 
    public BSet<Integer> union(TreeSet<Integer> s2) {
    	return this;
    }
    
    public BSet<Integer> difference(TreeSet<Integer> s2) {
    	if (s2 instanceof INT) {
    		return new BSet<Integer>();
    	} else {
    		throw new UnsupportedOperationException("Error: difference from the integers is infinite.");
    	}
    }
    
    /*@ also requires true;
     	assignable \nothing;
        ensures \result.equals("INT");
     */
    public String toString() {
    	return "INT";
    }
    
	public Iterator<Integer> toBag() {
    	throw new UnsupportedOperationException("Error: a bag cannot contain the integers.");		
	}
    
    public ArrayList<Integer> toSequence() {
    	throw new UnsupportedOperationException("Error: a sequence cannot contain the integers.");		
	}
	
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
	public Object [] toArray() {
    	throw new UnsupportedOperationException("Error: an array cannot contain the integers.");		
	}
	
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
	public Iterator<Integer> iterator() {
	   	throw new UnsupportedOperationException("Error: the integers are not iterable.");		
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> false;
	 */
    public boolean finite() {
    	return false;
    }
    
    /*@
	requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
     */
    public BSet<BSet<Integer>> pow() {
    	throw new UnsupportedOperationException("Error: can't compute POW(INT).");    	
    }
    
    /*@
	requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
     */
    public BSet<BSet<Integer>> pow1() {
    	throw new UnsupportedOperationException("Error: can't compute POW1(INT).");    	
    }
    
    /*@ also requires true;
     	assignable \nothing;
        ensures \result <==> parts.length == 1 && parts[0] instanceof INT;
     */
    public boolean INT_partition(BSet<Integer> ... parts) {
    	return parts.length == 1 && parts[0] instanceof INT;
    }
    
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
    public Integer max() {
    	throw new UnsupportedOperationException("Error: can't compute max of INT.");    	    	
    }
    
    /*@
        requires true;
        assignable \nothing;
        signals (UnsupportedOperationException);
     */
    public Integer min() {
    	throw new UnsupportedOperationException("Error: can't compute min of INT.");    	    	
    }
}