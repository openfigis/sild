package org.fao.fi.sild.service.search;

/**
 * Generic sild runtime exception. sild so far does not have checked exceptions, the idea behind is that checked
 * exceptions create a lot of ugly boilerplate code, and more important, all code should be tested so that exception
 * will not occur runtime.
 * 
 * 
 * 
 * 
 * 
 * @author Erik van Ingen
 * 
 */
public class SildException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2097071554504821684L;

	public SildException(Exception e) {
		super(e);
	}

	public SildException(String message) {
		super(message);
	}

}
