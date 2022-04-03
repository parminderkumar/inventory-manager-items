CREATE TABLE monu.items(
ID number,NAME varchar2(100),DESCRIPTION varchar2(200),ACTIVE varchar2(1)
);

CREATE TABLE monu.warehouses(
ID number,NAME varchar2(100),DESCRIPTION varchar2(200),ACTIVE varchar2(1),acty_ts timestamp
);