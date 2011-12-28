package alidb

class Scmbranch {

	String sbrPath
	String sbrName
	String sbrVts
	Long sbrRepository
	String sbrLastBkm
	Long sbrVersion
	String sbrUser01

	static mapping = {
		id column: "SBR_ID", generator: "assigned"
		version false
	}

	static constraints = {
		sbrPath nullable: true, maxSize: 100
		sbrName nullable: true, maxSize: 100
		sbrVts nullable: true, maxSize: 20
		sbrRepository nullable: true
		sbrLastBkm nullable: true
		sbrVersion nullable: true
		sbrUser01 nullable: true, maxSize: 40
	}
}
