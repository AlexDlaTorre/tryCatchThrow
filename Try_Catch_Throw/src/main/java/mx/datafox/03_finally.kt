package mx.datafox

import java.lang.Exception

fun main() {
    val noNumeros = false
    val noValor = false
    var prueba = readLine()
    try {
        println(prueba?.toInt())
    } catch (e: Exception) {
        println("Ha ocurrido un error: \n ${ e.localizedMessage }")
        //if(e.cause == "For input string : /"kpkñ/") then {
        //cambiando noNumeros y noValor a true
        //que cocurra si sigue el error
        //casi no se usa, más usual dejar en catch y dejar un toast
    } finally {
        println("Y aquí continuamos")
        if(noNumeros){
            println("Favor de ingresar un número")
        }else{
            println("Favor de no dejar en blanco")
            //ruta alterna a seguir
            ruta2()
        }
    }
}
//camino a seguir después del error
fun ruta1(){

}

fun ruta2(){

}