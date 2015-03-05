package com.recommender.core;

import java.util.List;

/**
 * 
 * Represents a new joinee
 * 
 * @author AshwinV
 * 
 */
public class Joinee
{
	private String name;
	private String place;
	private String college;
	private List<String> previousOrganizations;
	private List<String> skills;
	private int experience;
	private String team;

	public Joinee(String name, String place, String college, List<String> previousOrganizations, List<String> skills,
			int experience, String team)
	{
		super();
		this.name = name;
		this.place = place;
		this.college = college;
		this.previousOrganizations = previousOrganizations;
		this.skills = skills;
		this.experience = experience;
		this.team = team;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPlace()
	{
		return place;
	}

	public void setPlace(String place)
	{
		this.place = place;
	}

	public String getCollege()
	{
		return college;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public List<String> getPreviousOrganizations()
	{
		return previousOrganizations;
	}

	public void setPreviousOrganizations(List<String> previousOrganizations)
	{
		this.previousOrganizations = previousOrganizations;
	}

	public List<String> getSkills()
	{
		return skills;
	}

	public void setSkills(List<String> skills)
	{
		this.skills = skills;
	}

	public int getExperience()
	{
		return experience;
	}

	public void setExperience(int experience)
	{
		this.experience = experience;
	}

	public String getTeam()
	{
		return team;
	}

	public void setTeam(String team)
	{
		this.team = team;
	}

}