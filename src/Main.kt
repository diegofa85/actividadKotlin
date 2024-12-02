//TIP To <b>Run</b> code, press <shortcut actioId="Run"/> or
// click the <ico src="AllIcos.Actios.Execute"/> ico in the gutter.
fun main() {

    println("Indica el número máximo de contactos de la agenda:")
    val c: Int = readln().toInt()
    var agenda: MutableList<Contacto> = mutableListOf()
    var seguir: Boolean = true

    while(seguir) {
        println("1. Añadir contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        println("Escribe una de las opciones")

        var o: Int = readln().toInt()

        if(o == 1) {
            println("Escribe un nombre")
            val nombre: String = readln()
            println("Escribe un telefono")
            val numero: String = readln()

            if(agenda.size == 0) {
                val contacto = Contacto(nombre, numero)
                agenda.add(contacto)
                println("Se ha añadido el contacto")
            } else  {
                for (posicion in agenda) {
                    if (posicion.nombre.equals(nombre)) {
                        println("El contacto con ese nombre ya existe")
                        break
                    } else if(agenda.size >= c) {
                        println("La agenda está llena, no se pueden meter más contactos")
                        break
                    } else {
                        val contacto = Contacto(nombre, numero)
                        agenda.add(contacto)
                        println("Se ha añadido el contacto")
                        break
                    }
                }
            }
        } else if(o == 2) {
            if(agenda.isEmpty()) {
                println("No hay contactos que mostrar")
            } else {
                for(posicion in agenda) {
                    print("Nombre = ")
                    print(posicion.nombre)
                    print(", Teléfono = ")
                    println(posicion.numero)
                }
            }
        } else if(o == 3) {
            println("Escribe un nombre")
            val nombre: String = readln()
            var x: Int = 0
            for(posicion in agenda) {
                if(posicion.nombre.equals(nombre)) {
                    print("Su telefono es ")
                    println(posicion.numero)
                    x = 1
                    break
                }
            }
            if (x == 0) {
                println("No se ha encontrado al contacto")
            }
        } else if(o == 4) {
            println("Escribe un nombre")
            val nombre: String = readln()
            var x: Int = 0
            for(posicion in agenda) {
                if(posicion.nombre.equals(nombre)) {
                    println("Existe contacto")
                    x = 1
                }
            }
            if (x == 0) {
                println("No se ha encontrado al contacto")
            }
        } else if(o == 5) {
            println("Escribe un nombre")
            val nombre: String = readln()
            var i = 0
            var x = 0
            while(i < agenda.size) {
                if(agenda[i].nombre.equals(nombre)) {
                    agenda.removeAt(i)
                    println("Se ha eliminado el contacto")
                    x = 1
                }
                i++
            }
            if (x == 0) {
                println("No se ha eliminado el contacto")
            }
        } else if(o == 6) {
            print("Hay ")
            print(c - agenda.size)
            println(" contacto/s libre/s")
        } else if(o == 7) {
            if (c > agenda.size) {
                println("Aún se pueden meter contactos")
            } else {
                println("La agenda está llena")
            }
        } else if(o == 8) {
            seguir = false
        } else {
            println("Número no válido")
        }
    }
}