package alidb

import java.sql.Clob

class Changeset {

	String chsDate
	Clob chsMessage
	String chsCommitter
	Long chsLinecount
	Long chsFilecount
	String chsStatusmsg
	String chsVts
	String chsUser01
	String chsRev

	static hasMany = [changesetFiles: ChangesetFile,
	                  changesetLinkses: ChangesetLinks,
//	                  changesetModificationsForCsmCsModId: ChangesetModification,
//	                  changesetModificationsForCsmCsOrigId: ChangesetModification
	                  modifiedBy: ChangesetModification,
	                  modifies: ChangesetModification
                    ]

	static mappedBy = [modifiedBy: "changesetByCsmCsModId",
	                   modifies: "changesetByCsmCsOrigId"]

	static mapping = {
		id column: "CHS_ID", generator: "assigned"
		version false
	}

	static constraints = {
		chsDate nullable: true, maxSize: 20
		chsMessage nullable: true
		chsCommitter nullable: true, maxSize: 60
		chsLinecount nullable: true
		chsFilecount nullable: true
		chsStatusmsg nullable: true
		chsVts nullable: true, maxSize: 20
		chsUser01 nullable: true, maxSize: 40
		chsRev nullable: true
	}
}
