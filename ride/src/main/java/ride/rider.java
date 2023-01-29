package ride;

public class rider {

	private int dID;
	private char fname;
	private char lname;
	private int carID;
	
	public int getdID() {
		return dID;
	}

	public void setdID(int dID) {
		this.dID = dID;
	}

	public char getFname() {
		return fname;
	}

	public void setFname(char fname) {
		this.fname = fname;
	}

	public char getLname() {
		return lname;
	}

	public void setLname(char lname) {
		this.lname = lname;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public rider(int dID, char fname, char lname, int carID) {
		super();
		this.dID = dID;
		this.fname = fname;
		this.lname = lname;
		this.carID = carID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
