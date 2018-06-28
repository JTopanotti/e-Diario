CREATE TABLE public.alunos (
	id_usuario int4 NULL,
	nome varchar(20) NULL DEFAULT '.'::character varying,
	endereco varchar(30) NULL DEFAULT '.'::character varying,
	numero int4 NULL DEFAULT 0,
	bairro varchar(20) NULL DEFAULT '.'::character varying,
	observacao varchar(200) NULL DEFAULT 'Sem observacoes'::character varying,
	CONSTRAINT alunos_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES public.usuarios(id)
);
INSERT INTO public.alunos (id_usuario,nome,endereco,numero,bairro,observacao) VALUES (
0,'Jonas de Souza','R. Presidente Prudente',40,'Sao Luiz','Sem observacoes');
INSERT INTO public.alunos (id_usuario,nome,endereco,numero,bairro,observacao) VALUES (
2,'Beatriz Carvalho','Av. Brasília',13,'Centro','Atrasos repetitivos');
