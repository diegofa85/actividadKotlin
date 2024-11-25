//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    for (x in 1 .. 100) {

        if (x % 3 == 0 && x % 5 == 0) {
            println("triqui")
        } else if (x % 3 == 0) {
            println("tri")
        } else if (x % 5 == 0) {
            println("qui")
        } else {
            println(x)
        }
    }
}