package model;

public class Student {
	
	private int id_sd;
	private String fullname;
	private	String course;
	private	String dateofbirth;
	private int disadvantaged;
	private String birthplace;
	
	public int getId_sd() {
		return id_sd;
	}
	public void setId_sd(int id_sd) {
		this.id_sd = id_sd;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getDisadvantaged() {
		return disadvantaged;
	}
	public void setDisadvantaged(int disadvantaged) {
		this.disadvantaged = disadvantaged;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public Student(int id_sd, String fullname, String course, String dateofbirth, int disadvantaged,
			String birthplace) {
		super();
		this.id_sd = id_sd;
		this.fullname = fullname;
		this.course = course;
		this.dateofbirth = dateofbirth;
		this.disadvantaged = disadvantaged;
		this.birthplace = birthplace;
	}
	@Override
	public String toString() {
		return "Student [id_sd=" + id_sd + ", fullname=" + fullname + ", course=" + course + ", dateofbirth="
				+ dateofbirth + ", disadvantaged=" + disadvantaged + ", birthplace=" + birthplace + "]";
	}
}
