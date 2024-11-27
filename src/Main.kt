//TIP To <b>Run</b> code, press <shortcut actioId="Run"/> or
// click the <ico src="AllIcos.Actios.Execute"/> ico in the gutter.
fun main() {

    var tablero = arrayOf(
    arrayOf("X", "O", "X"),
    arrayOf("X", "X", "O"),
    arrayOf("X", "X", "X")
    )

    var x: Int = 0
    var o: Int = 0

    var juego: MutableList<String> = mutableListOf()

    for (i in tablero) {
        for (j in i) {
            juego.add(j);
            if (j.equals("X")) {
                x = x + 1
            } else if (j.equals("O")) {
                o = o + 1
            }
        }
    }

    if ((x - o) >= 2) {
        println("NULL")
    } else if ((o - x) >= 2) {
        println("NULL")
    } else {
        if(juego[0].equals(juego[1]) && juego[0].equals(juego[2]) && !juego[0].equals("")) {
            println(juego[0])
        } else if(juego[0].equals(juego[4]) && juego[0].equals(juego[8]) && !juego[0].equals("")) {
            println(juego[0])
        } else if(juego[0].equals(juego[3]) && juego[0].equals(juego[6]) && !juego[0].equals("")) {
            println(juego[0])
        } else if(juego[1].equals(juego[4]) && juego[1].equals(juego[7]) && !juego[1].equals("")) {
            println(juego[1])
        } else if(juego[2].equals(juego[4]) && juego[1].equals(juego[6]) && !juego[2].equals("")) {
            println(juego[2])
        } else if(juego[3].equals(juego[4]) && juego[3].equals(juego[5]) && !juego[3].equals("")) {
            println(juego[3])
        } else if(juego[6].equals(juego[7]) && juego[6].equals(juego[8]) && !juego[6].equals("")) {
            println(juego[6])
        } else {
            println("EMPATE")
        }
    }
}