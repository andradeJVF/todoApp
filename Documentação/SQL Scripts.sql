-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema todoApp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema todoApp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `todoApp` DEFAULT CHARACTER SET utf8 ;
USE `todoApp` ;

-- -----------------------------------------------------
-- Table `todoApp`.`projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `todoApp`.`projects` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `createdAt` DATETIME NOT NULL,
  `updatedAt` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `todoApp`.`tasks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `todoApp`.`tasks` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `status` TINYINT NOT NULL,
  `notes` VARCHAR(255) NULL,
  `deadline` DATE NOT NULL,
  `createdAt` DATETIME NOT NULL,
  `updatedAt` DATETIME NOT NULL,
  `projects_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_tasks_projects_idx` (`projects_id` ASC) VISIBLE,
  CONSTRAINT `fk_tasks_projects`
    FOREIGN KEY (`projects_id`)
    REFERENCES `todoApp`.`projects` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
