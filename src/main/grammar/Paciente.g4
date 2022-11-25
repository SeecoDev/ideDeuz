grammar Paciente;

calculadora: texto;
texto: paciente*;

paciente: nombre genero talla peso edad fa;
nombre: ID;
genero: sexo=(MASCULINO | FEMENINO);
talla: NUMERO medida=(METROS|CENTIMETROS);
peso: NUMERO'kg';
edad: NUMERO' años';
fa: factor=(ACTIVO|VIGOROSO|MODERADO|LIGERO|SEDENTARIO);

MASCULINO: 'Masculino' | 'masculino';
FEMENINO: 'Femenino' | 'femenino';
ACTIVO: 'Activo' | 'activo';
VIGOROSO: 'Vigoroso' | 'vigoroso';
MODERADO: 'Moderado' | 'moderado';
LIGERO: 'Ligera' | 'ligera';
SEDENTARIO: 'Sedentario' | 'sedentario';
METROS: 'm';
CENTIMETROS: 'cm';

ID: ([A-Z][a-z]+);
NUMERO: (([0-9]*'.')?[0-9]+);
BASURA:[A-Za-z]+ -> skip;
PUNTUACION:[.:,] -> skip;
ESPACIOS: [ \t\r\n]+ -> skip;
