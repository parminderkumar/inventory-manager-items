CREATE TABLE monu.items(
ID number,NAME varchar2(100),DESCRIPTION varchar2(200),ACTIVE varchar2(1)
);

CREATE TABLE monu.warehouses(
ID number,NAME varchar2(100),DESCRIPTION varchar2(200),ACTIVE varchar2(1),acty_ts timestamp
);
/* Initial Population*/
declare 
begin
for i in 1 .. 100
loop
insert into Items values ( i, 'Item ' || i, 'Test Item Desc ' || i, 'Y', systimestamp);
end loop;
commit;
end;

declare 
begin
for i in 1 .. 100
loop
insert into Warehouses values ( i, 'Warehouse ' || i, 'Test Warehouse Desc ' || i, 'Y', systimestamp);
end loop;
commit;
end;

