CREATE TABLE public.usuarios (
	id int4 NOT NULL,
	username varchar(20) NOT NULL,
	password varchar(30) NOT NULL,
	tipo int2 NULL DEFAULT 0,
	CONSTRAINT usuarios_pkey PRIMARY KEY (id)
)
INSERT INTO public.usuarios (id,username,password,tipo) VALUES (
0,'jonas','jonas',0);
INSERT INTO public.usuarios (id,username,password,tipo) VALUES (
1,'arthur','arthur',1);
INSERT INTO public.usuarios (id,username,password,tipo) VALUES (
2,'beatriz','beatriz',0);
