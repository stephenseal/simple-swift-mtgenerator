/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator;

/**
 * @author Steve Seal (U776998)
 *
 */
public interface Generatable {
	
	/**
	 * 
	 * @param tradeData
	 * @param additionalData
	 * @return
	 * @throws MTGenerationException
	 */
	String generate(Object tradeData, Object additionalData) throws MTGenerationException;

}
