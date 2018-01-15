/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * This represents Sequence E1A1 on the SWIFT MT300 
 * format
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SequenceE1a1 {

	/**
	 * 
	 */
	public SequenceE1a1() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * PUTI Namespace/Issuer Code
	 */
	SwiftElement elem22P = new SwiftElement("22P", true);
	
	/**
	 * Prior Transaction Identifier
	 */
	SwiftElement elem22R = new SwiftElement("22R", true);

	/**
	 * @return the elem22P
	 */
	public SwiftElement getElem22P() {
		return elem22P;
	}

	/**
	 * @param elem22p the elem22P to set
	 */
	public void setElem22P(SwiftElement elem22p) {
		elem22P = elem22p;
	}

	/**
	 * @return the elem22R
	 */
	public SwiftElement getElem22R() {
		return elem22R;
	}

	/**
	 * @param elem22r the elem22R to set
	 */
	public void setElem22R(SwiftElement elem22r) {
		elem22R = elem22r;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return elem22P.toString() 
			 + elem22R.toString();
	}

}
