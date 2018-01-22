CREATE DATABASE  IF NOT EXISTS `risorse` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `risorse`;
-- phpMyAdmin SQL Dump
-- version 4.7.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Creato il: Gen 18, 2018 alle 14:34
-- Versione del server: 5.6.35
-- Versione PHP: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `risorse`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `employement`
--

CREATE TABLE `employement` (
  `id_r` int(11) NOT NULL,
  `id_p` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `employement`
--

INSERT INTO `employement` (`id_r`, `id_p`) VALUES
(2, 14);

-- --------------------------------------------------------

--
-- Struttura della tabella `project`
--

CREATE TABLE `project` (
  `id` int(11) NOT NULL,
  `deadline` datetime DEFAULT NULL,
  `name_project` varchar(255) DEFAULT NULL,
  `njunior` varchar(255) DEFAULT NULL,
  `nsenior` varchar(255) DEFAULT NULL,
  `start_project` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `project`
--

INSERT INTO `project` (`id`, `deadline`, `name_project`, `njunior`, `nsenior`, `start_project`, `status`) VALUES
(13, '1970-01-23 05:13:30', 'Parser', '3', '1', '1970-07-07 01:54:42', 'Evaluation'),
(14, '1970-01-23 05:13:30', 'Scraper', '3', '1', '1970-07-07 01:54:42', 'Evaluation'),
(15, '1970-01-23 05:13:30', 'Scraper', '3', '1', '1970-07-07 01:54:42', 'Evaluation'),
(16, '2018-01-31 10:43:09', 'WebServer', '2', NULL, '2018-01-31 10:43:09', 'Development');

-- --------------------------------------------------------

--
-- Struttura della tabella `resources`
--

CREATE TABLE `resources` (
  `id` int(11) NOT NULL,
  `hire` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `surname` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `assigned` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `resources`
--

INSERT INTO `resources` (`id`, `hire`, `name`, `surname`, `type`,`assigned`) VALUES
(1, '2018-01-17 16:34:55', 'Mauro', 'Caredda', 'junior',0),
(2, '2018-01-07 16:34:55', 'Lucia', 'Boi', 'junior',0),
(3, '2016-01-07 16:34:55', 'Marco', 'Brisu', 'senior',0),
(4, '2016-01-07 16:34:55', 'Stefania', 'Deidda', 'senior',0);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `employement`
--
ALTER TABLE `employement`
  ADD PRIMARY KEY (`id_p`),
  ADD KEY `id_p_idx` (`id_p`),
  ADD KEY `id_r_idx` (`id_r`);

--
-- Indici per le tabelle `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `resources`
--
ALTER TABLE `resources`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `project`
--
ALTER TABLE `project`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT per la tabella `resources`
--
ALTER TABLE `resources`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `employement`
--
ALTER TABLE `employement`
  ADD CONSTRAINT `FKbos0126r30i196nomwvaxxbq7` FOREIGN KEY (`id_r`) REFERENCES `resources` (`id`),
  ADD CONSTRAINT `FKhws6cx0x0kd52caio2k6u0he2` FOREIGN KEY (`id_p`) REFERENCES `project` (`id`),
  ADD CONSTRAINT `id_p` FOREIGN KEY (`id_p`) REFERENCES `project` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `id_r` FOREIGN KEY (`id_r`) REFERENCES `resources` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
