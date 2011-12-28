package alidb

import java.sql.Clob

class Cycle {

	String cyCycle
	Date cyOpenDate
	Date cyCloseDate
	String cyStatus
	Clob cyDescription
	Long cyCycleVerStamp
	Clob cyComment
	String cyAttachment
	Clob cyExecEventHandle
	Clob cyMailSettings
	Clob cyReportSettings
	String cyUser01
	String cyUser02
	String cyUser03
	String cyUser04
	String cyUser05
	String cyUser06
	String cyVts
	String cyOsConfig
	Long cyFolderId
	Clob cyCycleConfig
	Long cyRequestId
	String cyTextSync
	Long cyAssignRcyc
	Long cyPinnedBaseline
	String cySubtypeId

	static mapping = {
		id column: "CY_CYCLE_ID", generator: "assigned"
		version false
	}

	static constraints = {
		cyCycle nullable: true
		cyOpenDate nullable: true, maxSize: 7
		cyCloseDate nullable: true, maxSize: 7
		cyStatus nullable: true, maxSize: 70
		cyDescription nullable: true
		cyCycleVerStamp nullable: true
		cyComment nullable: true
		cyAttachment nullable: true, maxSize: 1
		cyExecEventHandle nullable: true
		cyMailSettings nullable: true
		cyReportSettings nullable: true
		cyUser01 nullable: true, maxSize: 40
		cyUser02 nullable: true, maxSize: 40
		cyUser03 nullable: true, maxSize: 40
		cyUser04 nullable: true, maxSize: 40
		cyUser05 nullable: true, maxSize: 40
		cyUser06 nullable: true, maxSize: 40
		cyVts nullable: true, maxSize: 20
		cyOsConfig nullable: true, maxSize: 40
		cyFolderId nullable: true
		cyCycleConfig nullable: true
		cyRequestId nullable: true
		cyTextSync nullable: true, maxSize: 1
		cyAssignRcyc nullable: true
		cyPinnedBaseline nullable: true
		cySubtypeId nullable: true, maxSize: 100
	}
}
