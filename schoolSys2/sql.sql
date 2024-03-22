CREATE SCHEMA `schooldatal` ;
CREATE TABLE `signup` (
  `idsignup` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45),
  `email` VARCHAR(45),
  `pass` VARCHAR(45) ,
  PRIMARY KEY (`idsignup`));

CREATE TABLE `students` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) ,
  `gendre` VARCHAR(45) ,
  `age` INT NOT NULL,
  `mbnb` INT NULL,
  `grade` INT NULL,
  PRIMARY KEY (`id`));
  
  
CREATE TABLE `employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) ,
  `age` INT ,
  `gender` VARCHAR(10) ,
  `salary` INT ,
  `type` VARCHAR(45) ,
  PRIMARY KEY (`id`));