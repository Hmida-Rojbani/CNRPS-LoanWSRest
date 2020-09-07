package tn.cnrps.ws.rest.loan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.cnrps.ws.rest.loan.models.CustomerRequest;
import tn.cnrps.ws.rest.loan.models.WsResponse;

@Service
public class LoanService {
	
	public WsResponse checkLoanEligibilty(CustomerRequest request) {
		WsResponse response = new WsResponse();
		List<String> mismatchList = response.getCriteriaMismatch();
		
		if(!(request.getAge()>=30 && request.getAge()<50)) {
			mismatchList.add("Customer age must be between 30 and 50.");
		}
		if(!(request.getYearlyIncome()>20000)) {
			mismatchList.add("Customer yearlyIncome must be over 20000.");
		}
		if(!(request.getCibilScore() > 500)) {
			mismatchList.add("Customer cibil score must be over 500.");
		}
		
		if(mismatchList.size()>0) {
			response.setEligible(false);
			response.setApprovedAmount(0);
		} else {
			response.setEligible(true);
			response.setApprovedAmount(15000);
		}
		
		return response;
	}


}
