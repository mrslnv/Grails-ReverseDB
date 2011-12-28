package alidb

import java.sql.Clob

class Req {

	Long rqFatherId
	Long rqOrderId
	Long rqIstemplate
	Clob rqReqComment
	String rqReqReviewed
	String rqReqPath
	String rqReqStatus
	String rqReqPriority
	String rqReqType
	String rqReqProduct
	String rqReqName
	String rqReqAuthor
	String rqRbtIgnoreInAnalysis
	String rqRbtBsnsImpact
	String rqRbtCustomBsnsImpact
	String rqRbtUseCustomBsnsImpact
	String rqRbtEffectiveBsnsImpact
	String rqRbtFailProb
	String rqRbtCustomFailProb
	String rqRbtUseCustomFailProb
	String rqRbtEffectiveFailProb
	String rqRbtRisk
	String rqRbtCustomRisk
	String rqRbtUseCustomRisk
	String rqRbtEffectiveRisk
	String rqRbtFuncCmplx
	String rqRbtCustomFuncCmplx
	String rqRbtUseCustomFuncCmplx
	String rqRbtEffectiveFuncCmplx
	String rqRbtTestingLevel
	String rqRbtCustomTestingLevel
	Long rqRbtTestingHours
	Long rqRbtCustomTestingHours
	String rqRbtUseCustomTlAndTe
	Long rqRbtRndEstimEffortHours
	Clob rqRbtAssessmentData
	Long rqRbtAnalysisParentReqId
	Clob rqRbtAnalysisSetupData
	Clob rqRbtAnalysisResultData
	Date rqRbtLastAnalysisDate
	String rqUser01
	String rqUser02
	String rqUser03
	String rqUser04
	String rqUser05
	String rqUser06
	String rqUser07
	String rqUser08
	String rqUser09
	String rqUser10
	String rqUser11
	String rqUser12
	Long rqReqVerStamp
	String rqAttachment
	Date rqReqDate
	String rqReqTime
	Long rqNoOfSons
	String rqIsFolder
	String rqVts
	String rqUser13
	String rqUser14
	String rqUser15
	String rqUser16
	String rqUser17
	String rqUser18
	String rqUser19
	String rqUser20
	String rqUser21
	String rqUser22
	String rqUser23
	String rqUser24
	Long rqRequestId
	String rqTextSync
	String rqRequestServer
	String rqRequestType
	String rqRequestStatus
	String rqRequestUpdates
	String rqRequestAssignTo
	Clob rqRequestNote
	Long rqTypeId
	Long rqTargetRcyc
	Long rqTargetRel
	Clob rqDevComments
	String rqHasRichContent
	Long rqVcVersionNumber
	String rqVcStatus
	String rqVcCheckinUserName
	Date rqVcCheckinDate
	String rqVcCheckinTime
	Clob rqVcCheckinComments
	String rqVcCheckoutUserName
	Date rqVcCheckoutDate
	String rqVcCheckoutTime
	Clob rqVcCheckoutComments
	Clob rqReqRichContent

	static mapping = {
		id column: "RQ_REQ_ID", generator: "assigned"
		version false
	}

