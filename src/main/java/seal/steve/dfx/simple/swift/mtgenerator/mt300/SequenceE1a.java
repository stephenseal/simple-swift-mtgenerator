/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import java.util.ArrayList;
import java.util.List;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * Sequence E1a of the SWIFT MT300 message
 * format
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SequenceE1a {

	/**
	 * 
	 */
	public SequenceE1a() {
		SequenceE1a1 sequenceE1a1 = new SequenceE1a1();
		elemsE1a1.add(sequenceE1a1);	// There would appear to be at least 1
	}

	/**
	 * UTI Namespace / Issuer Code
	 */
	SwiftElement elem22M = new SwiftElement("22M", true);
	
	/**
	 * Transaction Identifier
	 */
	SwiftElement elem22N = new SwiftElement("22N", true);
	
	/**
	 * List of Prior Unique Transaction Identifiers
	 */
	List<SequenceE1a1> elemsE1a1 = new ArrayList<SequenceE1a1>();
	
	/**
	 * @return the elem22M
	 */
	public SwiftElement getElem22M() {
		return elem22M;
	}
	
	/**
	 * @param elem22m the elem22M to set
	 */
	public void setElem22MData(SwiftElement elem22m) {
		elem22M = elem22m;
	}
	
	/**
	 * @return the elem22N
	 */
	public SwiftElement getElem22N() {
		return elem22N;
	}
	
	/**
	 * @param elem22n the elem22N to set
	 */
	public void setElem22N(SwiftElement elem22n) {
		elem22N = elem22n;
	}
	
	/**
	 * @return the elemsE1a1
	 */
	public List<SequenceE1a1> getElemsE1a1() {
		return elemsE1a1;
	}
	
	/**
	 * @param elemsE1a1 the elemsE1a1 to set
	 */
	public void setElemE1a1(SequenceE1a1 elemE1a1) {
		this.elemsE1a1.add(elemE1a1);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String tmp = elem22M.toString() + elem22N.toString();
		int numElemsE1a1 = elemsE1a1.size();
		for(int i=0; i<numElemsE1a1; i++) {
			SequenceE1a1 sequenceE1a1 = elemsE1a1.get(i);
			tmp = tmp + sequenceE1a1;
		}
		return tmp;
	}
	
	
	
}
