-- H2 syntax referred from : https://www.jianshu.com/p/b3671e148366
CREATE TABLE IF NOT EXISTS `sys_organization` (
  `id` BIGINT  NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100),
  `priority` INT,
  `parent_id` BIGINT,
  `parent_ids` VARCHAR(100),
  `available` BOOL DEFAULT FALSE,
  CONSTRAINT pk_sys_organization PRIMARY KEY(`id`)
);
CREATE INDEX idx_sys_organization_parent_id ON `sys_organization`(`parent_id`);