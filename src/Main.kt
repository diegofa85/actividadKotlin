//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Introduzca una palabra:")
    var nombre1 = readLine()!!
    println("Introduzca una palabra:")
    var nombre2 = readLine()!!

    val nombre1list: MutableList<Char> = mutableListOf()
    val nombre2list: MutableList<Char> = mutableListOf()

    for(letra in nombre1) {
        nombre1list.add(letra)
    }

    for(letra in nombre2) {
        nombre2list.add(letra)
    }

    var contador: Int = 1
    var resultado: Int = 0

    for (posicion in nombre1list.indices){
        if(nombre1list.get(posicion) == nombre2list.get(nombre2list.size - contador)) {
            contador = contador + 1
            resultado = resultado + 1
        }
    }

    println("¿Las palabras $nombre1 y $nombre2 son un anagrama?")

    if (resultado == nombre1list.size) {
        println("true")
    } else {
        println("false")
    }
}