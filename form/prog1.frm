Symbols a,b,c,d;
Local F = (a+b+c+1)^6;
id a = -b+d-1;
Print "%t";
Print;
.end

Symbols a,b,c,d;
On HighFirst;
Local F = a+b+c+d;
.sort

id a = (a+b)^2;
id c = b+d;
id b = b+1;
Print;
.end


Symbols a b c d e f g;
On HighFirst;
Local F = (a+b+c+d)^20;

id d = 1-a-b;
Print +s;
.end



Symbols a b;
Local F = (a+b)^3;
Print;
.end
