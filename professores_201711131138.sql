CREATE TABLE public.professores (
	id_usuario int4 NULL,
	nome varchar(60) NULL DEFAULT '.'::character varying,
	CONSTRAINT professores_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES public.usuarios(id)
)
INSERT INTO public.professores (id_usuario,nome) VALUES (
1,'Arthur Neto');
