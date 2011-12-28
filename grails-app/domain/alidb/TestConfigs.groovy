package alidb

import java.sql.Clob

class TestConfigs {

	Long tscTestId
	String tscName
	Clob tscDesc
	String tscCreatedBy
	Date tscCreationDate
	String tscExecStatus
	String tscVts
	String tscVcCheckoutUserName
	String tscAttachment
	String tscUser01
	Clob tscDataFiltering
	Long tscDataState
	Clob tscDataObj

	static mapping = {
		id column: "TSC_ID", generator: "assigned"
		version false
	}

	static constraints = {
		tscDesc nullable: true
		tscCreatedBy nullable: true, maxSize: 60
		tscCreationDate nullable: true, maxSize: 7
		tscExecStatus nullable: true, maxSize: 70
		tscVts maxSize: 20
		tscVcCheckoutUserName nullable: true, maxSize: 60
		tscAttachment nullable: true, maxSize: 1
		tscUser01 nullable: true, maxSize: 40
		tscDataFiltering nullable: true
		tscDataObj nullable: true
	}
}
