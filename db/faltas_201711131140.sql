CREATE TABLE public.faltas (
	id_aluno int4 NOT NULL,
	trimestre int2 NULL DEFAULT 1,
	portugues int4 NULL DEFAULT 0,
	matematica int4 NULL DEFAULT 0,
	historia int4 NULL DEFAULT 0,
	geografia int4 NULL DEFAULT 0,
	CONSTRAINT faltas_id_aluno_fkey FOREIGN KEY (id_aluno) REFERENCES public.usuarios(id)
)
INSERT INTO public.faltas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,1,5,8,5,5);
INSERT INTO public.faltas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,2,9,5,6,4);
INSERT INTO public.faltas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,3,2,5,5,6);
INSERT INTO public.faltas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,4,1,10,3,5);
