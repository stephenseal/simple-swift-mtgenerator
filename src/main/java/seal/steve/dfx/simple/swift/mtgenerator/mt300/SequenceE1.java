/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import java.util.ArrayList;
import java.util.List;

import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * @author Steve Seal (U776998)
 *
 */
public class SequenceE1 {

	/**
	 * 
	 */
	public SequenceE1() {
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	SwiftElement elemMT22L = new SwiftElement("22L", true);
	
	/**
	 * Can be A, D or J
	 */
	SwiftElement elemMT91a = new SwiftElement("91a");
	
	/**
	 * The sequence list of E1a elements
	 */
	List<SequenceE1a> elemsE1a = new ArrayList<SequenceE1a>();

	/**
	 * @return the elemMT22L
	 */
	public SwiftElement getElemMT22L() {
		return elemMT22L;
	}

	/**
	 * @param elemMT22L the elemMT22L to set
	 */
	public void setElemMT22L(SwiftElement elemMT22L) {
		this.elemMT22L = elemMT22L;
	}

	/**
	 * @return the elemMT91a
	 */
	public SwiftElement getElemMT91a() {
		return elemMT91a;
	}

	/**
	 * @param elemMT91a the elemMT91a to set
	 */
	public void setElemMT91a(SwiftElement elemMT91a) {
		this.elemMT91a = elemMT91a;
	}

	/**
	 * @return the elemsE1a
	 */
	public List<SequenceE1a> getElemsE1a() {
		return elemsE1a;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String tmp = elemMT22L.toString() + elemMT91a.toString();
		int numElemsE1a = elemsE1a.size();
		for(int i=0; i<numElemsE1a; i++) {
			SequenceE1a sequenceE1a = elemsE1a.get(i);
			tmp = tmp + sequenceE1a;
		}
		return tmp;
	}
	
	

}
