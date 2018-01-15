/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * SubSequence B1 (Amount Sold)
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SubSequenceB2 {

	/**
	 * 
	 */
	public SubSequenceB2() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Currency, Amount  
	 */
	SwiftElement elem33B = new SwiftElement("33B", true);
	
	/**
	 * Delivery Agent
	 */
	SwiftElement elem53a = new SwiftElement("53a");
	
	/**
	 * Intermediary
	 */
	SwiftElement elem56a = new SwiftElement("56a");
	
	/**
	 * Receiving Agent
	 */
	SwiftElement elem57a = new SwiftElement("57a", true);
	
	/**
	 * Beneficiary Institution
	 */
	SwiftElement elem58a = new SwiftElement("58a");

	/**
	 * @return the elem33B
	 */
	public SwiftElement getElem33B() {
		return elem33B;
	}

	/**
	 * @param elem33b the elem33B to set
	 */
	public void setElem33B(SwiftElement elem33b) {
		elem33B = elem33b;
	}

	/**
	 * @return the elem53a
	 */
	public SwiftElement getElem53a() {
		return elem53a;
	}

	/**
	 * @param elem53a the elem53a to set
	 */
	public void setElem53a(SwiftElement elem53a) {
		this.elem53a = elem53a;
	}

	/**
	 * @return the elem56a
	 */
	public SwiftElement getElem56a() {
		return elem56a;
	}

	/**
	 * @param elem56a the elem56a to set
	 */
	public void setElem56a(SwiftElement elem56a) {
		this.elem56a = elem56a;
	}

	/**
	 * @return the elem57a
	 */
	public SwiftElement getElem57a() {
		return elem57a;
	}

	/**
	 * @param elem57a the elem57a to set
	 */
	public void setElem57a(SwiftElement elem57a) {
		this.elem57a = elem57a;
	}

	/**
	 * @return the elem58a
	 */
	public SwiftElement getElem58a() {
		return elem58a;
	}

	/**
	 * @param elem58a the elem58a to set
	 */
	public void setElem58a(SwiftElement elem58a) {
		this.elem58a = elem58a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return elem33B.toString() 
			 + elem53a.toString()
			 + elem56a.toString()
			 + elem57a.toString()
			 + elem58a.toString();
	}	
	
}
