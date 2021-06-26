USE Hotel_1
GO

CREATE TABLE Staff (
indx INT identity(1,1),
StaffID AS 'ST' + RIGHT(CONVERT(VARCHAR(5), indx), 5) PERSISTED PRIMARY KEY,
FullName nvarchar (50) NOT NULL,
Gender varchar(5),
cAddress varchar(50),
PhoneNumber varchar(20) NOT NULL UNIQUE,
DateofBirth datetime,
Position varchar(20) NOT NULL,
)


CREATE TABLE Room (
RoomID varchar(5) primary key,
TypeofRoom varchar(20),
cStatus varchar(20),
StaffID varchar(7), 
BookingID varchar(7)
)

ALTER TABLE Room ADD BookingID varchar(7)

CREATE TABLE Client (
indx INT identity(1,1),
ClientID AS 'CI' + RIGHT(CONVERT(VARCHAR(5), indx),5) PERSISTED PRIMARY KEY,
FullName nvarchar(50),
PhoneNumber varchar(20) UNIQUE,
DateofBirth datetime,
CCCD varchar(20) UNIQUE
)
SELECT ClientID, FullName, CCCD, PhoneNumber, DateofBirth FROM Client

CREATE TABLE Booking (
indx INT identity(1,1),
BookingID AS 'BK' + RIGHT(CONVERT(VARCHAR(5), indx), 5) PERSISTED PRIMARY KEY,
RoomID varchar(5),
ClientID varchar(7),
CheckInDate datetime,
CheckOutDate datetime
)
Alter table Booking alter column CheckOutDate date

Select Booking.RoomID, ClientID,CheckInDate, CheckOutDate From Booking, Room where Booking.RoomID = Room.RoomID

CREATE TABLE Users (
Usrname varchar(7),
cPassword varchar(10),
authority char(1)
)
select * from Users
SELECT * FROM Booking;
select * from room;
update Room set StaffID=null where RoomID='P003'

ALTER TABLE Room ADD CONSTRAINT st_room_fk foreign key(StaffID) references Staff(StaffID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Booking ADD CONSTRAINT cli_bk_fk foreign key(ClientID) references Client(ClientID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Booking ADD CONSTRAINT room_bk_fk foreign key(RoomID) references Room(RoomID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Users ADD CONSTRAINT usr_fk foreign key(Usrname) references Staff(StaffID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Room ADD CONSTRAINT bk_r_fk FOREIGN KEY (BookingID) REFERENCES Booking(BookingID)

ALTER TABLE Staff ADD CONSTRAINT ck_gen CHECK (Gender=N'Nam' or Gender=N'Nu')
ALTER TABLE USERS ADD CONSTRAINT ck_au CHECK (authority='1' or authority='0')
ALTER TABLE Booking ADD CONSTRAINT chk_bk CHECK (CheckInDate <= CheckOutDate)
ALTER TABLE Booking DROP CONSTRAINT chk_bk

----- SET DATEFORMAT DMY
DROP TABLE Staff

INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGUYEN NHU NHUT', 'Nu','80 Nguyen Thai Binh, Q1, TPHCM','0927345678',13-04-2001,'Room Attendent')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('LE THI PHI YEN','Nu','333 Nguyen Hue, Q1, TPHCM','0987567390',21-04-2000,'Room Attendent')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGUYEN VAN B','Nam','40 Nguyen Van Troi, Phu Nhuan, TPHCM','0997047382',27-04-1999,'Security Guard')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGO THANH TUAN','Nam','255 Le Thi Rieng, Q12, TPHCM','09137584980',24-06-1998,'Receptionist')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGUYEN THI TRUC THANH','Nu','354 Di An, Binh Duong','0918590387',20-07-1996,'Manager')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGUYEN THI THU THUY','Nu','300 Vo Van Ngan, Thu Duc, TPHCM','0918783905',25-12-1982,'Cleaner')
INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('NGO THI BINH','Nu','03 Tan Lap, Di An, Binh Duong','091632783',10-08-1990,'Cleaner')

INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P001', 'VIP', 'Available', 'ST6')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P002', 'VIP', 'Booked', 'ST1')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P002', 'Standard', 'Available', 'ST6')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P004', 'Standard', 'Booked', 'ST2')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P005', 'Double', 'Booked', 'ST6')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P006', 'Single', 'Available', 'ST6')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P007', 'Twin', 'Available', 'ST2')
INSERT INTO Room(RoomID, TypeofRoom, cStatus, StaffID) VALUES ('P008', 'Triple', 'Booked', 'ST2')

INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('NGUYEN VAN A','088234572',10/05/1990,'11')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('TRAN NGOC HAN','0908256478',15/07/1989,'222')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('TRAN NGOC LINH','0938776266',22-03-1991,'1212')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('TRAN MINH LONG','0917325476',10-09-1990,'1231')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('LE NHAT MINH','08246108',25-5-1970,'1313')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('LE HOAI THUONG','08631738',30-04-1992,'1222')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('NGUYEN VAN TAM','0916783565',18-01-2000,'2222')
INSERT INTO Client(FullName,PhoneNumber,DateofBirth,CCCD) VALUES ('PHAN THI THANH','0938435756',17-07-1999,'2323')

