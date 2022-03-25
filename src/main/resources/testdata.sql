DROP TABLE IF EXISTS `DND_NPC`;

CREATE DATABASE IF NOT EXISTS DND_NPC;
USE DND_NPC;

CREATE TABLE dnd_npc(
id INT AUTO_INCREMENT NOT NULL,
name VARCHAR(30) NOT NULL,
race VARCHAR(30) NOT NULL,
alignment VARCHAR(30) NOT NULL,
age INT NOT NULL,
in_use boolean NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO `dnd_npc` (`name`, `race`, `alignment`, `age`, `in_use`) VALUES ('Testname', 'testrace', 'testalignment', 24, true);

DROP TABLE IF EXISTS `stat_numbers`;
CREATE TABLE stat_numbers(
id INT AUTO_INCREMENT NOT NULL,
strength INT NOT NULL,
intellect INT NOT NULL,
dexterity INT NOT NULL,
Foreign Key (id) References dnd_npc(id)
);

INSERT INTO `stat_numbers` (`strength`, `intellect`, `dexterity`) VALUES (9, 7, 12);