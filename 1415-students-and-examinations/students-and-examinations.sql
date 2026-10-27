# Write your MySQL query statement below
select s.student_id,s.student_name,sb.subject_name, count(e.student_id) as attended_exams 
from students as s
cross join subjects as sb
left join examinations as e on s.student_id = e.student_id 
and sb.subject_name = e.subject_name
group by sb.subject_name, s.student_id
order by s.student_id,sb.subject_name;

-- select *
-- from examinations as e
--  join subjects as sb on e.subject_name = sb.subject_name
--  order by e.student_id
-- group by sb.subject_name;