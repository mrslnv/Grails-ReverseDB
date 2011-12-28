package alidb

import java.sql.Clob

class Releases {

	Long relParentId
	String relName
	Long relVerStamp
	Date relStartDate
	Date relEndDate
	Clob relDescription
	String relHasAttachments
	String relUser01

	static mapping = {
		id column: "REL_ID", generator: "assigned"
		version false
	}

	static constraints = {
		relName unique: ["REL_PARENT_ID"]
		relVerStamp nullable: true
		relStartDate nullable: true, maxSize: 7
		relEndDate nullable: true, maxSize: 7
		relDescription nullable: true
		relHasAttachments nullable: true, maxSize: 1
		relUser01 nullable: true, maxSize: 40
	}
}
