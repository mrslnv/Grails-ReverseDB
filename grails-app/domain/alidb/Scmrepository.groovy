package alidb

import java.sql.Clob

class Scmrepository {

	String srpLocation
	String srpName
	String srpType
	String srpUsername
	String srpPassword
	String srpLastrun
	String srpNextrun
	Long srpRunint
	Clob srpProperties
	String srpEnablepoll
	Clob srpPattern
	String srpSensitive
	String srpEnablestore
	Long srpVersion
	String srpVts
	String srpUser01

	static hasMany = [changesetFiles: ChangesetFile]

	static mapping = {
		id column: "SRP_ID", generator: "assigned"
		version false
	}

	static constraints = {
		srpLocation nullable: true
		srpName maxSize: 100
		srpUsername nullable: true, maxSize: 60
		srpPassword nullable: true, maxSize: 100
		srpLastrun nullable: true, maxSize: 20
		srpNextrun nullable: true, maxSize: 20
		srpRunint nullable: true
		srpProperties nullable: true
		srpEnablepoll nullable: true, maxSize: 1
		srpPattern nullable: true
		srpSensitive nullable: true, maxSize: 1
		srpEnablestore nullable: true, maxSize: 1
		srpVersion nullable: true
		srpVts nullable: true, maxSize: 20
		srpUser01 nullable: true, maxSize: 40
	}
}
