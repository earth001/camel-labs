package com.redhat.gpte.training.camel.model;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class Student {

	@DataField(pos = 1, position = 1)
	private String Name;
	@DataField(pos = 2, position = 2)
	private String Course;
	@DataField(pos = 3, position = 3)
	private Integer code;
	@DataField(pos = 4, pattern = "dd-MM-yyyy", position = 4)
	private Date creationDate;
	@DataField(pos = 5, required = false, position = 5)
	private String Status;
	@DataField(pos = 6, required = false, position = 6)
	private String room;

	public String isStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
