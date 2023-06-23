-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        11.0.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE IF NOT EXISTS `tb_liveshop` (
                               `Idx` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
                               `Title` VARCHAR(200) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `Description` VARCHAR(500) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `PageUrl` VARCHAR(500) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `ImageUrl` VARCHAR(500) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `UseYN` BIT(1) NOT NULL,
                               `CreateId` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `CreateDate` DATETIME NOT NULL DEFAULT current_timestamp(),
                               `UpdateId` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_unicode_ci',
                               `UpdateDate` DATETIME NOT NULL DEFAULT current_timestamp(),
                               PRIMARY KEY (`Idx`) USING BTREE,
                               INDEX `Idx` (`Idx`) USING BTREE
)
COMMENT='라이브 쇼핑 URL\r\n'
COLLATE='utf8mb4_unicode_ci'
ENGINE=InnoDB
AUTO_INCREMENT=3
;

INSERT INTO `mfs_db`.`tb_liveshop` (`Title`, `Description`, `PageUrl`, `ImageUrl`, `UseYN`, `CreateId`, `UpdateId`) VALUES ('테스트입니다.', '테스트입니다. 2016일 방송', 'https://view.shoppinglive.naver.com/replays/1011400?fm=shoppinglive&sn=home', 'https://g-selected.pstatic.net/MjAyMzA0MTBfMjAw/MDAxNjgxMDk5MDAxOTkx.2S-iuB3zk42DLyRTfrK1YU6qLbwBlqRU4xB-yP8hjugg.RDnnLq-W1zb2LzUnLcgjl6QQzJOfePmw4oBXXFMdUesg.PNG/image.png?type=f320_480_q90', b'1', '정소영', '정소영');
INSERT INTO `mfs_db`.`tb_liveshop` (`Title`, `Description`, `PageUrl`, `ImageUrl`, `UseYN`, `CreateId`, `UpdateId`) VALUES ('테스트입니다.', '테스트입니다. 2016일 방송', 'https://view.shoppinglive.naver.com/replays/1011400?fm=shoppinglive&sn=home', 'https://g-selected.pstatic.net/MjAyMzA0MTBfMjAw/MDAxNjgxMDk5MDAxOTkx.2S-iuB3zk42DLyRTfrK1YU6qLbwBlqRU4xB-yP8hjugg.RDnnLq-W1zb2LzUnLcgjl6QQzJOfePmw4oBXXFMdUesg.PNG/image.png?type=f320_480_q90', b'1', '정소영', '정소영');

