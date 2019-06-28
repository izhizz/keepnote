/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.22-log : Database - keep_note
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`keep_note` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `keep_note`;

/*Table structure for table `info_password` */

DROP TABLE IF EXISTS `info_password`;

CREATE TABLE `info_password` (
  `id` int(10) NOT NULL,
  `key_info` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `info_password` */

insert  into `info_password`(`id`,`key_info`) values (1,'a');

/*Table structure for table `ref_user_information` */

DROP TABLE IF EXISTS `ref_user_information`;

CREATE TABLE `ref_user_information` (
  `send_user_id` int(10) DEFAULT NULL COMMENT '发起用户id',
  `recive_user_id` int(10) DEFAULT NULL COMMENT '收到用户id',
  `price` double DEFAULT NULL COMMENT '金额',
  `flag` int(2) DEFAULT NULL COMMENT '1收取2收取确认3缴清4缴清确认',
  `send_time` bigint(20) DEFAULT NULL COMMENT '发起时间',
  `reply_time` bigint(20) DEFAULT NULL COMMENT '回复时间',
  `send_remark` varchar(200) DEFAULT NULL COMMENT '发送备注',
  `reply_mark` varchar(200) DEFAULT NULL COMMENT '回复备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ref_user_information` */

/*Table structure for table `ref_user_other_info` */

DROP TABLE IF EXISTS `ref_user_other_info`;

CREATE TABLE `ref_user_other_info` (
  `s_user_id` int(11) NOT NULL COMMENT '用户id',
  `r_user_id` int(11) NOT NULL COMMENT '查看用户id',
  `flag` int(2) DEFAULT NULL COMMENT '0申请查看1已同意2不同意',
  PRIMARY KEY (`s_user_id`,`r_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ref_user_other_info` */

/*Table structure for table `ref_user_see_history` */

DROP TABLE IF EXISTS `ref_user_see_history`;

CREATE TABLE `ref_user_see_history` (
  `master_user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `see_user_id` int(10) DEFAULT NULL COMMENT '查看id',
  `dateTime` bigint(20) DEFAULT NULL COMMENT '时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ref_user_see_history` */

/*Table structure for table `ref_user_type_info` */

DROP TABLE IF EXISTS `ref_user_type_info`;

CREATE TABLE `ref_user_type_info` (
  `id` varchar(200) NOT NULL COMMENT '主键id',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `type_id` int(10) DEFAULT NULL COMMENT '类别id',
  `money_flag` int(2) DEFAULT NULL COMMENT '支出/收入[0,1]',
  `type_flag` int(2) DEFAULT NULL COMMENT '个人/公共[0,1]',
  `price` double DEFAULT NULL COMMENT '价格',
  `data_time` bigint(20) DEFAULT NULL COMMENT '操作时间',
  `day_time` bigint(20) DEFAULT NULL COMMENT '当天0晨时间戳',
  `date_time` bigint(20) DEFAULT NULL COMMENT '记账选择时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ref_user_type_info` */

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(30) DEFAULT NULL COMMENT '登录名',
  `pass_word` varchar(100) DEFAULT NULL COMMENT '密码',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `group_word` varchar(50) DEFAULT NULL COMMENT '组密码/验证码',
  `flag` int(2) DEFAULT '0' COMMENT '身份[0使用用户，1管理用户，2拉黑用户]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`user_name`,`pass_word`,`name`,`nick_name`,`group_word`,`flag`) values (1,'1','c4ca4238a0b923820dcc509a6f75849b','1','1','a',0);

/*Table structure for table `use_type` */

DROP TABLE IF EXISTS `use_type`;

CREATE TABLE `use_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `pid` int(10) DEFAULT '0' COMMENT '父id',
  `type_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `use_type` */

insert  into `use_type`(`id`,`pid`,`type_name`) values (1,0,'快乐');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
