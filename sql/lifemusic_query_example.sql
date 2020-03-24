SELECT * FROM album a
JOIN genre_relation b ON a.id = b.relation_id AND b.table_name = 'album'
JOIN genre c ON b.genre_id = c.id
WHERE c.name = 'Pop/Rock';
;

SELECT * FROM song a
JOIN genre_relation b ON a.id = b.relation_id AND b.table_name = 'song'
JOIN genre c ON b.genre_id = c.id;