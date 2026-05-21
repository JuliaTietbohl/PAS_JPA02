INSERT INTO editora (codigo,nome) VALUES (210,'Artmed');
INSERT INTO editora (codigo,nome) VALUES (220,'John Wiley and Sons');
INSERT INTO editora (codigo,nome) VALUES (230,'Bookman');

INSERT INTO autor (numero,nome,ano_nascimento) VALUES (1,'Maria da Silva', 1980);
INSERT INTO autor (numero,nome,ano_nascimento) VALUES (2,'Jose de Souza', 1975);
INSERT INTO autor (numero,nome,ano_nascimento) VALUES (3,'Pedro da Silva', 1990);
INSERT INTO autor (numero,nome,ano_nascimento) VALUES (4,'Joana Moura', 1985);

INSERT INTO livro (id,editora_codigo,titulo,autor_numero,ano) VALUES (110,210,'Aprendendo Java', 1, 2015);
INSERT INTO livro (id,editora_codigo,titulo,autor_numero,ano) VALUES (120,220,'Spring-Boot', 2, 2020);
INSERT INTO livro (id,editora_codigo,titulo,autor_numero,ano) VALUES (130,230,'Principios SOLID', 3, 2023);
INSERT INTO livro (id,editora_codigo,titulo,autor_numero,ano) VALUES (140,230,'Padroes de Projeto', 4, 2023);
INSERT INTO livro (id,editora_codigo,titulo,autor_numero,ano) VALUES (150,210,'Teste Unitario', 3, 2024);