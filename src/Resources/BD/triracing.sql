-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-03-2017 a las 06:57:08
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `triracing`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `triracing_01_users`
--

CREATE TABLE `triracing_01_users` (
  `nIdUser01` bigint(20) NOT NULL,
  `sNombre` char(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sApat` char(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sAmat` char(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sUserName` varchar(250) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sPassword` varchar(25) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sTipoUsuario` char(250) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `triracing_01_users`
--

INSERT INTO `triracing_01_users` (`nIdUser01`, `sNombre`, `sApat`, `sAmat`, `sUserName`, `sPassword`, `sTipoUsuario`) VALUES
(1, 'MIGUEL', 'NAJERA', 'OREA', 'M', '1', 'ALUMNO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `triracing_01_users`
--
ALTER TABLE `triracing_01_users`
  ADD PRIMARY KEY (`nIdUser01`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `triracing_01_users`
--
ALTER TABLE `triracing_01_users`
  MODIFY `nIdUser01` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
