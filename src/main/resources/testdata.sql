DROP TABLE IF EXISTS `DND_NPC`;

CREATE TABLE dnd_npc(
id INT AUTO_INCREMENT,
name VARCHAR(30) NOT NULL,
race VARCHAR(30) NOT NULL,
alignment VARCHAR(30) NOT NULL,
age INT NOT NULL,
in_use boolean NOT NULL,
PRIMARY KEY(id)
);


INSERT INTO `dnd_npc` (`name`, `race`, `alignment`, `age`, `in_use`) VALUES ('Testname', 'testrace', 'testalignment', 24, true);
