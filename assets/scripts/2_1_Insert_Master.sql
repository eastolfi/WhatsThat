BEGIN TRANSACTION;

-- Inserta los valores de las marcas
insert into brands (brand_name) values('Samsung');
insert into brands (brand_name) values('LG');
insert into brands (brand_name) values('Philips');
insert into brands (brand_name) values('Panasonic');
insert into brands (brand_name) values('Sony');

-- Inserta los valores de los controles remotos
insert into remote_controls ("control_name", "order") values('Power', 1);
insert into remote_controls ("control_name", "order") values('Chanel_Up', 2);
insert into remote_controls ("control_name", "order") values('Chanel_Down', 3);
insert into remote_controls ("control_name", "order") values('Volume_Up', 4);
insert into remote_controls ("control_name", "order") values('Volume_Down', 5);
insert into remote_controls ("control_name", "order") values('Mute', 6);
insert into remote_controls ("control_name", "order") values('Menu', 7);
insert into remote_controls ("control_name", "order") values('Exit', 8);
insert into remote_controls ("control_name", "order") values('Info', 9);
insert into remote_controls ("control_name", "order") values('Guide', 10);
insert into remote_controls ("control_name", "order") values('Up', 11);
insert into remote_controls ("control_name", "order") values('Down', 12);
insert into remote_controls ("control_name", "order") values('Left', 13);
insert into remote_controls ("control_name", "order") values('Right', 14);
insert into remote_controls ("control_name", "order") values('Enter', 15);
insert into remote_controls ("control_name", "order") values('Chanel_0', 16);
insert into remote_controls ("control_name", "order") values('Chanel_1', 17);
insert into remote_controls ("control_name", "order") values('Chanel_2', 18);
insert into remote_controls ("control_name", "order") values('Chanel_3', 19);
insert into remote_controls ("control_name", "order") values('Chanel_4', 20);
insert into remote_controls ("control_name", "order") values('Chanel_5', 21);
insert into remote_controls ("control_name", "order") values('Chanel_6', 22);
insert into remote_controls ("control_name", "order") values('Chanel_7', 23);
insert into remote_controls ("control_name", "order") values('Chanel_8', 24);
insert into remote_controls ("control_name", "order") values('Chanel_9', 25);

COMMIT;