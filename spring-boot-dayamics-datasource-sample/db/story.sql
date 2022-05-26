/*
 Navicat Premium Data Transfer

 Source Server         : MySQL-Local
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : story

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 27/05/2022 07:55:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `money` int NOT NULL DEFAULT '0' COMMENT '钱',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0',
  `create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of money
-- ----------------------------
BEGIN;
INSERT INTO `money` VALUES (1, '对对对', 200, 0, '2022-05-25 21:54:25', '2022-05-25 21:54:25');
INSERT INTO `money` VALUES (2, '辅导费', 200, 0, '2022-05-25 21:54:33', '2022-05-25 21:54:33');
INSERT INTO `money` VALUES (3, '收到VS的v', 400, 0, '2022-05-25 21:54:43', '2022-05-25 21:54:43');
INSERT INTO `money` VALUES (4, '我带你们打', 9293, 0, '2022-05-25 21:54:56', '2022-05-25 21:54:56');
INSERT INTO `money` VALUES (5, 'fuck', 90, 0, '2022-05-25 21:55:03', '2022-05-25 21:55:03');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
