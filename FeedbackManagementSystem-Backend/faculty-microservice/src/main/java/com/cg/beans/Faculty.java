/**
 * @author Shivani
 * @data May 4, 2020
 * @time 10:27:44 AM
 */
package com.cg.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shivani
 *
 */
@Entity
@Table(name ="FACULTY_SKILL")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FACULTY_ID")
	private int facultyId;
	
	@Column(name="FACULTY_NAME")
	private String facultyName;
	
//	@ManyToMany
//	@JoinTable(name = "skills_list", 
//	joinColumns =  @JoinColumn(name = "FACULTY_ID"),
//	inverseJoinColumns = @JoinColumn(name = "SKILL_ID"))
//	private List<Skills> listOfSkills = new ArrayList<Skills>();
//	
	@Column(name ="skills")
	private String[] skills;
	/**
	 * Default Constructor
	 */
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the facultyId
	 */
	public int getFacultyId() {
		return facultyId;
	}

	/**
	 * @param facultyId the facultyId to set
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	/**
	 * @return the facultyName
	 */
	public String getFacultyName() {
		return facultyName;
	}

	/**
	 * @param facultyName the facultyName to set
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	

	
}
