-- This file demonstrates basic SQL & DBMS concepts


-- Create Database
CREATE DATABASE CubingDB;
GO

USE CubingDB;
GO


-- Need for Database
-- Database helps in structured storage, avoids redundancy,
-- supports multi-user access and maintains data integrity


-- Create Table with Constraints
CREATE TABLE Users (
    user_id INT IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    country VARCHAR(50) DEFAULT 'India',
    age INT CHECK (age >= 5)
);

CREATE TABLE Competitions (
    comp_id INT IDENTITY(1,1) PRIMARY KEY,
    comp_name VARCHAR(100) NOT NULL,
    location VARCHAR(50),
    event_date DATE
);

CREATE TABLE Registrations (
    reg_id INT IDENTITY(1,1) PRIMARY KEY,
    user_id INT,
    comp_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (comp_id) REFERENCES Competitions(comp_id)
);


-- Insert Into
INSERT INTO Users (username, country, age)
VALUES
('Aditya', 'India', 22),
('Max', 'USA', 25),
('Yuki', 'Japan', 19);

INSERT INTO Competitions (comp_name, location, event_date)
VALUES
('Mumbai Open', 'Mumbai', '2025-02-10'),
('Tokyo Cube Fest', 'Tokyo', '2025-03-15');

INSERT INTO Registrations (user_id, comp_id)
VALUES (1, 1), (2, 1), (3, 2);


-- Select
SELECT * FROM Users;

-- Distinct
SELECT DISTINCT country FROM Users;

-- Where
SELECT * FROM Users WHERE country = 'India';

-- AND / OR
SELECT * FROM Users WHERE country = 'India' AND age > 18;

-- Order By
SELECT * FROM Users ORDER BY age DESC;

-- Select Top
SELECT TOP 2 * FROM Users;


-- Like and Wildcards
SELECT * FROM Users WHERE username LIKE 'A%';
SELECT * FROM Users WHERE username LIKE '%i%';


-- IN and BETWEEN
SELECT * FROM Users WHERE country IN ('India', 'USA');
SELECT * FROM Users WHERE age BETWEEN 18 AND 25;


-- Aliases
SELECT username AS CuberName, country AS Nation FROM Users;


-- Update
UPDATE Users
SET country = 'UK'
WHERE username = 'Max';


-- Delete
DELETE FROM Users WHERE username = 'DummyUser';


-- Joins
-- Inner Join
SELECT u.username, c.comp_name
FROM Users u
INNER JOIN Registrations r ON u.user_id = r.user_id
INNER JOIN Competitions c ON r.comp_id = c.comp_id;

-- Left Join
SELECT u.username, r.reg_id
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id;

-- Right Join
SELECT u.username, r.reg_id
FROM Users u
RIGHT JOIN Registrations r ON u.user_id = r.user_id;

-- Full Join
SELECT u.username, r.reg_id
FROM Users u
FULL JOIN Registrations r ON u.user_id = r.user_id;


-- Union
SELECT country FROM Users
UNION
SELECT location FROM Competitions;


-- Select Into
SELECT * INTO IndianUsers
FROM Users
WHERE country = 'India';


-- Insert Into Select
INSERT INTO IndianUsers
SELECT * FROM Users WHERE age > 20;


-- Null Values and Null Functions
SELECT * FROM Competitions WHERE location IS NULL;
SELECT comp_name, ISNULL(location, 'TBD') FROM Competitions;


-- Group By and Having
SELECT country, COUNT(*) AS UserCount
FROM Users
GROUP BY country
HAVING COUNT(*) >= 1;


-- Views
CREATE VIEW UserCompetitionView AS
SELECT u.username, c.comp_name
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
JOIN Competitions c ON r.comp_id = c.comp_id;

SELECT * FROM UserCompetitionView;


-- Index
CREATE INDEX idx_username ON Users(username);


-- Alter Table
ALTER TABLE Users ADD email VARCHAR(100);


-- Stored Procedure
CREATE PROCEDURE GetAllUsers
AS
BEGIN
    SELECT * FROM Users;
END;

EXEC GetAllUsers;


-- Prepared Statement (Parameterized Query simulation)
DECLARE @countryName VARCHAR(50) = 'India';
SELECT * FROM Users WHERE country = @countryName;


-- Normalization Concepts with Examples


-- 1NF (First Normal Form)
-- Rule: Atomic values, no repeating groups
-- Not in 1NF:
-- Student(id, name, events) → events = '3x3,4x4,OH'

-- Converted to 1NF:
-- Student(id, name)
-- StudentEvents(id, event)


-- 2NF (Second Normal Form)
-- Rule: Must be in 1NF and no partial dependency
-- Composite key issue

-- Not in 2NF:
-- Registration(user_id, comp_id, username)
-- username depends only on user_id

-- Converted to 2NF:
-- Users(user_id, username)
-- Registrations(user_id, comp_id)


-- 3NF (Third Normal Form)
-- Rule: Must be in 2NF and no transitive dependency

-- Not in 3NF:
-- Users(user_id, username, country, country_code)
-- country_code depends on country, not user_id

-- Converted to 3NF:
-- Users(user_id, username, country)
-- Country(country, country_code)


-- BCNF (Boyce-Codd Normal Form)
-- Stronger version of 3NF
-- Every determinant must be a candidate key

-- Not in BCNF:
-- Coach(coach, event, location)
-- coach → location
-- event → coach

-- Converted to BCNF:
-- CoachEvent(event, coach)
-- CoachLocation(coach, location)
