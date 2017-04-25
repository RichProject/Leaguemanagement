create database euro;

create table DoiBong (
	id bigint not null auto_increment,
	maDoi varchar(10) not null,
	tenDoi varchar(50) not null,
    primary key (id)
);

create table TranDau (
	id bigint not null auto_increment,
	maTranDau varchar(5) not null,
	doiA varchar(20) not null,
	doiB varchar(20) not null,
	ngayThiDau date not null,
	gioThiDau time not null,
	tySo varchar(10) not null,
	primary key (id)
);

create table BangDau (
	id bigint not null auto_increment,
	maBangDau varchar(5) not null,
	tenDoi varchar(50) not null,
	soTran int not null,
	soTranThang int not null,
	soTranHoa int not null,
	soTranThua int not null,
	banThang int not null,
	banThua int not null,
	hieuSo int not null,
	diemSo int not null,
	tenDoi_id int not null,
	FOREIGN KEY (tenDoi_id) REFERENCES DoiBong(id),
	primary key (id)
);

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (1, 'Pol', 'Poland');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (2, 'Gree', 'Greece');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (3, 'Russ', 'Russia');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (4, 'Czech', 'Czech Republic');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (5, 'Neth', 'Netherlands');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (6, 'Den', 'Denmark');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (7, 'Ger', 'Germany');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (8, 'Port', 'Portugal');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (9, 'Spa', 'Spain');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (10, 'Itl', 'Italy');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (11, 'Ireland', 'Republic of Ireland');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (12, 'Cro', 'Croatia');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (13, 'Ukr', 'Ukraine');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (14, 'Swe', 'Sweden');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (15, 'Eng', 'England');

INSERT INTO DoiBong ( id, maDoi, tenDoi) 
VALUES (16, 'Fra', 'France');
