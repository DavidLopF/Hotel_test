/** hacer una vista que tenga esta query select h.hotel_id , h.capacity , h.number_rooms, h.hotel_id , s.site_name as ubicacion
from hotel h 
left join site s on s.site_id  = h.site_id 

*/

CREATE OR REPLACE VIEW hotel_with_ubication AS 
select h.hotel_id , h.capacity , h.number_rooms, h.hotel_id , s.site_name as ubicacion
from hotel h
left join site s on s.site_id  = h.site_id
```