//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Introduce la Expresión: ")
    var expresion = readLine()!!
    val expresionList: MutableList<Char> = mutableListOf()

    for (posicion in expresion) {
        if (posicion == '('
            || posicion == ')'
            || posicion == '['
            || posicion == ']'
            || posicion == '{'
            || posicion == '}') {
            expresionList.add(posicion)
        }
    }

    var i = 0
    while (i < expresionList.size) {
        if (expresionList[i] == ')') {
            if (i > 0 && expresionList[i - 1] == '(') {
                expresionList.removeAt(i)
                expresionList.removeAt(i - 1)
                i = i - 1
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                return
            }
        } else if (expresionList[i] == ']') {
            if (i > 0 && expresionList[i - 1] == '[') {
                expresionList.removeAt(i)
                expresionList.removeAt(i - 1)
                i = i - 1
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                return
            }
        } else if (expresionList[i] == '}') {
            if (i > 0 && expresionList[i - 1] == '{') {
                expresionList.removeAt(i)
                expresionList.removeAt(i - 1)
                i = i - 1
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                return
            }
        } else {
            i++
        }
    }

    println("$expresion ¿está balanceada?")
    if (expresionList.isEmpty()) {
        println("true")
    } else {
        println("false")
    }
}