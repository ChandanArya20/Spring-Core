package in.ineuron.comp;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	
	private Map<Integer,String> facultyInfo;
	private Map<String,Date> datesInfo;
	private Properties iplTeams;
	
	public Map<Integer, String> getFacultyInfo() {
		return facultyInfo;
	}


	public void setFacultyInfo(Map<Integer, String> facultyInfo) {
		this.facultyInfo = facultyInfo;
	}


	public Map<String, Date> getDatesInfo() {
		return datesInfo;
	}


	public void setDatesInfo(Map<String, Date> datesInfo) {
		this.datesInfo = datesInfo;
	}


	public Properties getIplTeams() {
		return iplTeams;
	}


	public void setIplTeams(Properties iplTeams) {
		this.iplTeams = iplTeams;
	}
	
	@Override
	public String toString() {
		return "UniversityInfo [facultyInfo=" + facultyInfo + ", datesInfo=" + datesInfo + ", iplTeams=" + iplTeams
				+ "]";
	}
}
