CREATE SCHEMA drogaria;

USE drogaria;

CREATE TABLE `funcionario` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
`salario` decimal NULL,
`cpf` varchar(25) NULL,
`endereco` varchar(255) NULL,
`telefone` varchar(255) NULL,
`comicao` decimal NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `cliente` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
`telefone` varchar(15) NULL,
`cpf` varchar(25) NULL,
`endereco` text NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `produto` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
`valor` decimal NULL,
`fabricante` int(11) NULL,
`fornecedor` int(11) NULL,
`funcionario` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `pedido` (
`id` int(11) NOT NULL,
`total` decimal NULL,
`cliente` int(11) NULL,
`funcionario` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `fabricante` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `fornecedor` (
`id` int(11) NOT NULL,
`nome` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `pedido_produto` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`id_pedido` int(11) NULL,
`id_produto` int(11) NULL,
PRIMARY KEY (`id`) 
);


ALTER TABLE `pedido` ADD CONSTRAINT `fk_lista_cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`id`);
ALTER TABLE `pedido` ADD CONSTRAINT `fk_lista_funcionario` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`id`);
ALTER TABLE `produto` ADD CONSTRAINT `fk_produto_fornecedor` FOREIGN KEY (`fornecedor`) REFERENCES `fornecedor` (`id`);
ALTER TABLE `produto` ADD CONSTRAINT `fk_produto_fabricante` FOREIGN KEY (`fabricante`) REFERENCES `fabricante` (`id`);
ALTER TABLE `produto` ADD CONSTRAINT `fk_produto_funcionario` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`id`);
ALTER TABLE `pedido_produto` ADD CONSTRAINT `pp_pedido` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id`);
ALTER TABLE `pedido_produto` ADD CONSTRAINT `pp_produto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`);

