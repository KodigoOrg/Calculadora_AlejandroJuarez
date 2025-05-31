# Calculadora_AlejandroJuarez
Una calculadora desarrollada en Java que implementa operaciones matemáticas básicas con una interfaz de consola con la que el usuario pueda interactuar.

# Operaciones Matemáticas
1. Suma: Operaciones de suma de números.
2. Resta: Operaciones de resta de números.
3. Multiplicación: Operaciones de multiplicación de números.
4. División: Operaciones de división de números.
5. Potencia: Cálculo de potencias (x^y).
6. Raíz Cuadrada: Cálculo de raíces cuadradas.

# Tecnologías Utilizadas
Java: JDK 21
IDE Compatible: IntelliJ IDEA

# Menú de Consola
El programa ofrece el siguiente menú por el cual el usuario puede escoger una de la diferentes opciones:

--CALCULADORA JAVA--
1. Suma
2. Resta
3. Multiplicacion
4. Division
5. Potencia
6. Raiz cuadrada
7. Salir
Seleccione una operacion:

# Manejo de Errores
* División por cero
* Raíz cuadrada de números negativos
* Entrada de datos inválidos

# Ejecución de Operaciones Básicas
Esto se realiza en la clase Operacion:

--Suma
public double suma(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }
    
--Resta
public double resta(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }
    
--Multiplicación
public double multiplicacion(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }

--División
public double division(Numero a, Numero b) throws ArithmeticException {
        if (b.getValor() == 0) {
            throw new ArithmeticException("Division por cero no permitida");
        }
        return a.getValor() / b.getValor();
    }

--Potencia
public double potencia(Numero base, Numero exponente) {
        return Math.pow(base.getValor(), exponente.getValor());
    }

--Raíz Cuadrada
public double raizCuadrada(Numero numero) throws ArithmeticException {
        if (numero.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(numero.getValor());
    }

# Autor
Nombre: Alejandro Ernesto Juárez Argumedo
LinkedIn: www.linkedin.com/in/alejandro-juárez01
GitHub: https://github.com/ajuarez011
