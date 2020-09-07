package tn.cnrps.ws.rest.loan.models;

import lombok.Data;

@Data
public class CustomerRequest {
	
	private String name;
	private int age;
	private long yearlyIncome;
	private int cibilScore;
	private String employmentMode;

}
