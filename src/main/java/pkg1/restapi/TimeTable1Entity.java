package pkg1.restapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="timetable")
public class TimeTable1Entity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	String cname;
	String course;
	int year;
	String section;
	String subject;
	String teacher;
	String roomNo;
	String dayOfWeek;
	int periodNo;
	public TimeTable1Entity(long id, String cname, String course, int year, String section, String subject,
			String teacher, String roomNo, String dayOfWeek, int periodNo) {
		super();
		this.id = id;
		this.cname = cname;
		this.course = course;
		this.year = year;
		this.section = section;
		this.subject = subject;
		this.teacher = teacher;
		this.roomNo = roomNo;
		this.dayOfWeek = dayOfWeek;
		this.periodNo = periodNo;
	}
	public TimeTable1Entity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public int getPeriodNo() {
		return periodNo;
	}
	public void setPeriodNo(int periodNo) {
		this.periodNo = periodNo;
	}
	
	
	

}
