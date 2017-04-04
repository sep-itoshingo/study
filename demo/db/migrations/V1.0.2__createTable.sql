use springboot_demo;
create table `USER` (
  ID int(8) not null auto_increment comment 'ID',
  NAME varchar(256) not null comment '名前',
  CREATE_AT timestamp null default null comment '作成日時',
  UPDATE_AT timestamp default current_timestamp on update current_timestamp comment '更新日時',
  DELETE_AT timestamp null default null comment '削除日時',
  DELETE_FLAG tinyint(1) not null default false comment '削除フラグ',
  primary key(ID)
) engine=InnoDB default charset=utf8 comment 'ユーザ情報';