program SomaSimples;

var
  x, y, resultado: integer;

begin
  x := 10;
  y := 20;
  resultado := x + y;

  if resultado > 20 then
    resultado := resultado - 5
  else
    resultado := resultado + 5;

end.
