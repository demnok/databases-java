package demo.repository;

public class EmailService {
	private String fromField;
	private String subjectField;
	private String introPart;
	private String endingPart;
	
	public String getFromField() {
		return fromField;
	}
	public void setFromField(String fromField) {
		this.fromField = fromField;
	}
	public String getSubjectField() {
		return subjectField;
	}
	public void setSubjectField(String subjectField) {
		this.subjectField = subjectField;
	}
	public String getIntroPart() {
		return introPart;
	}
	public void setIntroPart(String introPart) {
		this.introPart = introPart;
	}
	public String getEndingPart() {
		return endingPart;
	}
	public void setEndingPart(String endingPart) {
		this.endingPart = endingPart;
	}
	
	
}
