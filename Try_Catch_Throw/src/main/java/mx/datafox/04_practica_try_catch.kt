package mx.datafox

import java.lang.Exception

fun main() {

carrito()
}

/*
 Leer de la consola un dato y convertirlo en un número
 Si es posible, multiplicarlo por 5 e imprimirlo
 Si ocurre una excepción, atraparla e imprimir un mensaje explicativo
  */

fun multiplicar() {
    println("Escribe un número")
    val stringUsuario = readLine()

    try {
        val stringUsuario2 = stringUsuario?.toInt()

        val numeroMultiplicado = stringUsuario2?.times(5)
        println("Tu número multiplicado por 5 es ${numeroMultiplicado}")

    } catch (e: Exception) {

        println("Favor de ingresar un número")
    }
}



/*
El usuario debe ingresar cuántos kilométros corrió el día de hoy
Convertir el valor en millas
Manejar cualquier excepción que pueda ocurrir
1 kilometro = 0.62 millas
 */

fun convertirAkilometros() {
    println("Escribe tus kilometros recorridos")
    val kilometros = readLine()

    try {
        val kilometrosAnumero = kilometros?.toDouble()

        val millas = kilometrosAnumero?.times(0.62)
        println("Tus millas recorridas son ${millas}")

    } catch (e: Exception) {

        println("Favor de ingresar tus kilometros recorridos")
    }
}




/*
Un cliente le dice al programa que producto quiere comprar
después le dice cuántos productos quiere
Si el precio es de 14.99
¿Cuál es el total?
Manejar cualquier excepción que pueda ocurrir
 */

fun carrito() {
    println("Escribe tu articulo seleccionado")
    var articulos = readLine()

    println("Escribe el numero de articulos requeridos")
    val numeroArticulos = readLine()

    try {
        val numeroArticulos2 = numeroArticulos?.toDouble()

        val precio = numeroArticulos2?.times(14.99)
        println("Tu total a pagar es ${precio}")

    } catch (e: Exception) {

        println("Favor de ingresar datos válidos")
    }
}


