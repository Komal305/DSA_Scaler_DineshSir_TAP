package udemydatastructure.stack;

public class Parents {
String fatherName;
String motherName;
int anniversaryDate;

public Parents(String fatherName, String motherName, int anniversaryDate) {
	super();
	this.fatherName = fatherName;
	this.motherName = motherName;
	this.anniversaryDate = anniversaryDate;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public int getAnniversaryDate() {
	return anniversaryDate;
}
public void setAnniversaryDate(int anniversaryDate) {
	this.anniversaryDate = anniversaryDate;
}
@Override
public String toString() {
	return "Parents [fatherName=" + fatherName + ", motherName=" + motherName + ", anniversaryDate=" + anniversaryDate
			+ "]";
}


}
