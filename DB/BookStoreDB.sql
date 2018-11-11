CREATE TABLE customer (
  customerId int NOT NULL,
  username varchar(50) NOT NULL,
  password varchar(50) NOT NULL,
  firstName varchar(50) NOT NULL,
  lastName varchar(50) NOT NULL,
  phone varchar(10) NOT NULL,
  email varchar(50) NOT NULL,
  address varchar(200) DEFAULT NULL,
  creditLimit decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (customerId)
) ;

insert into customer(customerId,username,password,firstName,lastName,phone,email,creditLimit) values 
(103,'test','test','Carine','Schmitt','0888888888','test@gmail.com',null,21000.00);

CREATE TABLE category (
  category varchar(50) NOT NULL,
  textDescription varchar(4000) DEFAULT NULL,
  image blob,
  PRIMARY KEY (category)
) ;

CREATE TABLE book (
  isbn varchar(13) NOT NULL,
  bookName varchar(70) NOT NULL,
  author varchar(50) NOT NULL,
  publisher varchar(50) NOT NULL,
  category varchar(50) NOT NULL,
  genre varchar(50) NOT NULL,
  numOfPage int NOT NULL,
  synopsis clob NOT NULL,
  quantityInStock smallint NOT NULL,
  price decimal(10,2) NOT NULL,
  CONSTRAINT isbn PRIMARY KEY (isbn),
  FOREIGN KEY (category) REFERENCES category(category) 
) ;

CREATE TABLE orders (
  orderNo int NOT NULL,
  orderDate date NOT NULL,
  numOfBook int NOT NULL,
  shippedDate date DEFAULT NULL,
  status varchar(15) NOT NULL,
  customerId int NOT NULL,
  PRIMARY KEY (orderNo),
  CONSTRAINT orders_ibfk_1 FOREIGN KEY (customerId) REFERENCES customer (customerId)
) ;

CREATE TABLE orderdetail (
  orderNo int NOT NULL,
  isbn varchar(13) NOT NULL,
  quantity int NOT NULL,
  priceEach decimal(10,2) NOT NULL,
  orderLineNumber smallint NOT NULL,
  PRIMARY KEY (orderNo,isbn),
  CONSTRAINT orderdetails_ibfk_1 FOREIGN KEY (orderNo) REFERENCES orders (orderNo),
  CONSTRAINT orderdetails_ibfk_2 FOREIGN KEY (isbn) REFERENCES book (isbn)
) ;

CREATE TABLE shipping (
   shipNo int NOT NULL,
   shipDate date DEFAULT NULL,
   shipMethod varchar(30) NOT NULL,
   shipPrice decimal(5,2) NOT NULL,
   shipAddress varchar(100) NOT NULL,
   trackingNo varchar(20) DEFAULT NULL,
   orderNo int NOT NULL,
   CONSTRAINT shipNo PRIMARY KEY (shipNo),
   FOREIGN KEY (orderNo) REFERENCES orders (orderNo)
);

CREATE TABLE payment (
  customerId int NOT NULL,
  cardNo varchar(20) NOT NULL,
  cardType varchar(20) NOT NULL,
  securityCode int NOT NULL,
  nameOnCard varchar(50) NOT NULL,
  expiryDate date NOT NULL,
  orderNo int NOT NULL,
  amount decimal(10,2) NOT NULL,
  paymentDate date NOT NULL,
  shipNo int NOT NULL,
  CONSTRAINT cardNo PRIMARY KEY (cardNo,customerId),
  FOREIGN KEY (customerId) REFERENCES customer (customerId),
  FOREIGN KEY (orderNo) REFERENCES orders (orderNo),
  FOREIGN KEY (shipNo) REFERENCES shipping (shipNo)
) ;



