package com.wildermods.mixinmash.api;

@SuppressWarnings("serial")
public class DecompilationException extends Exception {

	public DecompilationException() {
		super();
	}
	
	public DecompilationException(String reason) {
		super(reason);
	}
	
	public DecompilationException(Throwable cause) {
		super(cause);
	}
	
	public DecompilationException (String reason, Throwable cause) {
		super(reason, cause);
	}
	
}
