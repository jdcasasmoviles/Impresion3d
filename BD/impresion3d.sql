-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-07-2016 a las 19:31:29
-- Versión del servidor: 10.1.8-MariaDB
-- Versión de PHP: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `impresion3d`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `catalogo`
--

CREATE TABLE `catalogo` (
  `id_prod` int(11) UNSIGNED NOT NULL,
  `nom_prod` varchar(200) NOT NULL,
  `ancho` int(6) UNSIGNED NOT NULL,
  `largo` int(6) UNSIGNED NOT NULL,
  `altura` int(6) UNSIGNED NOT NULL,
  `Descripcion` varchar(300) NOT NULL,
  `precio_diseno` float UNSIGNED NOT NULL,
  `id_user` int(11) UNSIGNED NOT NULL,
  `nombreArchivo` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=ucs2;

--
-- Volcado de datos para la tabla `catalogo`
--

INSERT INTO `catalogo` (`id_prod`, `nom_prod`, `ancho`, `largo`, `altura`, `Descripcion`, `precio_diseno`, `id_user`, `nombreArchivo`) VALUES
(1, 'Presidente Obama', 30, 30, 30, 'Persona que es presidente de EEUU Obama', 67, 4, '1417616892_832582_1417617634_noticia_fotograma.jpg'),
(2, 'Craneo blanco', 34, 45, 48, 'Craneo usado para medicina', 56, 4, '412_774240_6147725_714709.jpg'),
(3, 'Lamparas', 40, 34, 45, 'Lampara brillante', 35, 4, '29.jpg'),
(4, 'Casona elegante', 50, 60, 50, 'Casa noble antigua', 25, 4, '3D-totalprototipo.com_.jpg'),
(5, 'Puente arco', 100, 40, 30, 'Estructura de arquitectura arco', 120, 4, '03.jpg'),
(6, 'Zapatillas futurista', 27, 28, 36, 'zapatillas blancas y rijas modernas', 45, 4, 'Adidas-Futurecraft-3D-unas-zapatillas-deportivas-hechas-con-una-impresora-3D-840x473.jpg'),
(7, 'Maquina industrial', 60, 60, 60, 'Maquina industrial', 45, 4, 'entresdg.jpg'),
(8, 'Mano robotica', 70, 50, 40, 'Mano robotica usada en  la industria y educacion', 67, 5, 'flexy2-1.jpg'),
(9, 'Pie anatomico', 35, 45, 46, 'pie en anatomia de esqueleto', 36, 5, 'human_feet_fmled.a.jpg'),
(10, 'Personas elegantes', 50, 50, 50, 'Personas con terno', 56, 5, 'j.jpg'),
(11, 'Estructura arquitectonica urbana', 67, 58, 45, 'Estructura arquitectonica urbana', 78, 5, 'Maqueta-impresa-e1423304474254.jpg'),
(29, 'dfghj', 30, 30, 30, 'sdfghjk', 1, 2, '2758.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id_factura` int(11) UNSIGNED NOT NULL,
  `nombreApellido` varchar(200) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `fecha_entrega` varchar(10) NOT NULL,
  `hora_entrega` varchar(6) NOT NULL,
  `fecha_emision` varchar(10) NOT NULL,
  `hora_emision` varchar(10) NOT NULL,
  `password` varchar(7) NOT NULL,
  `total` float UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`id_factura`, `nombreApellido`, `direccion`, `fecha_entrega`, `hora_entrega`, `fecha_emision`, `hora_emision`, `password`, `total`) VALUES
(1, 'Tomas Jesus Casas Rodriguez', 'mi casa', '2017-01-01', '15:00', '12/07/2016', '11:59:56', '29889', 1334.91);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `impresoras`
--

CREATE TABLE `impresoras` (
  `codImpresora` int(11) NOT NULL,
  `tipoImpresora` varchar(100) NOT NULL,
  `precioImpresora` float UNSIGNED NOT NULL COMMENT '1=libre, 0=ocupado'
) ENGINE=MyISAM DEFAULT CHARSET=ucs2;

--
-- Volcado de datos para la tabla `impresoras`
--

INSERT INTO `impresoras` (`codImpresora`, `tipoImpresora`, `precioImpresora`) VALUES
(1, 'Economica', 1.2),
(2, 'Normal', 1.8),
(3, 'Silver(Profesional)', 3),
(4, 'Gold(Premium)', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE `materiales` (
  `codMaterial` int(10) UNSIGNED NOT NULL,
  `nomMaterial` varchar(50) NOT NULL,
  `densidadMaterial` float UNSIGNED NOT NULL,
  `precioMaterial` float UNSIGNED NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=ucs2;

--
-- Volcado de datos para la tabla `materiales`
--

INSERT INTO `materiales` (`codMaterial`, `nomMaterial`, `densidadMaterial`, `precioMaterial`) VALUES
(1, 'ABS-Natural(chino)', 1.74, 17),
(2, 'ABS Natural (español)', 1.82, 26),
(3, 'PLA Eco Thermo', 1.76, 13),
(4, 'PET', 1.78, 33);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) UNSIGNED NOT NULL,
  `id_factura` int(11) UNSIGNED NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `nombre_diseno` varchar(200) NOT NULL,
  `material` varchar(50) NOT NULL,
  `tipoImpresora` varchar(100) NOT NULL,
  `escala` varchar(11) NOT NULL,
  `NroEjemplares` int(3) UNSIGNED NOT NULL,
  `precioUnitario` varchar(11) NOT NULL,
  `subTotal` float UNSIGNED NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=ucs2;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_factura`, `usuario`, `nombre_diseno`, `material`, `tipoImpresora`, `escala`, `NroEjemplares`, `precioUnitario`, `subTotal`) VALUES
(11, 1, 'mattguns', 'Pie anatomico', 'ABS-Natural(chino)', 'Economica', '0.1', 3, '63.00', 189),
(12, 1, 'mattguns', 'Personas elegantes', 'ABS-Natural(chino)', 'Economica', '0.1', 10, '84.00', 840),
(10, 1, 'mattguns', 'Craneo blanco', 'ABS-Natural(chino)', 'Normal', '1.6', 3, '101.97', 305.91);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidotemporal`
--

CREATE TABLE `pedidotemporal` (
  `id_pedido` int(11) NOT NULL,
  `nom_user` varchar(100) NOT NULL,
  `nom_prod` varchar(200) NOT NULL,
  `nomMaterial` varchar(50) NOT NULL,
  `tipoImpresora` varchar(100) NOT NULL,
  `escala` varchar(11) NOT NULL,
  `NroEjemplares` int(3) UNSIGNED NOT NULL,
  `precioUnitario` varchar(11) NOT NULL,
  `subTotal` float UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_user` int(11) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `dni` int(8) UNSIGNED NOT NULL,
  `fecha_nac` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telefono` int(9) UNSIGNED NOT NULL,
  `cuenta` varchar(20) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `tipoPrivilegio` varchar(1) NOT NULL,
  `password` tinyblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_user`, `nombres`, `apellidos`, `dni`, `fecha_nac`, `email`, `telefono`, `cuenta`, `usuario`, `tipoPrivilegio`, `password`) VALUES
(1, 'maria', 'vargas', 76345190, '2006-07-21', 'lubrikeitor_men@hotmail.com', 999345248, '34372647236', 'changx', 'U', 0x0cc61ad86672a01aa1bb69463359c235),
(2, 'Tomas Jesus', 'Casas Rodriguez', 70433373, '1991-02-28', 'mattguns@hotmail.es', 995949259, '56475756767567', 'mattguns', 'U', 0x9e0f780d5f0dced50c9b5332b28895a0),
(3, 'victor ', 'ayala', 67654543, '2005-04-22', 'sergio_virgo_2009@hotmail.com', 908765487, '472657376893576', 'user', 'U', 0x42b18eeed12dbc0dc6eb01ef12aa5631),
(4, 'oscar', 'cuzcano huarcaya', 45678345, '1991-04-29', 'cuzcanoFenix123@hotmail.com', 987867546, '945365366', 'cuzcanoClavicula', 'A', 0x033e98316cefbdc654fe705a2eb664be),
(5, 'edith', 'ruiz', 34567892, '2016-07-20', 'edithjuro@hotmail.es', 991318777, '3472657r7878', 'brujitaJuro', 'U', 0xdacef2fb41dc7c25c1bac39d121b7b17);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  ADD PRIMARY KEY (`id_prod`),
  ADD KEY `id_prod` (`id_prod`,`nom_prod`),
  ADD KEY `id_prod_2` (`id_prod`,`nom_prod`,`nombreArchivo`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id_factura`);

--
-- Indices de la tabla `impresoras`
--
ALTER TABLE `impresoras`
  ADD PRIMARY KEY (`codImpresora`),
  ADD KEY `codImpresora` (`codImpresora`,`tipoImpresora`),
  ADD KEY `codImpresora_2` (`codImpresora`,`tipoImpresora`);

--
-- Indices de la tabla `materiales`
--
ALTER TABLE `materiales`
  ADD PRIMARY KEY (`codMaterial`),
  ADD KEY `codMaterial` (`codMaterial`,`nomMaterial`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indices de la tabla `pedidotemporal`
--
ALTER TABLE `pedidotemporal`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_user` (`id_user`,`usuario`),
  ADD KEY `id_user_2` (`id_user`,`dni`,`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `catalogo`
--
ALTER TABLE `catalogo`
  MODIFY `id_prod` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `id_factura` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `impresoras`
--
ALTER TABLE `impresoras`
  MODIFY `codImpresora` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `materiales`
--
ALTER TABLE `materiales`
  MODIFY `codMaterial` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `pedidotemporal`
--
ALTER TABLE `pedidotemporal`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
