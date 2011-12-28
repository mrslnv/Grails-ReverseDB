package alidb

class ChangesetLinks {

	String cslSourceType
	Long cslTargetId
	String cslTargetType
	Changeset changeset

	static belongsTo = [Changeset]

	static mapping = {
		id column: "CSL_ID", generator: "assigned"
		version false
	}

	static constraints = {
		cslSourceType nullable: true, maxSize: 100
		cslTargetType maxSize: 100
	}
}
