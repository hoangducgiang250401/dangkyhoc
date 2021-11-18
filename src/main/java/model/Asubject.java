package model;

public class Asubject {
	private int id_sj;
	private String subjectname;
	private int credis;
	private String classname;
	private int maxsd;
	private int thu;
	private String period;
	private String room;
	private int id_lt;
	
	public int getId_sj() {
		return id_sj;
	}
	public void setId_sj(int id_sj) {
		this.id_sj = id_sj;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public int getCredis() {
		return credis;
	}
	public void setCredis(int credis) {
		this.credis = credis;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getMaxsd() {
		return maxsd;
	}
	public void setMaxsd(int maxsd) {
		this.maxsd = maxsd;
	}
	public int getThu() {
		return thu;
	}
	public void setThu(int thu) {
		this.thu = thu;
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
	public int getId_lt() {
		return id_lt;
	}
	public void setId_lt(int id_lt) {
		this.id_lt = id_lt;
	}
	public Asubject(int id_sj, String subjectname, int credis, String classname, int maxsd, int thu, String period,
			String room, int id_lt) {
		super();
		this.id_sj = id_sj;
		this.subjectname = subjectname;
		this.credis = credis;
		this.classname = classname;
		this.maxsd = maxsd;
		this.thu = thu;
		this.period = period;
		this.room = room;
		this.id_lt = id_lt;
	}
	public Asubject() {
		super();
	}
	@Override
	public String toString() {
		return "Asubject [id_sj=" + id_sj + ", subjectname=" + subjectname + ", credis=" + credis + ", classname="
				+ classname + ", maxsd=" + maxsd + ", thu=" + thu + ", period=" + period + ", room=" + room + ", id_lt="
				+ id_lt + "]";
	}
	
}
