package com.company.vo;

@lombok.Data
public class Customer {
	private Double requested_loan_amount;
	private Double income;
	private Double transunion_score;
	private Double existing_loan_amount;
	
	private String result;
}
