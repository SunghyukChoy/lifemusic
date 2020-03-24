SELECT * FROM album a
JOIN genre_relation b ON a.id = b.relation_id AND b.table_name = 'album'
JOIN genre c ON b.genre_id = c.id
WHERE c.name = 'Pop/Rock';
;

SELECT * FROM song a
JOIN genre_relation b ON a.id = b.relation_id AND b.table_name = 'song'
JOIN genre c ON b.genre_id = c.id;

수정사항1
수정사항2

-- Replace with -> Discard Changes
-- Revert

-- Reset

버그를 열심히 막 고쳐
열심히
열심
