package alidb

import java.sql.Clob

class Test {

	Long tsTestVersion
	String tsName
	Integer tsSteps
	String tsPath
	Long tsSubject
	String tsStatus
	String tsResponsible
	Date tsCreationDate
	Clob tsDescription
	String tsType
	Integer tsTimeout
	String tsAttachment
	String tsRuntimeData
	String tsWorkingMode
	String tsProtocolType
	String tsServiceTestMode
	String tsUser01
	String tsUser02
	String tsUser03
	String tsUser04
	String tsUser05
	String tsUser06
	String tsUser07
	String tsUser08
	String tsUser09
	String tsUser10
	String tsUser11
	String tsUser12
	Long tsUserHr01
	Long tsUserHr02
	Long tsUserHr03
	Long tsUserHr04
	Long tsUserHr05
	Long tsUserHr06
	Long tsEstimateDevtime
	Long tsTestVerStamp
	String tsExecStatus
	String tsTemplate
	Long tsStepParam
	String tsVts
	String tsVcCurVer
	String tsUser13
	String tsUser14
	String tsUser15
	String tsUser16
	String tsUser17
	String tsUser18
	String tsUser19
	String tsUser20
	String tsUser21
	String tsUser22
	String tsUser23
	String tsUser24
	String tsTextSync
	Clob tsDevComments
	String tsVcUserName
	Date tsVcDate
	String tsVcTime
	Clob tsVcComments
	String tsVcCheckinUserName
	Date tsVcCheckinDate
	String tsVcCheckinTime
	Clob tsVcCheckinComments
	String tsVcStatus
	Long tsVcStartAuditActionId
	Long tsVcEndAuditActionId
	Long tsVcVersionNumber
	Long tsBptaChangeDetected
	Long tsBaseTestId

	static mapping = {
		id column: "TS_TEST_ID", generator: "assigned"
		version false
	}

	static constraints = {
		tsTestVersion nullable: true
		tsName nullable: true
		tsSteps nullable: true
		tsPath nullable: true
		tsSubject nullable: true
		tsStatus nullable: true, maxSize: 70
		tsResponsible nullable: true, maxSize: 60
		tsCreationDate nullable: true, maxSize: 7
		tsDescription nullable: true
		tsType nullable: true, maxSize: 70
		tsTimeout nullable: true
		tsAttachment nullable: true, maxSize: 1
		tsRuntimeData nullable: true
		tsWorkingMode nullable: true, maxSize: 70
		tsProtocolType nullable: true
		tsServiceTestMode nullable: true, maxSize: 70
		tsUser01 nullable: true, maxSize: 40
		tsUser02 nullable: true, maxSize: 40
		tsUser03 nullable: true, maxSize: 40
		tsUser04 nullable: true, maxSize: 40
		tsUser05 nullable: true, maxSize: 40
		tsUser06 nullable: true, maxSize: 40
		tsUser07 nullable: true, maxSize: 40
		tsUser08 nullable: true, maxSize: 40
		tsUser09 nullable: true, maxSize: 40
		tsUser10 nullable: true, maxSize: 40
		tsUser11 nullable: true, maxSize: 40
		tsUser12 nullable: true, maxSize: 40
		tsUserHr01 nullable: true
		tsUserHr02 nullable: true
		tsUserHr03 nullable: true
		tsUserHr04 nullable: true
		tsUserHr05 nullable: true
		tsUserHr06 nullable: true
		tsEstimateDevtime nullable: true
		tsTestVerStamp nullable: true
		tsExecStatus nullable: true, maxSize: 70
		tsTemplate nullable: true, maxSize: 1
		tsStepParam nullable: true
		tsVts nullable: true, maxSize: 20
		tsVcCurVer nullable: true, maxSize: 50
		tsUser13 nullable: true, maxSize: 40
		tsUser14 nullable: true, maxSize: 40
		tsUser15 nullable: true, maxSize: 40
		tsUser16 nullable: true, maxSize: 40
		tsUser17 nullable: true, maxSize: 40
		tsUser18 nullable: true, maxSize: 40
		tsUser19 nullable: true, maxSize: 40
		tsUser20 nullable: true, maxSize: 40
		tsUser21 nullable: true, maxSize: 40
		tsUser22 nullable: true, maxSize: 40
		tsUser23 nullable: true, maxSize: 40
		tsUser24 nullable: true, maxSize: 40
		tsTextSync nullable: true, maxSize: 1
		tsDevComments nullable: true
		tsVcUserName nullable: true
		tsVcDate nullable: true, maxSize: 7
		tsVcTime nullable: true, maxSize: 10
		tsVcComments nullable: true
		tsVcCheckinUserName nullable: true
		tsVcCheckinDate nullable: true, maxSize: 7
		tsVcCheckinTime nullable: true, maxSize: 10
		tsVcCheckinComments nullable: true
		tsVcStatus nullable: true, maxSize: 20
		tsVcStartAuditActionId nullable: true
		tsVcEndAuditActionId nullable: true
		tsVcVersionNumber nullable: true
		tsBptaChangeDetected nullable: true
		tsBaseTestId nullable: true
	}
}
