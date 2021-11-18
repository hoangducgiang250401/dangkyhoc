package model;

public class Da_hoc {
	private int id_sd;
	private int id_sj;
	private String stt;
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
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public Da_hoc(int id_sd, int id_sj, String stt) {
		super();
		this.id_sd = id_sd;
		this.id_sj = id_sj;
		this.stt = stt;
	}
	@Override
	public String toString() {
		return "da_hoc [id_sd=" + id_sd + ", id_sj=" + id_sj + ", stt=" + stt + "]";
	}
}
