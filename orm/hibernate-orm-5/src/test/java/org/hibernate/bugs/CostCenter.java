package org.hibernate.bugs;

import java.util.Set;

public class CostCenter
{
	private Set<CostCenter>	costCenters;
	private CostCenter		successor;
	private User			supervisingUser;
	private String			code;

	public Set<CostCenter> getCostCenters()
	{
		return costCenters;
	}

	public void setCostCenters(Set<CostCenter> costCenters)
	{
		this.costCenters = costCenters;
	}

	public CostCenter getSuccessor()
	{
		return successor;
	}

	public void setSuccessor(CostCenter successor)
	{
		this.successor = successor;
	}

	public User getSupervisingUser()
	{
		return supervisingUser;
	}

	public void setSupervisingUser(User supervisingUser)
	{
		this.supervisingUser = supervisingUser;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}
}