	static constraints = {
		rqFatherId nullable: true
		rqOrderId nullable: true
		rqIstemplate nullable: true
		rqReqComment nullable: true
		rqReqReviewed nullable: true
		rqReqPath unique: true
		rqReqStatus nullable: true
		rqReqPriority nullable: true
		rqReqType nullable: true
		rqReqProduct nullable: true
		rqReqName nullable: true
		rqReqAuthor nullable: true
		rqRbtIgnoreInAnalysis nullable: true, maxSize: 1
		rqRbtBsnsImpact nullable: true, maxSize: 1
		rqRbtCustomBsnsImpact nullable: true, maxSize: 1
		rqRbtUseCustomBsnsImpact nullable: true, maxSize: 1
		rqRbtEffectiveBsnsImpact nullable: true, maxSize: 1
		rqRbtFailProb nullable: true, maxSize: 1
		rqRbtCustomFailProb nullable: true, maxSize: 1
		rqRbtUseCustomFailProb nullable: true, maxSize: 1
		rqRbtEffectiveFailProb nullable: true, maxSize: 1
		rqRbtRisk nullable: true, maxSize: 1
		rqRbtCustomRisk nullable: true, maxSize: 1
		rqRbtUseCustomRisk nullable: true, maxSize: 1
		rqRbtEffectiveRisk nullable: true, maxSize: 1
		rqRbtFuncCmplx nullable: true, maxSize: 1
		rqRbtCustomFuncCmplx nullable: true, maxSize: 1
		rqRbtUseCustomFuncCmplx nullable: true, maxSize: 1
		rqRbtEffectiveFuncCmplx nullable: true, maxSize: 1
		rqRbtTestingLevel nullable: true, maxSize: 70
		rqRbtCustomTestingLevel nullable: true, maxSize: 70
		rqRbtTestingHours nullable: true
		rqRbtCustomTestingHours nullable: true
		rqRbtUseCustomTlAndTe nullable: true, maxSize: 1
		rqRbtRndEstimEffortHours nullable: true
		rqRbtAssessmentData nullable: true
		rqRbtAnalysisParentReqId nullable: true
		rqRbtAnalysisSetupData nullable: true
		rqRbtAnalysisResultData nullable: true
		rqRbtLastAnalysisDate nullable: true, maxSize: 7
		rqUser01 nullable: true, maxSize: 40
		rqUser02 nullable: true, maxSize: 40
		rqUser03 nullable: true, maxSize: 40
		rqUser04 nullable: true, maxSize: 40
		rqUser05 nullable: true, maxSize: 40
		rqUser06 nullable: true, maxSize: 40
		rqUser07 nullable: true, maxSize: 40
		rqUser08 nullable: true, maxSize: 40
		rqUser09 nullable: true, maxSize: 40
		rqUser10 nullable: true, maxSize: 40
		rqUser11 nullable: true, maxSize: 40
		rqUser12 nullable: true, maxSize: 40
		rqReqVerStamp nullable: true
		rqAttachment nullable: true, maxSize: 1
		rqReqDate nullable: true, maxSize: 7
		rqReqTime nullable: true, maxSize: 10
		rqNoOfSons nullable: true, unique: ["SYS_NC00097$", "RQ_REQ_PATH"]
		rqIsFolder nullable: true, maxSize: 1
		rqVts nullable: true, maxSize: 20
		rqUser13 nullable: true, maxSize: 40
		rqUser14 nullable: true, maxSize: 40
		rqUser15 nullable: true, maxSize: 40
		rqUser16 nullable: true, maxSize: 40
		rqUser17 nullable: true, maxSize: 40
		rqUser18 nullable: true, maxSize: 40
		rqUser19 nullable: true, maxSize: 40
		rqUser20 nullable: true, maxSize: 40
		rqUser21 nullable: true, maxSize: 40
		rqUser22 nullable: true, maxSize: 40
		rqUser23 nullable: true, maxSize: 40
		rqUser24 nullable: true, maxSize: 40
		rqRequestId nullable: true
		rqTextSync nullable: true, maxSize: 1
		rqRequestServer nullable: true, maxSize: 120
		rqRequestType nullable: true, maxSize: 120
		rqRequestStatus nullable: true, maxSize: 40
		rqRequestUpdates nullable: true, maxSize: 120
		rqRequestAssignTo nullable: true, maxSize: 120
		rqRequestNote nullable: true
		rqTargetRcyc nullable: true
		rqTargetRel nullable: true
		rqDevComments nullable: true
		rqHasRichContent nullable: true, maxSize: 1
		rqVcVersionNumber nullable: true
		rqVcStatus nullable: true, maxSize: 20
		rqVcCheckinUserName nullable: true, maxSize: 60
		rqVcCheckinDate nullable: true, maxSize: 7
		rqVcCheckinTime nullable: true, maxSize: 10
		rqVcCheckinComments nullable: true
		rqVcCheckoutUserName nullable: true, maxSize: 60
		rqVcCheckoutDate nullable: true, maxSize: 7
		rqVcCheckoutTime nullable: true, maxSize: 10
		rqVcCheckoutComments nullable: true
		rqReqRichContent nullable: true
	}
}
