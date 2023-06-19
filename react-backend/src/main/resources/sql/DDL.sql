-- REACT_TEST.TB_BOARD definition

CREATE TABLE `TB_BOARD` (
  `BRD_SN` bigint(20) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(50) DEFAULT NULL COMMENT '제목',
  `CONTENTS` varchar(500) DEFAULT NULL COMMENT '내용',
  `REG_NM` varchar(500) DEFAULT NULL COMMENT '작성자명',
  `REG_DT` text DEFAULT NULL COMMENT '작성일',
  PRIMARY KEY (`BRD_SN`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='게시판 테이블';