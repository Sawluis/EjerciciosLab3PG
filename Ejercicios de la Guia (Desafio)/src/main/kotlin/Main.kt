fun main() {

    try {
        var Number : Int = 0
        var exercise = Exercises()

        while(Number != 23 ){
            println("\n\n\n\n\n\n\n\n")
            println("Ingrese el numero del ejercicio a ejecutar (1-22) : 23->Salir")
            Number = readLine()!!.toInt()

            if(Number == 23) {
                println("Gracias por usar el programa. FIN")
            }else
                exercise.main(Number)
        }

    } catch (e: Exception) {
        println("\n\n\n\n\n\n\n\n\n\n\n")
        main()
    }
}