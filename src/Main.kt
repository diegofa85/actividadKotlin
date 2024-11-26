//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val acciones = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    var pista: String = "_|_|_"
    var pistaA: MutableList<Char> = mutableListOf()

    for (posicion in pista) {
        pistaA.add(posicion)
    }

    var r: Boolean = true
    var i: Int = 0
    var a: Int = 0

    if (acciones.size < pistaA.size) {
        val s: Int = pistaA.size - acciones.size
        a = pistaA.size - s
        while(a < pistaA.size) {
            pistaA.set(a,'?');
            a++
            r = false
        }
    }

    if (pistaA.size < acciones.size) {
        val s: Int = acciones.size - pistaA.size
        a = acciones.size - s
        while(a < acciones.size) {
            pistaA.set(a,'?');
            a++
            r = false
        }
    }

    while (i < acciones.size) {
        if (acciones[i].equals("correr") && pistaA[i] == '_') {

        } else if (acciones[i].equals("correr") && pistaA[i] == '|') {
            pistaA.set(i,'/');
            r = false
        } else if (acciones[i].equals("saltar") && pistaA[i] == '_') {
            pistaA.set(i,'x');
            r = false
        } else if (acciones[i].equals("saltar") && pistaA[i] == '|') {

        } else {
            pistaA.set(i,'?');
            r = false
        }
        i++
    }

    for (posicion in pistaA.indices){
        print(pistaA.get(posicion))
    }
    println(" ")
    println(r)
}