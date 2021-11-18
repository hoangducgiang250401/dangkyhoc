package model;

public class AllRegisted {
	private int id_sd;
	private int id_sj;
	private String subjectName;
	private int credis;
	private String className;
	private String lecturerName;
	private String status;
	private int date;
	private String period;
	private String room;

	public int getId_sd() {
		return id_sd;
	}

	public void setId_sd(int id_sd) {
		this.id_sd = id_sd;
	}

	public int getId_sj() {
		return id_sj;
	}

	public void setId_sj(int id_sj) {
		this.id_sj = id_sj;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredis() {
		return credis;
	}

	public void setCredis(int credis) {
		this.credis = credis;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public AllRegisted() {
		super();
	}

	public AllRegisted(int id_sd, int id_sj, String subjectName, int credis, String className, String lecturerName,
			String status, int date, String period, String room) {
		super();
		this.id_sd = id_sd;
		this.id_sj = id_sj;
		this.subjectName = subjectName;
		this.credis = credis;
		this.className = className;
		this.lecturerName = lecturerName;
		this.status = status;
		this.date = date;
		this.period = period;
		this.room = room;
	}

	@Override
	public String toString() {
		return "AllRegisted [id_sd=" + id_sd + ", id_sj=" + id_sj + ", subjectName=" + subjectName + ", credis="
				+ credis + ", className=" + className + ", lecturerName=" + lecturerName + ", status=" + status
				+ ", date=" + date + ", period=" + period + ", room=" + room + "]";
	}
	
}
