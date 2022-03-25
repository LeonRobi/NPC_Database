drop table if exists `dndnpc` CASCADE; 
CREATE TABLE `dndnpc` (
    id INTEGER AUTO_INCREMENT,
    alignment VARCHAR(20) NOT NULL,
    age INTEGER NOT NULL,
    in_use BOOLEAN NOT NULL,
    name VARCHAR(30) NOT NULL,
    race VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO `dndnpc` (`name`, `race`, `alignment`, `age`, `in_use`) VALUES ('Testname', 'testrace', 'testalignment', 24, true);