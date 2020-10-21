create table comment
(
	id BIGINT null,
	parent_id BIGINT not null comment '父类id',
	type int not null comment '父类类型',
	commentator int not null comment '评论人id',
	gmt_create BIGINT not null comment '创建时间',
	gmt_modified BIGINT not null comment '更新时间',
	like_count BIGINT default 0 null
);

