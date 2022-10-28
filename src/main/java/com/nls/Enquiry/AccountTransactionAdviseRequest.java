package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@JsonbPropertyOrder({ "procCode", "unitID", "uniqueTransactionLegNo", "instrumentReferenceNumber" })
@Schema(name="Account Transaction Advise Request",description="Request object with procCode ,unitID,uniqueTransactionLegNo and instrumentReferenceNumber")
public class AccountTransactionAdviseRequest {
	@Schema(required = true, example = "PRDT002", description = "ProcCode")
	@JsonbProperty("ProcCode")
	public String procCode;

	@Schema(required = true, example = "KE0010001", description = "UnitID")
	@JsonbProperty("UnitID")
	public String unitID;

	@Schema(required = true, example = "188970434852455.100001", description = "UniqueTransactionLegNo")
	@JsonbProperty("UniqueTransactionLegNo")
	public String uniqueTransactionLegNo;

	@Schema(required = true, example = "FT0832700274", description = "InstrumentReferenceNumber")
	@JsonbProperty("InstrumentReferenceNumber")
	public String instrumentReferenceNumber;
} 
