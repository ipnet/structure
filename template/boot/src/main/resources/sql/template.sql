drop table if exists demo;

create table demo
(
    `id`   bigint       not null primary key comment 'id',
    `name` varchar(128) not null default '' comment 'name'
)comment 'template demo';


insert into demo
values (1, 'hello'),
       (2, 'world'),
       (3, 'java'),
       (4, 'javascript');