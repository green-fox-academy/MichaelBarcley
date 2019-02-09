CREATE DATABASE ToDo_db;

CREATE TABLE Users (
userID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
firstName VARCHAR(30) NOT NULL,
lastName VARCHAR(30) NOT NULL
);

CREATE TABLE Tasks (
taskID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
description BLOB,
ownerID INT NOT NULL,
FOREIGN KEY (ownerID) REFERENCES Users (userID),
isCompleted BOOLEAN DEFAULT false NOT NULL,
deadline DATE NOT NULL
);

INSERT INTO Users(firstName, lastName) VALUES
("Péter", "Nagy"), ("Blanka", "Hoóz"), 
("Mihály", "Barczi"), ("Derek", "Banas");

INSERT INTO Tasks(name, description, ownerID, deadline) VALUES

("Buy milk", "Buy it at Tesco", 4, '2019-01-21'),

("Számítózás", NULL, 3, '2019-01-02'),

("Cook lunch", "Do some indian food", 1, '2018-12-19'),

("Teach Java", "Help people do awesome coding", 2, '2019-03-15');