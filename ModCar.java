public class ModCar {
	private String color;
	private int horsepower;
	private double enginesize;
	private String make;
	
	int i = 0;
	int count = i;
	/**
	 * Car class constructor with color, horsepower, enginesize and make
	 */
	
	public ModCar () {
		this("Green", 350, 4.5, "Toyota");
		
	}
	
	/**
	 * 
	 * @param color
	 * @param horsepower
	 * @param enginesize
	 * @param make
	 */
	
	public ModCar(String color, int horsepower, double enginesize, String make) {
		this.color = color;
		this.horsepower = horsepower;
		this.enginesize = enginesize;
		this.make = make;
		i++;
		i=count;
	}
	
	/**
	 * 
	 * @return Color
	 */
	
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @param color
	 */
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * @returnHorsepower
	 */
	
	public int gethorsepower () {
		return horsepower;
	}
	
	/**
	 * 
	 * @param horsepower
	 */
	
	public void sethorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * 
	 * @return Enginesize
	 */
	
	public double getenginesize () {
		return enginesize;
	}
	
	/**
	 * 
	 * @param enginesize
	 */
	
	public void setenginesize(double enginesize) {
		this.enginesize = enginesize;
	}
	
	/**
	 * 
	 * @return Make
	 */
	
	public String getmake () {
		return make;
	}
	
	public int count () {
		return count();
	}
	
	/**
	 * 
	 * @param make
	 */
	
	public void setmake(String make) {
		this.make = make;
	}
	
	/**
	 * Prints toString
	 */
	
	public String toString() {
		return this.color + " " + this.horsepower + " " + this.enginesize + " " + this.make + " " + i;
	}	
}