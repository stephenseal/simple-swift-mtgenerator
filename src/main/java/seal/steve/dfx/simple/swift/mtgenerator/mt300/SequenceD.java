/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import java.util.ArrayList;
import java.util.List;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * Sequence D - Split Settlment Details
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SequenceD {

	/**
	 * 
	 */
	public SequenceD() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	SwiftElement elem15D = new SwiftElement("15D", true);
	
	/**
	 * List of Split Settlements 
	 */
	List<SequenceD1> elemsD1 = new ArrayList<SequenceD1>();
	
	/**
	 * Number of Settlements
	 */
	SwiftElement elem16A = new SwiftElement("16A", true);

	/**
	 * @return the elem15D
	 */
	public SwiftElement getElem15D() {
		return elem15D;
	}

	/**
	 * @param elem15d the elem15D to set
	 */
	public void setElem15D(SwiftElement elem15d) {
		elem15D = elem15d;
	}

	/**
	 * @return the elemsD1
	 */
	public List<SequenceD1> getElemsD1() {
		return elemsD1;
	}

	/**
	 * @param elemsD1 the elemsD1 to set
	 */
	public void setElemD1(SequenceD1 elemD1) {
		this.elemsD1.add(elemD1);
	}

	/**
	 * @return the elem16A
	 */
	public SwiftElement getElem16A() {
		return elem16A;
	}

	/**
	 * @param elem16a the elem16A to set
	 */
	public void setElem16A(SwiftElement elem16a) {
		elem16A = elem16a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String tmp = elem15D.toString();
		int numElemsD1 = elemsD1.size();
		for(int i = 0; i<numElemsD1; i++) {
			SequenceD1 sequenceD1 = (SequenceD1)elemsD1.get(i);
			tmp = tmp + sequenceD1.toString();
		}
		tmp = tmp + elem16A.toString();
		return tmp;
	}
	
	

}
