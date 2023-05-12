import java.util.Iterator;

/** Representation of the Event-B identity relation
 * @author Tim Wahls & Nestor Catano & Victor Rivera
 */

public class ID<E> extends BRelation<E, E> {
	public ID() {}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> true;
	 */
	public boolean isaFunction() {
		return true;
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.has(key) && \result.int_size() == 1;
	 */
	public BSet<E> elementImage(E key) {
		return BSet.singleton(key);
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.equals(keys);
	 */
	public BSet<E> image(BSet<E> keys) {
		return keys;
	}

	/*@ also requires true;
	 	assignable \nothing;
    	ensures \result.equals(this);
	 */
	public BRelation<E, E> inverse() {
		return (BRelation) super.clone();
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.has(value) && \result.int_size() == 1;
	 */
	public BSet<E> inverseElementImage(E value) {
		return new BSet<E>(value);
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.equals(values);
	 */
	public BSet<E> inverseImage(BSet<E> values) {
		return values;
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isDefinedAt(E key) {
		return true;
	}

	/*@ requires true;
	      assignable \nothing;
          signals (UnsupportedOperationException);
	 */
	public boolean add(E key, E value) {
		throw new UnsupportedOperationException("Error: cannot add to the identity relation.");
	}

	/*           requires true;
          assignable \nothing;
          signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> insert(Pair<E, E> pair) {
		throw new UnsupportedOperationException("Error: cannot add to the identity relation.");
	}

	/* 	 	  requires true;
          assignable \nothing;
          signals (UnsupportedOperationException);
	 */
	public int int_size() {
		throw new UnsupportedOperationException("Error: the identity relation is infinite.");
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> key.equals(value);
	 */
	public boolean has(E key, E value) {
		return key.equals(value);
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result <==> pair.fst().equals(pair.snd());
	 */
	public boolean has(Pair<E, E> pair) {
		return pair.fst().equals(pair.snd());
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> false;
	 */
	public boolean isEmpty() {
		return false;
	}

	/*@ also requires !(obj instanceof ID);
	      assignable \nothing;
	      ensures \result <==> false;
	    also requires obj instanceof ID;
	      assignable \nothing;
	      ensures \result <==> true;
	 */
	public boolean equals(Object obj) {
		return obj instanceof ID;
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result == "ID".hashCode();
	 */
	public int hashCode() {
		return "ID".hashCode();
	}

	/*     	requires true;
    	assignable \nothing;
    	signals (UnsupportedOperationException);
	 */
	public BSet<E> domain() {
		throw new UnsupportedOperationException("Error: cannot find the domain of the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BSet<E> range() {
		throw new UnsupportedOperationException("Error: cannot find the range of the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> removeFromDomain(E key) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public boolean remove(E key, E value) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public boolean remove(Pair<E, E> pair) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public boolean remove(Object obj) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result.equals(otherRel);
	 */
	public <D> BRelation<D, E> compose(BRelation<D, E> otherRel) {
		return otherRel;
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> union(BSet<Pair<E, E>> otherRel) {
		throw new UnsupportedOperationException("Error: cannot union with the identity relation.");
	}

	/*@ also requires true;
	 	assignable \nothing;
	 */
	public BRelation<E, E> intersection(BSet<Pair<E, E>> otherRel) {
		BRelation<E, E> res = new BRelation<E, E>();
		for (Pair<E, E> pair : otherRel) {
			if (pair.fst().equals(pair.snd())) {
				res = res.insert(pair);
			}
		}
		return res;
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> difference(BSet<Pair<E, E>> otherRel) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures (\forall E e; dom.has(e); \result.has(e, e));
	 */
	public BRelation<E, E> restrictDomainTo(BSet<E> dom) {
		return BRelation.cross(dom, dom);
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures (\forall E e; ran.has(e); \result.has(e, e));
	 */
	public BRelation<E, E> restrictRangeTo(BSet<E> ran) {
		return BRelation.cross(ran, ran);
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result.equals("ID".toString());
	 */
	public String toString() {
		return "ID";
	}

	/*           requires true;
          assignable \nothing;
          signals (UnsupportedOperationException);
	 */
	public Iterator<Pair<E,E>> associations() {
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public Iterator<Pair<E,E>> iterator() {
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BSet<Pair<E,E>> toSet() {
		throw new UnsupportedOperationException("Error: a set cannot contain the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BSet<Pair<E, BSet<E>>> imagePairSet() {
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public Iterator<Pair<E,E>> imagePairs() {
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public Iterator<E> domainElements()
	{
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public Iterator<E> rangeElements()
	{
		throw new UnsupportedOperationException("Error: cannot iterate over the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> toFunction() {
		throw new UnsupportedOperationException("Error: a function cannot contain the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> domainSubtraction(BSet<E> domain) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> rangeSubtraction(BSet<E> range) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isTotal(BSet<E> domain, BSet<E> range) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isSurjective(BSet<E> domain, BSet<E> range) {
		return true;
	}	

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isTotalSurjective(BSet<E> domain, BSet<E> range) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isFunction(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isRelation(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isTotalFunction(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isPartialInjection(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isTotalInjection(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isPartialSurjection(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isTotalSurjection(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
     	assignable \nothing;
        ensures \result <==> true;
	 */
	public boolean isInjection(BSet<E> dom, BSet<E> ran) {
		return true;
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.equals(otherRel);
	 */
	public <D> BRelation<E, D> backwardCompose(BRelation<E, D> otherRel) {
		return otherRel;
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BRelation<E, E> override(BRelation<E, E> other) {
		throw new UnsupportedOperationException("Error: cannot remove from the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public <D> BRelation<E, Pair<E, D>> parallel(BRelation<E, D> other) {
		throw new UnsupportedOperationException("Error: cannot parallel the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public <K1, V1> BRelation<Pair<E, K1>, Pair<E, V1>> directProd(BRelation<K1, V1> other) {
		throw new UnsupportedOperationException("Error: cannot direct product with the identity relation.");
	}

	/*@ also requires true;
	 	assignable \nothing;
        ensures \result.equals(key);
	 */
	public E apply(E key) {
		return key;
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BSet<BSet<Pair<E, E>>> pow() {
		throw new UnsupportedOperationException("Error: cannot compute powerset of the identity relation.");
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public BSet<BSet<Pair<E, E>>> pow1() {
		throw new UnsupportedOperationException("Error: cannot compute powerset of the identity relation.");
	}

	/*@ also requires true;
	 	assignable \nothing;
	    ensures \result <==> false;
	 */
	public boolean finite() {
		return false;
	}

	/** inherited specs for containsAll, sub and supersets and choose are correct */

	public boolean containsAll(java.util.Collection<?> col) {
		for (Object obj : col) {
			if (obj instanceof Pair) {
				Pair<E,E> pair = (Pair<E,E>) obj;
				if (!pair.fst().equals(pair.snd())) return false;
			}
			else return false;
		}
		return true;
	}

	public boolean isSubset(BSet<Pair<E, E>> other) {
		if (other instanceof ID) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isProperSubset(BSet<Pair<E, E>> other) {
		return false;
	}

	public boolean isSuperset(BSet<Pair<E, E>> other) {
		if (other instanceof ID) return true;
		for (Pair<E, E> pair : other) {
			if (!pair.fst().equals(pair.snd())) return false;
		}
		return true;
	}

	public boolean isProperSuperset(BSet<Pair<E, E>> other) {
		if (other instanceof ID) return false;
		return isSuperset(other);
	}

	/*@ requires true;
	assignable \nothing;
	signals (UnsupportedOperationException);
	 */
	public Pair<E, E> choose() {
		throw new UnsupportedOperationException("Error: cannot choose from the identity relation.");
	}

}