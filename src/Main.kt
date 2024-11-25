//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var expresion = readLine()!!

    val expresionList: MutableList<Char> = mutableListOf()
    var p: Char = 'n'
    val expresionList2: MutableList<Char> = mutableListOf()

    for (posicion in expresion) {

        if (posicion.equals('(')
            || posicion.equals(')')
            || posicion.equals('[')
            || posicion.equals(']')
            || posicion.equals('{')
            || posicion.equals('}')
        ) {
            expresionList2.add(posicion)
        }
    }

    for (posicion in expresionList2.indices){
        if(expresionList2.get(posicion).equals(')')) {
            if(expresionList2.get(posicion - 1).equals('(')) {
                expresionList2.removeAt(posicion)
                expresionList2.removeAt(posicion - 1)
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }
        if(expresionList2.get(posicion).equals(']')) {
            if(expresionList2.get(posicion - 1).equals('[')) {
                expresionList2.removeAt(posicion)
                expresionList2.removeAt(posicion - 1)
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }
        if(expresionList2.get(posicion).equals('{')) {
            if(expresionList2.get(posicion - 1).equals('}')) {
                expresionList2.removeAt(posicion)
                expresionList2.removeAt(posicion - 1)
            } else {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }
    }



    /*var contador: Int = 1
    var resultado: Int = 0

    for (posicion in expresionList.indices){

        if (expresionList.get(posicion) == '(') {
            p = '('
        }

        if (expresionList.get(posicion) == '[') {
            p = '['
        }

        if (expresionList.get(posicion) == '{') {
            p = '{'
        }

        if (expresionList.get(posicion) != ')' && p.equals('(')) {
            if (expresionList.get(posicion).equals('}') || expresionList.get(posicion).equals(']')) {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }

        if (expresionList.get(posicion) != ']' && p.equals('[')) {
            if (expresionList.get(posicion).equals('}') || expresionList.get(posicion).equals(')')) {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }

        if (expresionList.get(posicion) != '}' && p.equals('{')) {
            if (expresionList.get(posicion).equals(')') || expresionList.get(posicion).equals(']')) {
                println("$expresion ¿está balanceada?")
                println("false")
                break
            }
        }
    }*/
}