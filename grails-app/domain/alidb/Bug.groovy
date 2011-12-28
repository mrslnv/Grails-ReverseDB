package alidb

import java.sql.Clob

class Bug {

	String bgStatus
	String bgResponsible
	String bgProject
	Long bgSubject
	String bgSummary
	Clob bgDescription
	Clob bgDevComments
	String bgReproducible
	String bgSeverity
	String bgPriority
	String bgDetectedBy
	Date bgDetectionDate
	String bgDetectionVersion
	String bgPlannedClosingVer
	Integer bgEstimatedFixTime
	Integer bgActualFixTime
	Date bgClosingDate
	String bgClosingVersion
	String bgToMail
	String bgAttachment
	String bgUser01
	String bgUser02
	String bgUser03
	String bgUser04
	String bgUser05
	String bgUser06
	String bgUser07
	String bgUser08
	String bgUser09
	String bgUser10
	String bgUser11
	String bgUser12
	String bgUser13
	String bgUser14
	String bgUser15
	String bgUser16
	String bgUser17
	String bgUser18
	String bgUser19
	String bgUser20
	String bgUser21
	String bgUser22
	String bgUser23
	String bgUser24
	Long bgUserHr01
	Long bgUserHr02
	Long bgUserHr03
	Long bgUserHr04
	Long bgUserHr05
	Long bgUserHr06
	Long bgBugVerStamp
	String bgHasChange
	String bgVts
	String bgExtendedReference
	Long bgRequestId
	String bgTextSync
	String bgRequestServer
	String bgRequestType
	Clob bgRequestNote
	Long bgCycleId
	Long bgTestReference
	String bgCycleReference
	Long bgRunReference
	Long bgStepReference
	Long bgDetectedInRel
	Long bgDetectedInRcyc
	Long bgTargetRel
	Long bgTargetRcyc

	static mapping = {
		id column: "BG_BUG_ID", generator: "assigned"
		version false
	}

	static constraints = {
		bgStatus nullable: true, maxSize: 70
		bgResponsible nullable: true, maxSize: 60
		bgProject nullable: true, maxSize: 70
		bgSubject nullable: true
		bgSummary nullable: true
		bgDescription nullable: true
		bgDevComments nullable: true
		bgReproducible nullable: true, maxSize: 1
		bgSeverity nullable: true, maxSize: 70
		bgPriority nullable: true, maxSize: 70
		bgDetectedBy nullable: true, maxSize: 60
		bgDetectionDate nullable: true, maxSize: 7
		bgDetectionVersion nullable: true, maxSize: 70
		bgPlannedClosingVer nullable: true, maxSize: 70
		bgEstimatedFixTime nullable: true
		bgActualFixTime nullable: true
		bgClosingDate nullable: true, maxSize: 7
		bgClosingVersion nullable: true, maxSize: 70
		bgToMail nullable: true, maxSize: 1
		bgAttachment nullable: true, maxSize: 1
		bgUser01 nullable: true, maxSize: 40
		bgUser02 nullable: true, maxSize: 40
		bgUser03 nullable: true, maxSize: 40
		bgUser04 nullable: true, maxSize: 40
		bgUser05 nullable: true, maxSize: 40
		bgUser06 nullable: true, maxSize: 40
		bgUser07 nullable: true, maxSize: 40
		bgUser08 nullable: true, maxSize: 40
		bgUser09 nullable: true, maxSize: 40
		bgUser10 nullable: true, maxSize: 40
		bgUser11 nullable: true, maxSize: 40
		bgUser12 nullable: true, maxSize: 40
		bgUser13 nullable: true, maxSize: 40
		bgUser14 nullable: true, maxSize: 40
		bgUser15 nullable: true, maxSize: 40
		bgUser16 nullable: true, maxSize: 40
		bgUser17 nullable: true, maxSize: 40
		bgUser18 nullable: true, maxSize: 40
		bgUser19 nullable: true, maxSize: 40
		bgUser20 nullable: true, maxSize: 40
		bgUser21 nullable: true, maxSize: 40
		bgUser22 nullable: true, maxSize: 40
		bgUser23 nullable: true, maxSize: 40
		bgUser24 nullable: true, maxSize: 40
		bgUserHr01 nullable: true
		bgUserHr02 nullable: true
		bgUserHr03 nullable: true
		bgUserHr04 nullable: true
		bgUserHr05 nullable: true
		bgUserHr06 nullable: true
		bgBugVerStamp nullable: true
		bgHasChange nullable: true, maxSize: 50
		bgVts nullable: true, maxSize: 20
		bgExtendedReference nullable: true, maxSize: 50
		bgRequestId nullable: true
		bgTextSync nullable: true, maxSize: 1
		bgRequestServer nullable: true, maxSize: 120
		bgRequestType nullable: true, maxSize: 120
		bgRequestNote nullable: true
		bgCycleId nullable: true
		bgTestReference nullable: true
		bgCycleReference nullable: true
		bgRunReference nullable: true
		bgStepReference nullable: true
		bgDetectedInRel nullable: true
		bgDetectedInRcyc nullable: true
		bgTargetRel nullable: true
		bgTargetRcyc nullable: true
	}
}