INSERT INTO Booking(RoomID, ClientID) VALUES ('P005','CI1')
INSERT INTO Booking(RoomID, ClientID) VALUES ('P002','CI2')
INSERT INTO Booking(RoomID, ClientID) VALUES ('P004','CI3')
INSERT INTO Booking(RoomID, ClientID) VALUES ('P002','CI5')

INSERT INTO Users(Usrname, cPassword,authority) VALUES ('ST4', '12345678','0')
INSERT INTO Users(Usrname, cPassword,authority) VALUES ('ST5', '12345678','1')

-------------------------------------------------------------------

SELECT * FROM Client

SELECT * FROM Staff

select * from Staff Where FullName='NGUYEN NHU NHUT'

select * from users
SELECT * 
FROM CLIENT, Booking
WHERE Client.ClientID = Booking.ClientID
AND Booking.RoomID = 'P005' 

SELECT *
FROM Staff
WHERE StaffID = 'ST1'

SELECT * FROM Room

select * from Staff Where FullName like '%YEN'
 
--------------------------------------------------------------

GO
CREATE TRIGGER trg_ins_st ON Staff
FOR INSERT, UPDATE
AS BEGIN
      DECLARE @indx INT, @StaffID varchar(7), @FullName varchar(20), @Gender varchar(5), @cAddress varchar(50), @PhoneNumber varchar(10), @DateofBirth datetime, @Position varchar(20)
      SELECT @indx = indx, @StaffID = StaffID , @FullName = FullName, @Gender = Gender, @cAddress = cAddress, @PhoneNumber = PhoneNumber, @DateofBirth = DateofBirth, @Position = Position 
	  FROM INSERTED
	  WHERE Position = 'Manager' Or Position = 'Receptionist'

	  DECLARE cur_st CURSOR
	  FOR
	     SELECT StaffID
		 FROM Staff
		 WHERE StaffID = @StaffID

	   OPEN cur_st
	   FETCH NEXT FROM cur_st
	   INTO @StaffID

	   WHILE (@@FETCH_STATUS = 0)
	   BEGIN
	      FETCH NEXT FROM cur_st
		  INTO @StaffID
	   END
	  CLOSE cur_st
	  DEALLOCATE cur_st
	       
	  UPDATE Users
	  SET cPassword = '12345678'
	  WHERE Usrname = @StaffID
END

GO
CREATE TRIGGER trg_ins_bk ON Booking
FOR INSERT, UPDATE
AS 
BEGIN
     DECLARE @RoomID varchar(5), @CheckInDate datetime, @CheckOutDate datetime
	 SELECT @RoomID = RoomID, @CheckInDate = CheckInDate, @CheckOutDate = CheckOutDate
	 FROM INSERTED

	 UPDATE Room
	 SET cStatus = 'Booked'
	 WHERE RoomID = @RoomID 
END

----
GO 
CREATE TRIGGER trg_ins_bking ON Booking
FOR INSERT, UPDATE
AS BEGIN
DECLARE @CheckInDate datetime, @CheckOutDate datetime
SELECT @CheckInDate = CheckInDate, @CheckOutDate = CheckOutDate
FROM inserted
IF(@CheckOutDate > @CheckInDate)
BEGIN
PRINT 'Succeeded'
END
ELSE 
BEGIN
PRINT 'Check-in date must be less than check-out date'
ROLLBACK TRANSACTION
END
END

------------------------------

DROP TRIGGER trg_ins_bking
DROP TRIGGER trg_ins_bk
ALTER TABLE Booking DROP CONSTRAINT df_bk
ALTER TABLE Booking DROP CONSTRAINT df_co
ALTER TABLE Booking DROP CONSTRAINT chk_bk
-------------------------------------------
ALTER TABLE Booking DROP CONSTRAINT cli_bk_fk
ALTER TABLE Booking DROP CONSTRAINT room_bk_fk
ALTER TABLE Room DROP CONSTRAINT bk_r_fk
DROP TABLE Booking
-- chay lai bang Booking o tren
ALTER TABLE Booking ADD CONSTRAINT cli_bk_fk foreign key(ClientID) references Client(ClientID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Booking ADD CONSTRAINT room_bk_fk foreign key(RoomID) references Room(RoomID) on DELETE CASCADE on UPDATE CASCADE
ALTER TABLE Room ADD CONSTRAINT bk_r_fk FOREIGN KEY (BookingID) REFERENCES Booking(BookingID)
ALTER TABLE Booking ADD CONSTRAINT chk_bk CHECK (CheckInDate <= CheckOutDate);
--- 

