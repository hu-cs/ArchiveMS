# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category_storage (
  category_name             varchar(255) not null,
  constraint pk_category_storage primary key (category_name))
;

create table Records (
  id                        integer not null,
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

create sequence category_storage_seq;

create sequence Records_seq;

create sequence UserStorage_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category_storage;

drop table if exists Records;

drop table if exists UserStorage;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists category_storage_seq;

drop sequence if exists Records_seq;

drop sequence if exists UserStorage_seq;

