/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * Sequence B - Transaction Details
 * 
 * @author Steve
 *
 */
public class SequenceB {

	/**
	 * 
	 */
	public SequenceB() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * New Sequence
	 */
	SwiftElement elem15B = new SwiftElement("15B", true);
	
	/**
	 * Trade Date
	 */
	SwiftElement elem30T = new SwiftElement("30T", true);
	
	/**
	 * Value Date
	 */
	SwiftElement elem30V = new SwiftElement("30V", true);
	
	/**
	 * Exchange Rate
	 */
	SwiftElement elem36 = new SwiftElement("36", true);
	
	/**
	 * Sub sequence - Amount Bought
	 */
	SubSequenceB1 subsequenceB1 = new SubSequenceB1();
	
	/**
	 * Sub sequence - Amount Sold
	 */
	SubSequenceB2 subsequenceB2 = new SubSequenceB2();

	/**
	 * @return the elem15B
	 */
	public SwiftElement getElem15B() {
		return elem15B;
	}

	/**
	 * @param elem15b the elem15B to set
	 */
	public void setElem15B(SwiftElement elem15b) {
		elem15B = elem15b;
	}

	/**
	 * @return the elem30T
	 */
	public SwiftElement getElem30T() {
		return elem30T;
	}

	/**
	 * @param elem30t the elem30T to set
	 */
	public void setElem30T(SwiftElement elem30t) {
		elem30T = elem30t;
	}

	/**
	 * @return the elem30V
	 */
	public SwiftElement getElem30V() {
		return elem30V;
	}

	/**
	 * @param elem30v the elem30V to set
	 */
	public void setElem30V(SwiftElement elem30v) {
		elem30V = elem30v;
	}

	/**
	 * @return the elem36
	 */
	public SwiftElement getElem36() {
		return elem36;
	}

	/**
	 * @param elem36 the elem36 to set
	 */
	public void setElem36(SwiftElement elem36) {
		this.elem36 = elem36;
	}

	/**
	 * @return the subsequenceB1
	 */
	public SubSequenceB1 getSubsequenceB1() {
		return subsequenceB1;
	}

	/**
	 * @param subsequenceB1 the subsequenceB1 to set
	 */
	public void setSubsequenceB1(SubSequenceB1 subsequenceB1) {
		this.subsequenceB1 = subsequenceB1;
	}

	/**
	 * @return the subsequenceB2
	 */
	public SubSequenceB2 getSubsequenceB2() {
		return subsequenceB2;
	}

	/**
	 * @param subsequenceB2 the subsequenceB2 to set
	 */
	public void setSubsequenceB2(SubSequenceB2 subsequenceB2) {
		this.subsequenceB2 = subsequenceB2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return elem15B.toString()
			 + elem30T.toString()
			 + elem30V.toString()
			 + elem36.toString()
			 + subsequenceB1.toString()
			 + subsequenceB2.toString();
	}
	
		
}
