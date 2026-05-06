-- 创建数据库（如果不存在）
CREATE DATABASE IF NOT EXISTS demo CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE demo;

-- 创建 user 表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '用户ID',
    `name` VARCHAR(50) NOT NULL COMMENT '姓名',
    `age` INT COMMENT '年龄',
    `email` VARCHAR(100) COMMENT '邮箱'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

-- 插入测试数据
INSERT INTO `user` (`name`, `age`, `email`) VALUES 
('张三', 25, 'zhangsan@example.com'),
('李四', 30, 'lisi@example.com'),
('王五', 28, 'wangwu@example.com'),
('赵六', 35, 'zhaoliu@example.com'),
('孙七', 22, 'sunqi@example.com'),
('周八', 40, 'zhouba@example.com'),
('吴九', 27, 'wujiu@example.com'),
('郑十', 33, 'zhengshi@example.com'),
('陈十一', 29, 'chenShiyi@example.com'),
('刘十二', 31, 'liushier@example.com');

-- 查询验证
SELECT * FROM `user`;
