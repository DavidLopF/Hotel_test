INSERT INTO public.site
(site_id, site_name)
VALUES(1, 'Bogota');

INSERT INTO public.site
(site_id, site_name)
VALUES(2, 'Cali');

INSERT INTO public.site
(site_id, site_name)
VALUES(3, 'Barranquilla';

INSERT INTO public.site
(site_id, site_name)
VALUES(4, 'Cartagena');

/**** hoteles ***/

INSERT INTO public.hotel
(hotel_id, capacity, number_rooms, site_id, img_url)
VALUES(1, 252, 42, 1, 'https://www.hotelplazabogota.com/wp-content/uploads/2018/10/Hotel-Plaza-Bogota-Exterior-1.jpg');
INSERT INTO public.hotel
(hotel_id, capacity, number_rooms, site_id)
VALUES(2, 132, 22, 2);
INSERT INTO public.hotel
(hotel_id, capacity, number_rooms, site_id)
VALUES(3, 132, 22, 3);
INSERT INTO public.hotel
(hotel_id, capacity, number_rooms, site_id)
VALUES(4, 88, 11, 4);


/*** tipos ***/
INSERT INTO public."type"
(id, "name")
VALUES(1, 'estandar');
INSERT INTO public."type"
(id, "name")
VALUES(2, 'premiun');
INSERT INTO public."type"
(id, "name")
VALUES(3, 'vip');



/*** habitaciones ***/
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(1, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(2, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(3, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(4, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(5, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(6, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(7, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(8, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(9, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(10, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(11, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(12, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(13, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(14, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(15, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(16, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(17, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(18, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(19, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(20, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(21, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(22, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(23, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(24, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(25, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(26, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(27, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(28, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(29, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(30, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(31, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(32, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(33, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(34, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(35, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(36, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(37, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(38, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(39, 1, 6, 1, 100000, '1', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(40, 1, 4, 1, 200000, '2', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(41, 1, 2, 1, 300000, '3', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(42, 1, 2, 1, 300000, '3', 1);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(63, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(64, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(65, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(66, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(67, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(68, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(69, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(70, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(71, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(72, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(73, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(74, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(75, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(76, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(77, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(78, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(79, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(80, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(81, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(82, 1, 6, 2, 200000, '2', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(83, 1, 6, 2, 300000, '3', 2);
INSERT INTO public.rooms
(room_id, available, capacity, id_hotel, price, room_type, site_id)
VALUES(84, 1, 6, 2, 300000, '3', 2);


CREATE TABLE IF NOT EXISTS public.reserve
(
    reserve_id bigint NOT NULL DEFAULT nextval('reserve_reserve_id_seq'::regclass),
    date_in character varying(255) COLLATE pg_catalog."default",
    date_out character varying(255) COLLATE pg_catalog."default",
    dni_client character varying(255) COLLATE pg_catalog."default",
    room_id bigint,
    CONSTRAINT reserve_pkey PRIMARY KEY (reserve_id)
    )


/** function to insert a reserve que retorne la reserva insertada */
CREATE OR REPLACE FUNCTION do_reserve(date_in varchar, date_out varchar, dni_client varchar, room_id int )
RETURNS TABLE (status int, response json)
AS $$
DECLARE
room record;
reservation record;
BEGIN

select * into room from rooms ro where ro.room_id = $4;
raise notice 'La room selecionada es :%', room;
    if date_in > date_out then
        raise notice 'La fecha de entrada no puede ser mayor que la fecha de salida';
return query select 400 as status, json_build_object('message', 'La fecha de entrada no puede ser mayor que la fecha de salida') as response;
return;
end if;
    if to_date(date_in, 'DD-MM-YYYY') < now()::date or to_date(date_out, 'DD-MM-YYYY') < now()::date then
        raise notice 'La fecha de entrada o salida no puede ser menor a la fecha actual';
return query select 400 as status, json_build_object('message', 'La fecha de entrada o salida no puede ser menor a la fecha actual') as response;}
        return;
end if;
    if room is null then
        raise notice 'La habitacion no existe';
return query select 400 as status, json_build_object('message', 'La habitacion no existe') as response;
return;

end if;
    if room.available = 0 then
        raise notice 'La habitacion no esta disponible';
return query select 400 as status, json_build_object('message', 'La habitacion no esta disponible') as response;
return;
end if;
insert into reserve (date_in, date_out, dni_client, room_id) values (to_date(date_in, 'DD-MM-YYYY'), to_date(date_out, 'DD-MM-YYYY'), dni_client, $4)
    returning * into reservation;
update rooms ro set available = 0 where ro.room_id = $4;
return query select 200 as status, json_build_object('message', 'Reserva realizada con exito', 'reservation', reservation) as response;

END;
$$
Language plpgsql