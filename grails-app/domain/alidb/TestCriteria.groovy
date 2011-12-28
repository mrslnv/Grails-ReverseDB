package alidb

import java.sql.Clob

class TestCriteria {

	Long tcrTestId
	String tcrName
	Clob tcrDescription
	String tcrExecutionStatus
	String tcrCreatedBy
	Date tcrCreationDate
	String tcrVcCheckoutUserName
	Long tcrIsMainCriterion

	static mapping = {
		id column: "TCR_ID", generator: "assigned"
		version false
	}

	static constraints = {
		tcrDescription nullable: true
		tcrExecutionStatus maxSize: 70
		tcrCreatedBy nullable: true, maxSize: 60
		tcrCreationDate nullable: true, maxSize: 7
		tcrVcCheckoutUserName nullable: true, maxSize: 60
		tcrIsMainCriterion unique: ["SYS_NC00010$", "TCR_TEST_ID"]
	}
}
