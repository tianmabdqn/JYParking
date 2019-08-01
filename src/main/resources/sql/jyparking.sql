/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.28 : Database - jyparking
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jyparking` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jyparking`;

/*Table structure for table `order` */

DROP TABLE IF EXISTS `order`;

CREATE TABLE `order` (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单主键',
  `startTime` datetime NOT NULL COMMENT '进入停车场时间',
  `endingTime` datetime NOT NULL COMMENT '出入停车场时间',
  `proId` int(11) NOT NULL COMMENT '车辆收费标准',
  `uId` int(11) NOT NULL COMMENT '用户主键',
  `orderStatus` int(11) NOT NULL COMMENT '0:订单正在进行 1:订单已付款 2:订单已完成',
  `setId` int(11) NOT NULL COMMENT '结算表主键',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `proId` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆收费标准主键',
  `vehicleType` int(11) NOT NULL COMMENT '用户车类型',
  `money` float(5,3) NOT NULL COMMENT '收费金额/时',
  PRIMARY KEY (`proId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `rId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户类型表主键',
  `roleName` varchar(20) NOT NULL COMMENT '用户类型名称',
  PRIMARY KEY (`rId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`rId`,`roleName`) values (1,'超级管理员'),(2,'用户管理员'),(3,'商家管理员'),(4,'商家'),(5,'用户'),(6,'游客');

/*Table structure for table `settlement` */

DROP TABLE IF EXISTS `settlement`;

CREATE TABLE `settlement` (
  `settId` int(11) NOT NULL AUTO_INCREMENT COMMENT '结算表主键',
  `uid` int(11) NOT NULL COMMENT '付费用户主键',
  `money` float(5,3) NOT NULL COMMENT '总价',
  PRIMARY KEY (`settId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `settlement` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `userName` varchar(20) NOT NULL COMMENT '用户名称',
  `loginName` varchar(20) NOT NULL COMMENT '用户登录名',
  `loginPassword` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户登陆密码',
  `phone` varchar(11) NOT NULL COMMENT '用户手机号',
  `sex` int(11) NOT NULL COMMENT '用户性别',
  `birth` datetime NOT NULL COMMENT '用户生日',
  `roleId` int(11) NOT NULL COMMENT '用户类型主键',
  `email` varchar(20) NOT NULL COMMENT '用户邮箱',
  `balance` float(5,2) NOT NULL COMMENT '账户余额',
  `menberOrNot` int(11) NOT NULL DEFAULT '0' COMMENT '是否会员',
  PRIMARY KEY (`uId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uId`,`userName`,`loginName`,`loginPassword`,`phone`,`sex`,`birth`,`roleId`,`email`,`balance`,`menberOrNot`) values (1,'用户管理员','root','root','12154654',1,'2019-07-25 11:17:36',0,'9546546@qq.com',0.00,0),(2,'admin','admin','admin','110',0,'2019-08-01 10:58:51',0,'54165654@qq.com',0.00,0);

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vId` int(11) NOT NULL AUTO_INCREMENT COMMENT '车表类型主键',
  `vehicleType` varchar(20) NOT NULL COMMENT '用户车类型收费标准',
  `proId` int(11) NOT NULL COMMENT '用户类型收费标准Id',
  `licensePlate` varchar(20) NOT NULL COMMENT '用户车牌',
  `uId` int(11) NOT NULL COMMENT '用户主键',
  PRIMARY KEY (`vId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `vehicle` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
