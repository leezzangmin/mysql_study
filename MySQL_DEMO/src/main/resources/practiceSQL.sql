SET optimizer_switch='skip_scan=on';
ALTER TABLE employees ADD INDEX ix_gender_birthdate (gender,birth_date);

select gender, birth_date from employees WHERE birth_date>='1965-02-01';
----------------------------------------------------------------------------------------
------------------------explain---------------------------------------------------------
----------------------------------------------------------------------------------------
select gender, birth_date from employees WHERE gender='M' AND birth_date>='1965-02-01';
select gender, birth_date from employees WHERE gender='F' AND birth_date>='1965-02-01';
