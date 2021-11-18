package model;

public class Subject {
	private int id_sj;
	private String subjectname;
	private int credis;
	private String classname;
	private int maxsd;
	private int dk;
	private String giaovien;
	private int thu;
	private String period;
	private String room;
	private String trang_thai;
	
	public String getTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(String trang_thai) {
		this.trang_thai = trang_thai;
	}
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
	public int getDk() {
		return dk;
	}
	public void setDk(int dk) {
		this.dk = dk;
	}
	public String getGiaovien() {
		return giaovien;
	}
	public void setGiaovien(String giaovien) {
		this.giaovien = giaovien;
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
	public Subject(int id_sj, String subjectname, int credis, String classname, int maxsd, int dk, String giaovien,
			int thu, String period, String room, String trang_thai) {
		super();
		this.id_sj = id_sj;
		this.subjectname = subjectname;
		this.credis = credis;
		this.classname = classname;
		this.maxsd = maxsd;
		this.dk = dk;
		this.giaovien = giaovien;
		this.thu = thu;
		this.period = period;
		this.room = room;
		this.trang_thai = trang_thai;
	}
	@Override
	public String toString() {
		return "Subject [id_sj=" + id_sj + ", subjectname=" + subjectname + ", credis=" + credis + ", classname="
				+ classname + ", maxsd=" + maxsd + ", dk=" + dk + ", giaovien=" + giaovien + ", thu=" + thu
				+ ", period=" + period + ", room=" + room + ", trang_thai=" + trang_thai + "]";
	}
	
}
