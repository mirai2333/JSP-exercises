package table.servlist;

public class ServList {
	private String SLid;
	private String SRname;
	private String SLstartTime;
	private String SLcloseTime;
	private String OMname;
	private String SLcontent;
	private String SLfee;
	private String SLfeeOk;
	private String SLlevel;
	
	public void setSLid(String str) {SLid = str;}
	public void setSRname(String str) {SRname = str;}
	public void setSLstartTime(String str) {SLstartTime = str;}
	public void setSLcloseTime(String str) {SLcloseTime = str;}
	public void setOMname(String str) {OMname = str;}
	public void setSLcontent(String str) {SLcontent = str;}
	public void setSLfee(String str) {SLfee = str;}
	public void setSLfeeOk(String str) {SLfeeOk = str;}
	public void setSLlevel(String str) {SLlevel = str;}
	
	public String getSLid() {return SLid;}
	public String getSRname() {return SRname;}
	public String getSLstartTime() {return SLstartTime;}
	public String getSLcloseTime() {return SLcloseTime;}
	public String getOMname() {return OMname;}
	public String getSLcontent() {return SLcontent;}
	public String getSLfee() {return SLfee;}
	public String getSLfeeOk() {return SLfeeOk;}
	public String getSLlevel() {return SLlevel;}
}
