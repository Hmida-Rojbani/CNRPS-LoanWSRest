package tn.cnrps.ws.rest.loan.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class WsResponse {
	
	private boolean eligible;
	private long approvedAmount;
	private List<String> criteriaMismatch = new ArrayList<>();

}
