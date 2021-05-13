--drop table [[Test]].dbo.Colors

create table [Test].dbo.Colors (
	ColorIndex		bigint IDENTITY(0,1) PRIMARY KEY,
	Color					varchar(max) not null
);

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('SQL Server');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Red');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Orange');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Yellow');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Green');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Blue');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Indigo');

INSERT INTO [Test].dbo.Colors (Color) 
VALUES ('Violet');