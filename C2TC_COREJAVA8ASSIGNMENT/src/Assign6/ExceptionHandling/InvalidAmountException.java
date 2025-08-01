package Assign6.ExceptionHandling;

	// Custom exception for invalid (negative or zero) amount

	class InvalidAmountException extends Exception {
		
	    public InvalidAmountException(String message) {
	        super(message);
	        
	    }
	}

