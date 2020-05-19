/*
Las inline function se usan para aumentar la velocidad del programa
Sin embargo se deben usar para bloques de codigo pequeño y que se repita muchas veces
Lo anterior porque la diferencia entre una funcion normal y una inlineFunction
es que la funcion normal cuando se llama se hace referencia a ella desde
varios lugares, en cambio la inlineFunction lo que hace es que en el lugar
donde es invocada inserta el bloque de codigo que contiene, lo cual hace que el codigo al momento
de la compilación se extienda demasiado es decir mas lineas y mas complejo

*/

inline fun String.filter(predicate: (Char) -> Boolean): String{
    return filterTo(StringBuilder(), predicate).toString()
}

fun main(args: Array<String>) {
    val a: String = "Hola".filter {
         it == 'H'
    }
    println(a)
}