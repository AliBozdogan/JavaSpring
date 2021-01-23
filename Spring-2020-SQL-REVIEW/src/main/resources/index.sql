EXPLAIN ANALYZE
select *
from towns
where name='e3037baebdbfc2e8ce20ecef28f40f4a';

CREATE INDEX idx_towns_name ON towns(name);



EXPLAIN ANALYZE
select *
from towns
where id='488';

SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;