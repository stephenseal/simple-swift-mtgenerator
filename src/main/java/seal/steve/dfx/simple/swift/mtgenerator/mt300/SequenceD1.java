/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * Split Settlement Details repeat
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SequenceD1 {

	/**
	 * 
	 */
	public SequenceD1() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Buy / Sell indicator
	 */
	SwiftElement elem17A = new SwiftElement("17A", true);
	
	/**
	 * Currency,Amount
	 */
	SwiftElement elem32B = new SwiftElement("32B", true);
	
	/**+
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
	SwiftElement elem57a = new SwiftElement("57a");
	
	/**
	 * Beneficiary Institution
	 */
	SwiftElement elem58a = new SwiftElement("58a");

	/**
	 * @return the elem17A
	 */
	public SwiftElement getElem17A() {
		return elem17A;
	}

	/**
	 * @param elem17a the elem17A to set
	 */
	public void setElem17A(SwiftElement elem17a) {
		elem17A = elem17a;
	}

	/**
	 * @return the elem32B
	 */
	public SwiftElement getElem32B() {
		return elem32B;
	}

	/**
	 * @param elem32b the elem32B to set
	 */
	public void setElem32B(SwiftElement elem32b) {
		elem32B = elem32b;
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
		return elem17A.toString() 
			 + elem32B.toString() 
			 + elem53a.toString() 
			 + elem56a.toString() 
			 + elem57a.toString() 
			 + elem58a.toString();
	}	
	
}