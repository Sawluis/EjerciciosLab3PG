class Exercises{

    companion object{
        private const val PI = Math.PI
    }

    fun main(number: Int){

        val Number = number

        when(Number){
            1 -> {
                try {
                    val Base : Int?
                    val Height : Int?

                    println("\nIngrese la base del triángulo: ")
                    Base = readLine()?.toIntOrNull()

                    println("\nIngrese la altura del triángulo: ")
                    Height = readLine()?.toIntOrNull()

                    if(Base == null || Height == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl área del triángulo es: ${calculateAreaOfTriangle(Base?:0, Height?:0)}")
                }   catch (e: Exception) {
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            2 -> {
                try{
                    val Radius : Int?

                    println("\nIngrese el radio del círculo: ")
                    Radius = readLine()?.toIntOrNull()

                    if(Radius == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl área del círculo es: ${calculateAreaOfCircle(Radius?:0)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            3 ->{
                try{
                    val SalaryByHour = 12
                    val HoursWorked : Int?
                    val DaysWorked = 5

                    println("\nIngrese las horas trabajadas: ")
                    HoursWorked = readLine()?.toIntOrNull()

                    if(HoursWorked == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl salario semanal es: ${calculateWeeklySalary(HoursWorked?:0, SalaryByHour, DaysWorked)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            4 ->{
                try{
                    val SpanishAndEnglishWords = arrayOf("Español\t\t\tIngles\n", "Hola\t\t\tHello", "Adiós\t\t\tGoodbye", "Buenos días\t\tGood Morning", "Buenas tardes\tGood Afternoon",
                        "Buenas noches\tGood Night", "Como estás?\t\tHow are you?", "Qué haces?\t\tWhat do you do?", "Como te llams?\tWhat's your name?",
                        "Dónde vives?\tWhere are you from?", "Eres casado?\tAre you married?")

                    SpanishAndEnglishWords.forEach{
                        println(it)
                    }
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            5 ->{
                try{
                    val Hour : Float?

                    println("\nIngrese la hora: ")
                    Hour = readLine()?.toFloatOrNull()

                    if(Hour == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\n${calculateDayStatus(Hour)}, La hora es: ${Hour} ${if(Hour in 0.0f..12.59f) "AM" else ""} ${if (Hour in 13.0f..23.59f || Hour==24.0f) "PM" else ""}")
                }catch(e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            6 -> {
                try{
                    val Day : Int?

                    println("\nIngrese el día: ")
                    Day = readLine()?.toIntOrNull()

                    if(Day == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl día es: ${calculateDayOfWeek(Day)}")

                }catch(e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            7 -> {
                try{
                    val SpecifiedNumbers = calculateSpecifiedIntegers()
                    SpecifiedNumbers.forEach{
                        println(it)
                    }
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            8 -> {
                try{
                    val HoursWorked : Int?
                    val DaysWorked = 5

                    println("\nIngrese las horas trabajadas: ")
                    HoursWorked = readLine()?.toIntOrNull()

                    if(HoursWorked == null || HoursWorked < 0)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl salario semanal es: $ ${calculateAWorkersWeeklySalary(HoursWorked?:0, DaysWorked,)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            9 -> {
                try{
                    val Result = calculateMultiples(5, 100, 5)
                    Result.forEach{
                        println(it)
                    }
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            10 -> {
                try{
                    var Result = calculateMultiples(160, 320, 20).reversed()

                    for(i in Result.indices){
                        println(Result[i])
                    }

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            11 -> {
                try{
                    val Number: Int?
                    var i = 1

                    println("\nIngrese un número: (Tabla de multiplicar)")
                    Number = readLine()?.toIntOrNull()

                    if(Number == null)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nTabla de multiplicar del número: $Number")

                    calculateMultiplyTable(Number).forEach{
                        println("$Number x $i = $it")
                        i++
                    }
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            12 -> {
                try{
                    val Number: Int?
                    var Chain = mutableListOf<Int>()
                    var VoidChain = arrayOf(" ")

                    println("\nIngrese hasta que numero llegara la piramide: ")
                    Number = readLine()?.toIntOrNull()

                    if(Number == null || Number <= 0)
                        throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    var TempNumber = Number

                    for(i in 1 .. Number){
                        for (k in 1 ..TempNumber) print(" ")

                        for(j in 1..i) Chain.add(j+1)

                        Chain.removeLast()
                        Chain.asReversed().forEach{
                            print("$it")
                        }
                        Chain.clear()

                        for(j in 1..i) print("$j")

                        println()
                        TempNumber--
                    }
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            13 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            14 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            15 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            16 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            17 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            18 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            19 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            20 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            21 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            22 -> {
                try{

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            else -> {
                println("Numero de ejercicio no valido")
                return
            }
        }

    }


    /*********************************************************/
    /*********************************************************/
    /****************     FUNCIONES     **********************/
    /*********************************************************/
    /*********************************************************/


    fun calculateAreaOfTriangle(base: Int, height: Int): Float {
        return (base.toFloat() * height.toFloat() / 2)
    }

    fun calculateAreaOfCircle(radius: Int): Float {
        return (Math.pow(radius.toDouble(), 2.0) * PI).toFloat()
    }

    fun calculateWeeklySalary(hoursWorked: Int, salarybyhour: Int, daysWorked: Int): Float {
        return ((hoursWorked * salarybyhour) * daysWorked).toFloat()
    }

    fun calculateDayStatus(hour: Float): String {

        if(hour in 6.0..12.59) {
            return "Buenos días"
        } else if(hour in 13.0..20.59) {
            return "Buenas tardes"
        } else if (hour in 21.0..23.59 || hour in 0.0..5.59 || hour==24.0f) {
            return "Buenas noches"
        }else{
            return "Hora no valida"
        }
    }

    fun calculateDayOfWeek(day: Int): String {
        return when(day){
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            4 -> "Jueves"
            5 -> "Viernes"
            6 -> "Sabado"
            7 -> "Domingo"
            else -> "Dia no valido"
        }
    }

    fun calculateSpecifiedIntegers(number1 : Int = 10, number2: Int = 20, number3: Int = 30): List<Int> {

        if (number1 <= number2 && number1 < number3 && number2 <= number3) {
            return listOf(number1, number2, number3)
        } else if (number2 <= number1 && number2 < number3 && number1 <= number3) {
            return listOf(number2, number1, number3)
        } else if (number3 <= number1 && number3 < number2 && number1 <= number2) {
            return listOf(number3, number1, number2)
        }else{
            return listOf(number1, number2, number3)
        }
    }

    fun calculateAWorkersWeeklySalary(hoursWorked: Int, daysWorked: Int) : Int {
        if(hoursWorked in 0..40){
            return ((hoursWorked * 12) * daysWorked)
        }else if(hoursWorked >= 41){
            return ((((hoursWorked-40)*16)+480) * daysWorked)
        }
        else{
            return 0
        }
    }

    fun calculateMultiples(startingnumber: Int, finalnumber: Int, multiple: Int): List<Int> {

        var list = mutableListOf<Int>()
        var i = startingnumber

        do{
            if(i % multiple == 0){
                 list.add(i)
            }
        }while(i++ <= finalnumber)

        return list
    }

    fun calculateMultiplyTable(number: Int): List<Int> {

        var list = mutableListOf<Int>()
        var i = 1

        do{
            list.add(number * i)
        }while(i++ < 12)

        return list
    }

}