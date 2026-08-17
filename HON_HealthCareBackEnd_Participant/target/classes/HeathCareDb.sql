create database healthcareDb;

use healthcareDb;

CREATE TABLE patients (
    patientId BIGINT PRIMARY KEY AUTO_INCREMENT,
    patientName VARCHAR(100) NOT NULL,
    age INT,
    gender VARCHAR(10),
    contactNumber VARCHAR(15)
);

CREATE TABLE appointments (
    appointmentId BIGINT PRIMARY KEY AUTO_INCREMENT,
    appointmentDate DATE NOT NULL,
    appointmentTime TIME NOT NULL,
    doctorName VARCHAR(100) NOT NULL,
    status VARCHAR(20),
    patientId BIGINT NOT NULL,

    CONSTRAINT fk_patient
        FOREIGN KEY (patientId)
        REFERENCES patients(patientId)
        ON DELETE CASCADE
);
INSERT INTO patients (patientname, age, gender, contactnumber)
VALUES ('John Doe', 35, 'Male', '9876543210');

INSERT INTO patients (patientname, age, gender, contactnumber)
VALUES ('Priya Sharma', 28, 'Female', '9988776655');

INSERT INTO patients (patientname, age, gender, contactnumber)
VALUES ('Rahul Verma', 42, 'Male', '9871122334');

INSERT INTO patients (patientname, age, gender, contactnumber)
VALUES ('Anita Singh', 31, 'Female', '9900112233');

INSERT INTO patients (patientname, age, gender, contactnumber)
VALUES ('Suresh Kumar', 50, 'Male', '9911223344');


INSERT INTO appointments (appointmentdate, appointmenttime, doctorname, status, patientid)
VALUES ('2026-02-10', '10:30:00', 'Dr. Smith', 'Scheduled', 1);

INSERT INTO appointments (appointmentdate, appointmenttime, doctorname, status, patientid)
VALUES ('2026-02-11', '11:00:00', 'Dr. Mehta', 'Scheduled', 2);

INSERT INTO appointments (appointmentdate, appointmenttime, doctorname, status, patientid)
VALUES ('2026-02-12', '09:45:00', 'Dr. Gupta', 'Completed', 3);

INSERT INTO appointments (appointmentdate, appointmenttime, doctorname, status, patientid)
VALUES ('2026-02-13', '14:15:00', 'Dr. Singh', 'Scheduled', 4);

INSERT INTO appointments (appointmentdate, appointmenttime, doctorname, status, patientid)
VALUES ('2026-02-14', '16:00:00', 'Dr. Rao', 'Cancelled', 5);

