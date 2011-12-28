package alidb

class ChangesetModification {

	BigDecimal csmId
	Changeset changesetByCsmCsOrigId
	Changeset changesetByCsmCsModId

	static belongsTo = [Changeset]

	static mapping = {
		id name: "csmId", generator: "assigned"
		version false
	}
}
