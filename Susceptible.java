// Hosts that have never been infected.  Contains quantity.

public class Susceptible {

	private double value;
	private double storedValue;
	
    public Susceptible() {
    	value = 1 - Parameters.initialIProportion - Parameters.initialRProportion;;    
    	storedValue = 1 - Parameters.initialIProportion - Parameters.initialRProportion;;
    }
          
    public double getValue() {
    	return value;
    }      
    
    public void setValues(double x) {
    	value = x;
    	storedValue = x;
    }
	
	public void incrementStoredValue(double dx) {
		storedValue += dx;
		if (storedValue > 1) {
			storedValue = 1;
		}
	}
	
	public void decrementStoredValue(double dx) {
		storedValue -= dx;
		if (storedValue < 0) {
			storedValue = 0;
		}
	}	
	
	public void pushStoredValue() {
		value = storedValue;
	}

	public void print() {
		System.out.println("S = " + value);
	}
		
}