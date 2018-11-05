<!--DROP LOGIC-->

DROP TABLE HT_CNFG_USERGROUP;
DROP TABLE HT_CNFG_USER;
DROP TABLE HT_CNFG_USERTYPE;
DROP TABLE HT_MST_PRIVILEGE;
DROP TABLE HT_MST_STORE;

<!--INSERT BASIC USER TYPE-->
INSERT INTO `HT_CNFG_USERTYPE`(`usertype_name`) VALUES ('ADMIN');
INSERT INTO `HT_CNFG_USERTYPE`(`usertype_name`) VALUES ('USER');
INSERT INTO `HT_CNFG_USERTYPE`(`usertype_name`) VALUES ('DISTRIBUTOR');
INSERT INTO `HT_CNFG_USERTYPE`(`usertype_name`) VALUES ('HAWKER');
INSERT INTO `HT_CNFG_USERTYPE`(`usertype_name`) VALUES ('RETAILER');

<!--INSERT BASIC USER TYPE-->