CREATE TABLE public.notas (
	id_aluno int4 NOT NULL,
	trimestre int2 NULL DEFAULT 1,
	portugues float8 NULL DEFAULT 6.0,
	matematica float8 NULL DEFAULT 6.0,
	historia float8 NULL DEFAULT 6.0,
	geografia float8 NULL DEFAULT 6.0,
	CONSTRAINT notas_id_aluno_fkey FOREIGN KEY (id_aluno) REFERENCES public.usuarios(id)
)
INSERT INTO public.notas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,1,7.8,3.7,7,8);
INSERT INTO public.notas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,2,7.9,5,8,9);
INSERT INTO public.notas (id_aluno,trimestre,portugues,matematica,historia,geografia) VALUES (
0,3,8,7,9.5,10);
