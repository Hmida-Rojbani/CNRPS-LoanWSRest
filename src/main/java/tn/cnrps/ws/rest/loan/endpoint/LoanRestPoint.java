package tn.cnrps.ws.rest.loan.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.cnrps.ws.rest.loan.models.CustomerRequest;
import tn.cnrps.ws.rest.loan.models.WsResponse;
import tn.cnrps.ws.rest.loan.services.LoanService;

@RestController
@RequestMapping("/api")
public class LoanRestPoint {
	
	@Autowired
	private LoanService service;
	
	@GetMapping(path = {"/hello","/index"})
	public String sayHello() {
		return "Hello World!!!";
	}
	
	@PostMapping(path = {"/hello","/index"})
	public String sayHelloByPost() {
		return "Hello World from POST!!!";
	}
	
	@PostMapping("/loan")
	public WsResponse checkLoan(@RequestBody CustomerRequest request) {
		return service.checkLoanEligibilty(request);
	}

}
