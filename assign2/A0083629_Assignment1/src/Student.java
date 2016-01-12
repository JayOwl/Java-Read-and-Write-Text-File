
public class Student {
	private String fname;
	private String lname;
	private String studentID;
	/**
	 * 
	 */
	public Student() {
		super();
		fname = "unknown";
		lname = "unknown";
		studentID = "unknown";
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		if (fname != null && fname.length() > 0) {
			this.fname = fname;
		} else {
			this.fname = "unknown";					
			//System.out.println("Invalid Input");
		}
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		if (lname != null && lname.length() > 0) {
			this.lname = lname;
		} else {
			this.lname = "unknown";					
			//System.out.println("Invalid Input");
		}
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		if (studentID != null && studentID.length() > 0) {
			this.studentID = studentID;
		} else {
			this.studentID = "unknown";					
			//System.out.println("Invalid Input");
		}
	}

	/**
	 * @param fname
	 * @param lname
	 * @param studentID
	 */
	public Student(String fname, String lname, String studentID) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.studentID = studentID;
	}
}
