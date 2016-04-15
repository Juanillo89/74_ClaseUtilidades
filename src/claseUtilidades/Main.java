package claseUtilidades;

public class Main 
{

	public static void main(String[] args) 
	{
		String[] cadenas = {"uno", "dos", "tres", "cuatro", "cinco"};
		Utilidades.<String>alReves(cadenas);
		Utilidades.<String>muestraArray(cadenas);
		Utilidades.<String>inicializa(cadenas, "uno");
		Utilidades.<String>muestraArray(cadenas);
		Integer[] numeros = {1, 2, 3, 4, 5};
		Utilidades.<Integer>alReves(numeros);
		Utilidades.<Integer>muestraArray(numeros);
		Utilidades.<Integer>inicializa(numeros, 1);
		Utilidades.<Integer>muestraArray(numeros);
		Character[] caracteres ={'a', 'b', 'c', 'd', 'e'};
		Utilidades.<Character>alReves(caracteres);
		Utilidades.<Character>muestraArray(caracteres);
		Utilidades.<Character>inicializa(caracteres, 'a');
		Utilidades.<Character>muestraArray(caracteres);
	}

}
