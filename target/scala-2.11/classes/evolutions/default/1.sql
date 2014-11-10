# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                        integer auto_increment not null,
  name                      varchar(255),
  image_directory           varchar(255),
  constraint pk_category primary key (id))
;

create table post (
  id                        integer auto_increment not null,
  title                     varchar(255),
  post_date                 datetime,
  subtitle                  varchar(255),
  postbody                  TEXT,
  category_id               integer,
  constraint pk_post primary key (id))
;

create table user (
  email                     varchar(255) not null,
  password                  varchar(255),
  constraint pk_user primary key (email))
;

alter table post add constraint fk_post_category_1 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_post_category_1 on post (category_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table category;

drop table post;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

