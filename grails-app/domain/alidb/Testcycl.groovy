package alidb

import java.sql.Clob

class Testcycl {

	Long tcCycleId
	Long tcTestId
	Long tcTestConfigId
	String tcCycle
	Long tcTestOrder
	String tcStatus
	String tcTesterName
	Date tcExecDate
	String tcExecTime
	Date tcPlanSchedulingDate
	String tcPlanSchedulingTime
	String tcHostName
	Clob tcEparams
	String tcAttachment
	String tcUser01
	String tcUser02
	String tcUser03
	String tcUser04
	String tcUser05
	String tcUser06
	String tcUser07
	String tcUser08
	String tcUser09
	String tcUser10
	String tcUser11
	String tcUser12
	Long tcTestVersion
	Long tcTestcycleVerStamp
	Clob tcExecEventHandle
	String tcVts
	Long tcTestInstance
	String tcUser13
	String tcUser14
	String tcUser15
	String tcUser16
	String tcUser17
	String tcUser18
	String tcUser19
	String tcUser20
	String tcUser21
	String tcUser22
	String tcUser23
	String tcUser24
	String tcOsConfig
	String tcActualTester
	Clob tcDataObj
	String tcIterations
	Long tcAssignRcyc
	Long tcPinnedBaseline
	String tcSubtypeId

	static mapping = {
		id column: "TC_TESTCYCL_ID", generator: "assigned"
		version false
	}

	static constraints = {
		tcCycle nullable: true
		tcTestOrder nullable: true
		tcStatus nullable: true, maxSize: 70
		tcTesterName nullable: true, maxSize: 60
		tcExecDate nullable: true, maxSize: 7
		tcExecTime nullable: true, maxSize: 10
		tcPlanSchedulingDate nullable: true, maxSize: 7
		tcPlanSchedulingTime nullable: true, maxSize: 10
		tcHostName nullable: true, maxSize: 50
		tcEparams nullable: true
		tcAttachment nullable: true, maxSize: 1
		tcUser01 nullable: true, maxSize: 40
		tcUser02 nullable: true, maxSize: 40
		tcUser03 nullable: true, maxSize: 40
		tcUser04 nullable: true, maxSize: 40
		tcUser05 nullable: true, maxSize: 40
		tcUser06 nullable: true, maxSize: 40
		tcUser07 nullable: true, maxSize: 40
		tcUser08 nullable: true, maxSize: 40
		tcUser09 nullable: true, maxSize: 40
		tcUser10 nullable: true, maxSize: 40
		tcUser11 nullable: true, maxSize: 40
		tcUser12 nullable: true, maxSize: 40
		tcTestVersion nullable: true
		tcTestcycleVerStamp nullable: true
		tcExecEventHandle nullable: true
		tcVts nullable: true, maxSize: 20
		tcTestInstance unique: ["TC_TEST_CONFIG_ID", "TC_TEST_ID", "TC_CYCLE_ID"]
		tcUser13 nullable: true, maxSize: 40
		tcUser14 nullable: true, maxSize: 40
		tcUser15 nullable: true, maxSize: 40
		tcUser16 nullable: true, maxSize: 40
		tcUser17 nullable: true, maxSize: 40
		tcUser18 nullable: true, maxSize: 40
		tcUser19 nullable: true, maxSize: 40
		tcUser20 nullable: true, maxSize: 40
		tcUser21 nullable: true, maxSize: 40
		tcUser22 nullable: true, maxSize: 40
		tcUser23 nullable: true, maxSize: 40
		tcUser24 nullable: true, maxSize: 40
		tcOsConfig nullable: true, maxSize: 40
		tcActualTester nullable: true, maxSize: 60
		tcDataObj nullable: true
		tcIterations nullable: true
		tcAssignRcyc nullable: true
		tcPinnedBaseline nullable: true
		tcSubtypeId nullable: true, maxSize: 100
	}
}
