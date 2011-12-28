package alidb

class ChangesetFile {

	String csfPath
	String csfCpPath
	String csfOp
	String csfType
	String csfRev
	String csfCpRev
	String csfVts
	Long csfBranchId
	String csfBranchName
	String csfUser01
	Scmrepository scmrepository
	Changeset changeset

	static belongsTo = [Changeset, Scmrepository]

	static mapping = {
		id column: "CSF_ID", generator: "assigned"
		version false
	}

	static constraints = {
		csfPath maxSize: 1024
		csfCpPath nullable: true, maxSize: 1024
		csfOp maxSize: 20, unique: ["CSF_REV", "CSF_PATH", "CSF_REPOSITORY"]
		csfType nullable: true, maxSize: 20
		csfCpRev nullable: true
		csfVts nullable: true, maxSize: 20
		csfBranchId nullable: true
		csfBranchName nullable: true
		csfUser01 nullable: true, maxSize: 40
	}
}
