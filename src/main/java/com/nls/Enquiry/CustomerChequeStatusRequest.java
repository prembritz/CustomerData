package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@JsonbPropertyOrder({ "procCode", "unitID", "accountNo", "chequeNo", "fromDate", "toDate", "startChequeNo",
		"endChequeNo" })
@Schema(name = "CustomerChequeStatusRequest", description = "Request object with Unit Id and Account Number & ValueDate")
public class CustomerChequeStatusRequest {

	@Schema(required = true, example = "PROD2323", description = "ProcCode")
	@JsonbProperty("ProcCode")
	public String procCode;

	@Schema(required = true, example = "KE0010001", description = "UnitID")
	@JsonbProperty("UnitID")
	public String unitID;

	@Schema(required = true, example = "6493320028", description = "AccountNo")
	@JsonbProperty("AccountNo")
	public String accountNo;

	@Schema(required = true, example = "7623", description = "ChequeNo")
	@JsonbProperty("ChequeNo")
	public String chequeNo;

	@Schema(required = true, example = "06052022", description = "FromDate")
	@JsonbProperty("FromDate")
	public String fromDate;

	@Schema(required = true, example = "22062022", description = "ToDate")
	@JsonbProperty("ToDate")
	public String toDate;

	@Schema(required = true, example = "100", description = "StartChequeNo")
	@JsonbProperty("StartChequeNo")
	public String startChequeNo;

	@Schema(required = true, example = "1000", description = "EndChequeNo")
	@JsonbProperty("EndChequeNo")
	public String endChequeNo;
}
