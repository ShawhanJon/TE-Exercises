
DROP TABLE IF EXISTS project CASCADE;
DROP TABLE IF EXISTS employee CASCADE;
DROP TABLE IF EXISTS department CASCADE;

       CREATE TABLE project (
        project_id VARCHAR(5),
        project_name VARCHAR(10),
        project_cost NUMERIC(15, 2),
        PRIMARY KEY(project_id)
);

       CREATE TABLE department (
        department_number INT,
        department_name VARCHAR(20),
        PRIMARY KEY(department_number)
);

       CREATE TABLE employee (
        employee_id SERIAL,
        job_title VARCHAR(20),
        first_name VARCHAR(20),
        last_name VARCHAR(20),
        gender VARCHAR(10),
        dob DATE,
        date_of_hire DATE,
        department_number INT,
        assigned_project VARCHAR(5),
        PRIMARY KEY(employee_id),
        
        CONSTRAINT fk_project FOREIGN KEY(assigned_project) REFERENCES project(project_id),
        CONSTRAINT fk_department FOREIGN KEY(department_number) REFERENCES department(department_number)
);

--PROJECTS
INSERT INTO project VALUES ( 'M1JA' ,'Java', '3500.00');

INSERT INTO project VALUES ( 'M3C' ,'C#', '2100.35');

INSERT INTO project VALUES ( 'M2SQL' ,'SQL', '10500.50');

INSERT INTO project VALUES ( 'M3JS' ,'JavaScript', '90000.99');



--DEPARTMENTS
INSERT INTO department VALUES ( '1', 'Module One');

INSERT INTO department VALUES ( '2', 'Module Two');

INSERT INTO department VALUES ( '3', 'Module Three');


--EMPLOYEES
INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Jon', 'Barnette','Male','1990-09-27','2021-01-07', '3', 'M3C');

INSERT INTO employee VALUES (DEFAULT, 'Boss Man', 'Steve', 'Carmichael','Male','1910-05-13','1930-01-15', '3', 'M3C');

INSERT INTO employee VALUES (DEFAULT, 'Boss Man Assistant', 'Kevin', 'Teos','Male','1980-03-17','2020-05-15', '3', 'M3JS');

INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Blase', 'Pinkert','Male','1960-08-15','2021-01-07', '1', 'M1JA');

INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Brad', 'Barczyk','Male','1984-11-14','2021-01-07', '1', 'M1JA');

INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Byron', 'Alcantara','Male','1994-12-13','2021-01-07', '2', 'M2SQL');

INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Casey', 'Delaney','Male','1986-04-23','2021-01-07', '2', 'M2SQL');

INSERT INTO employee VALUES (DEFAULT, 'Junior Dev', 'Charlie', 'Nguyen','Male','1982-02-02','2021-01-07', '2', 'M3JS');