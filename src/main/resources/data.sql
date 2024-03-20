CREATE TABLE Application (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    description TEXT,
    owner VARCHAR(255)
);

-- Create Ticket table
CREATE TABLE Ticket (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    application_id INT,
    status VARCHAR(50),
    FOREIGN KEY (application_id) REFERENCES Application(id)
);
INSERT into application (id,name,description,owner) values(1,'Trackzilla','', 'Trackzilla');
INSERT into ticket(id,title,description, application_id,status) values(1,'Sort Feature','Add the ability to sort tickets by serverity', 1,'OPEN');
INSERT into ticket(id,title,description, application_id,status) values(2,'Sort Feature','Add the ability to sort tickets by invoice date', 1,'OPEN');
INSERT into ticket(id,title,description, application_id,status) values(3,'Sort Feature','Add the ability to audit by year', 1,'OPEN');
INSERT into ticket(id,title,description, application_id,status) values(4,'Sort Feature','Add the ability to book tickets online', 1,'OPEN');
