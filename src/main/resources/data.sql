drop table if exists receipt;

create table receipt(
    id int primary key,
    description varchar(255),
    total double
);

insert into receipt(id, description, total) values (1, 'Success Collect', 100);
insert into receipt(id, description, total) values (2, 'Success Distribution', 200);
insert into receipt(id, description, total) values (3, 'Success Transhipment', 300);