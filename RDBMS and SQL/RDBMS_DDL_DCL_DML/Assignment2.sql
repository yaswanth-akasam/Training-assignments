CREATE TABLE Category (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE Publisher (
    PublisherID INT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL UNIQUE,
    ContactInfo VARCHAR(255)
);

CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    ISBN VARCHAR(13) NOT NULL UNIQUE,
    PublicationYear INT CHECK (PublicationYear > 0),
    CategoryID INT NOT NULL,
    PublisherID INT NOT NULL,
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID),
    FOREIGN KEY (PublisherID) REFERENCES Publisher(PublisherID)
);

CREATE TABLE Author (
    AuthorID INT PRIMARY KEY ,
    Name VARCHAR(255) NOT NULL,
    Bio TEXT
);

CREATE TABLE Book_Author (
    BookID INT NOT NULL,
    AuthorID INT NOT NULL,
    PRIMARY KEY (BookID, AuthorID),
    FOREIGN KEY (BookID) REFERENCES Book(BookID),
    FOREIGN KEY (AuthorID) REFERENCES Author(AuthorID)
);

CREATE TABLE Member (
    MemberID INT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL UNIQUE,
    Phone VARCHAR(15) NOT NULL,
    Address VARCHAR(255) NOT NULL,
    JoinDate DATE NOT NULL
);

CREATE TABLE Employee2(
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Position VARCHAR(255) NOT NULL,
    HireDate DATE NOT NULL
);

CREATE TABLE Loan (
    LoanID INT PRIMARY KEY ,
    BookID INT NOT NULL,
    MemberID INT NOT NULL,
    EmployeeID INT NOT NULL,
    LoanDate DATE NOT NULL,
    ReturnDate DATE,
    DueDate DATE NOT NULL,
    CHECK (ReturnDate IS NULL OR ReturnDate >= LoanDate),
    FOREIGN KEY (BookID) REFERENCES Book(BookID),
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID),
    FOREIGN KEY (EmployeeID) REFERENCES Employee2(EmployeeID)
);

create user yash identified by orcl;

alter session set "_oracle_script" = true;

conn;

show user;

grant connect to yash;






