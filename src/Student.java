

public class Student {
	int rollno;
	float marks;
	String name;
	
	
	public Student() {
		super();
		this.rollno = 0;
		this.marks = 0;
		this.name = " ";
	}
	/**
	 * @param rollno
	 * @param marks
	 * @param name
	 */
	public Student(int rollno, float marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the marks
	 */
	public float getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(float marks) {
		this.marks = marks;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
