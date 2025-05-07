// Programa de teste com casos complexos

program TesteComplexo;  // Comentário de linha

var
  nome, idade: string;
  resultado: integer;
  valor: real;

(* Comentário de bloco
   que ocupa várias linhas
*)

begin
  nome := 'João da Silva'; // Literal simples
  idade := 25;
  resultado := idade + 10;
  valor := 3.14;

  // Literal com aspas simples duplicadas
  nome := 'It''s ok';

  (* Comentário de bloco em linha única *)
  if resultado > 30 then
    resultado := resultado - 1
  else
    resultado := resultado + 1;

  // Erros léxicos abaixo
  @invalido := 123;
  valor# := 456.78;
  123abc := 10;
  nome! := 'Erro';

end.