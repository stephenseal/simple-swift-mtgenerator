/**
 * 
 */
package seal.steve.dfx.simple.swift.mtgenerator.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import seal.steve.dfx.simple.swift.mtgenerator.Generatable;
import seal.steve.dfx.simple.swift.mtgenerator.mt300.Generator;

/**
 * @author Steve
 *
 */
@RestController
public class SwiftMT300Controller {

	/**
	 * 
	 */
	public SwiftMT300Controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * The MT300 generator...
	 */
	Generatable generator = new Generator();
	
    /**
     * 
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * 
     * @param name
     * @return
     */
    @RequestMapping("/mt300")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
    	String returnString = new String("MT300");
    	try {
    		returnString = generator.generate("HELLO",  "WORLD");
    	} catch(Exception e) {
    		System.out.println("An exception occured : " + e.getMessage());
    	}
    	
        return returnString;
    }
	
}
