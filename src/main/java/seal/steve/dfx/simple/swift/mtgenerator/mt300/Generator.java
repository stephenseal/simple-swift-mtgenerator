/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.mt300;

import java.util.ArrayList;
import java.util.List;

import seal.steve.dfx.simple.swift.mtgenerator.Generatable;
import seal.steve.dfx.simple.swift.mtgenerator.MTGenerationException;
import seal.steve.dfx.simple.swift.mtgenerator.SwiftElement;

/**
 * MT300 SWIFT Generator - This includes ALL sequence
 * <br>
 * NOTE: It hasn't yet got any validation on the fields 
 * OR any overrides given field content
 * <br>
 * This implementation based upon the following URL;
 * <br>
 * https://www.swift.com/sites/default/files/resources/swift_standards_sr2017_cat3advanceinfo.pdf
 * 
 * @author Steve Seal (U776998)
 *
 */
public class Generator implements Generatable {
	
	/**
	 * General Information About the Transation
	 */
	private SequenceA sequenceA = new SequenceA();
	
	/**
	 * Transaction Details
	 */
	private SequenceB sequenceB = new SequenceB();
	
	/**
	 * Optional General Information
	 */
	private SequenceC sequenceC = new SequenceC();
	
	/**
	 * Split Settlement Details
	 */
	private SequenceD sequenceD = new SequenceD();
	
	/**
	 * Reporting Information
	 */
	private SequenceE sequenceE = new SequenceE(); 

	/**
	 * This would best be put into an externalised map or some form of config and passed in... 
	 */
	public Generator() {
		//TODO : Something perhaps...
	}

	/**
	 * This is where the actual MT300 message is constructed from the incoming
	 * Business Data (GBOM|UTM / Reference Data)
	 * <br>
	 * @see seal.steve.dfx.simple.swift.mtgenerator.Generatable#generate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public String generate(Object tradeData, Object additionalData) throws MTGenerationException {
		
		//TODO : Enter Business Data HERE!!!...
		
		return this.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return sequenceA.toString() 
			 + sequenceB.toString() 
			 + sequenceC.toString() 
			 + sequenceD.toString()
			 + sequenceE.toString();

	}

}
