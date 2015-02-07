BEGIN TRANSACTION;

-- Inserta los códigos infrarrojos
insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Power'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_1'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006c 0022 0003 00ab 00aa 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0040 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0016 0015 003f 0015 0015 0015 003f 0015 003f 0015 0040 0015 003f 0015 003f 0015 0713 00ab 00aa 0015 0015 0015 0e91', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_2'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006c 0022 0003 00ab 00aa 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0040 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 0040 0015 003f 0015 003f 0015 0714 00ab 00aa 0015 0015 0015 0e91', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_3'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_4'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0016 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_5'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_6'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0023 0003 0001 5a59 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_7'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_8'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_9'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006c 0022 0003 00ab 00aa 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0040 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0016 0015 003f 0015 003f 0015 003f 0015 0015 0015 0040 0015 003f 0015 003f 0015 0713 00ab 00aa 0015 0015 0015 0e91', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_0'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006c 0022 0003 00ab 00aa 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0040 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 0712 00ab 00aa 0015 0015 0015 0e91', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Enter'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 0040 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_Up'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Chanel_Down'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Volume_Up'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0702 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Volume_Down'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Menu'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 003f 0015 075e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Up'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 075f', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Down'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 003f 0015 003f 0015 0015 0015 003f 0015 075e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Left'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 0015 0015 0016 0015 003f 0015 003f 0015 003f 0015 003f 0015 0015 0015 003f 0015 075e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Right'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006c 0022 0003 00ab 00aa 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0714 00ab 00aa 0015 0015 0015 0e91', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Mute'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0022 0003 00a9 00a8 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 003f 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 003f 0015 0703 00a9 00a8 0015 0015 0015 0e6e', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Exit'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0016 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 075f', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Guide'));

insert into ir_codes (ir_code, id_brand, id_control) values(
'0000 006d 0000 0022 00a9 00a8 0015 003f 0015 0015 0015 003f 0015 0016 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 003f 0015 0016 0015 003f 0015 0015 0015 003f 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 003f 0015 0015 0015 0015 0015 003f 0015 075f', 
(select _id from brands where brand_name = 'Samsung'), 
(select _id from remote_controls where control_name = 'Info'));

COMMIT;