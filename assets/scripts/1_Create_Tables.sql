BEGIN TRANSACTION;

-- Table 'remote_controls': Contiene la lista de controles remotos admitidos
CREATE TABLE "remote_controls" (
	"_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"control_name"	TEXT NOT NULL UNIQUE,
	"ontrol_order" INTEGER NOT NULL UNIQUE
);

-- Table 'ir_codes': Contiene la lista de códigos infrarrojos
CREATE TABLE "ir_codes" (
	"_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"ir_code"	TEXT NOT NULL,
	"id_brand"	INTEGER NOT NULL,
	"id_control"	INTEGER NOT NULL
);

-- Table 'brands': Contiene la lista de marcas admitidos
CREATE TABLE "brands" (
	"_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
	"brand_name"	TEXT NOT NULL UNIQUE
);

COMMIT;