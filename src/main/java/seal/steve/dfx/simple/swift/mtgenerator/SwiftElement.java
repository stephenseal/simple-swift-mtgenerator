/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator;

/**
 * This class represents a Swift Element.  Swift Elements will have a set of;
 * <br>
 * <ul>
 * 		<li>delimiters</li>
 * 		<li>key</li>
 * 		<li>data</li>
 * </ul> 
 * <br>
 * Some of the data elements will be mandatory and therefore have to be 
 * populated with something.  Some of the data elements will have a 
 * format specification that are implemented as REGEX items
 * 
 * @author Steve Seal (U776998)
 *
 */
public class SwiftElement {

	/**
	 * 
	 */
	public SwiftElement() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param elementDelimiterStart
	 * @param keyValue
	 * @param elementDelimiterEnd
	 * @param dataValue
	 * @param mandatory
	 * @param order
	 */
	public SwiftElement(String elementDelimiterStart, String keyValue, String elementDelimiterEnd, String dataValue,
			boolean mandatory, int order) {
		super();
		this.elementDelimiterStart = elementDelimiterStart;
		this.keyValue = keyValue;
		this.elementDelimiterEnd = elementDelimiterEnd;
		this.dataValue = dataValue;
		this.mandatory = mandatory;
		this.order = order;
	}

	/**
	 * @param keyValue
	 * @param mandatory
	 * @param order
	 */
	public SwiftElement(String keyValue, boolean mandatory, int order) {
		super();
		this.keyValue = keyValue;
		this.mandatory = mandatory;
		this.order = order;
	}

	/**
	 * @param keyValue
	 * @param mandatory
	 */
	public SwiftElement(String keyValue, boolean mandatory) {
		super();
		this.keyValue = keyValue;
		this.mandatory = mandatory;
	}

	/**
	 * @param keyValue
	 */
	public SwiftElement(String keyValue) {
		super();
		this.keyValue = keyValue;
	}

	/**
	 * 
	 */
	private String elementDelimiterStart = "??:";
	
	/**
	 * 
	 */
	private String keyValue;
	
	/**
	 * 
	 */
	private String elementDelimiterEnd = ":";	
	
	/**
	 * 
	 */
	private String dataValue = "";
	
	/**
	 * 
	 */
	private boolean mandatory = false;

	/**
	 * 
	 */
	private int order;
	
	

	/**
	 * @return the elementDelimiterStart
	 */
	public String getElementDelimiterStart() {
		return elementDelimiterStart;
	}



	/**
	 * @param elementDelimiterStart the elementDelimiterStart to set
	 */
	public void setElementDelimiterStart(String elementDelimiterStart) {
		this.elementDelimiterStart = elementDelimiterStart;
	}



	/**
	 * @return the keyValue
	 */
	public String getKeyValue() {
		return keyValue;
	}



	/**
	 * @param keyValue the keyValue to set
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}



	/**
	 * @return the elementDelimiterEnd
	 */
	public String getElementDelimiterEnd() {
		return elementDelimiterEnd;
	}



	/**
	 * @param elementDelimiterEnd the elementDelimiterEnd to set
	 */
	public void setElementDelimiterEnd(String elementDelimiterEnd) {
		this.elementDelimiterEnd = elementDelimiterEnd;
	}



	/**
	 * @return the dataValue
	 */
	public String getDataValue() {
		return dataValue;
	}



	/**
	 * @param dataValue the dataValue to set
	 */
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}



	/**
	 * @return the mandatory
	 */
	public boolean isMandatory() {
		return mandatory;
	}



	/**
	 * @param mandatory the mandatory to set
	 */
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}



	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}



	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}
	
	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String tmp = "";
		if( ( !this.dataValue.isEmpty() && !this.isMandatory() ) || 
				this.isMandatory() ) {
			tmp = elementDelimiterStart +keyValue + elementDelimiterEnd+ dataValue; 
		}
		return tmp;
	}
	
}
