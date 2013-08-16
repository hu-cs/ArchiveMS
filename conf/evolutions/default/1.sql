# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category_storage (
  category_name             varchar(255) not null,
  constraint pk_category_storage primary key (category_name))
;

create table Records (
  id                        integer auto_increment not null,
  category                  varchar(255),
  name                      varchar(255),
  tag                       varchar(255),
  publish_date              varchar(255),
  record_date               varchar(255),
  archive_date              varchar(255),
  path                      varchar(255),
  constraint pk_Records primary key (id))
;

create table UserStorage (
  username                  varchar(255) not null,
  password                  varchar(255),
  retyped_password          varchar(255),
  job                       varchar(255),
  constraint pk_UserStorage primary key (username))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table category_storage;

drop table Records;

drop table UserStorage;

SET FOREIGN_KEY_CHECKS=1;

