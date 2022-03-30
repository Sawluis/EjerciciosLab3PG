import classes.*

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

                    println("1.Cree una función en Kotlin para calcular el área de un triángulo, la función debe retornar el área " +
                            "\ny recibir como parámetro la base y la altura. Impleméntelo usando variables de tipo val " +
                            "\ny funciones de conversión de entero a float.")

                    println("\nIngrese la base del triángulo: ")
                    Base = readLine()?.toIntOrNull()

                    println("\nIngrese la altura del triángulo: ")
                    Height = readLine()?.toIntOrNull()

                    if(Base == null || Height == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl área del triángulo es: ${calculateAreaOfTriangle(Base, Height)}")
                }   catch (e: Exception) {
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            2 -> {
                try{
                    val Radius : Int?

                    println("2.Cree una función en Kotlin para calcular el área de un círculo, la función debe recibir como parámetro el radio " +
                            "\ny retornar el área calculada, el valor de PI debe estar definido como una constante. Y el parámetro debe solicitarse al usuario," +
                            "\nademás debe validarse el nulo con el operador elvis . Abajo un ejemplo de cómo solicitar un parámetro.")

                    println("\nIngrese el radio del círculo: ")
                    Radius = readLine()?.toIntOrNull()

                    if(Radius == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl área del círculo es: ${calculateAreaOfCircle(Radius)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            3 ->{
                try{
                    val SalaryByHour = 12
                    val HoursWorked : Int?

                    println("3.Escribe un programa que calcule el salario semanal de un colaborador en base a las horas trabajadas, a razón de \$12 la hora." +
                            "\nEn la medida de lo posible haga uso de los métodos asociados a la variable.")

                    println("\nIngrese las horas trabajadas: ")
                    HoursWorked = readLine()?.toIntOrNull()

                    if(HoursWorked == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl salario semanal es: ${calculateWeeklySalary(HoursWorked, SalaryByHour)}")
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

                    println("4.Haciendo uso de los Strings y los caracteres de tabulación escriba un programa que muestre en pantalla 10 palabras en inglés con su respectiva traducción en español," +
                            "\ndeben estar distribuidas en dos columnas y alineadas a la izquierda. Pruebe con los caracteres de tabulación")

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

                    println("5.Haciendo uso de las sentencias de control condicionales escriba un programa que pida una hora por teclado y que muestre como resultado Buenos días," +
                            "\nBuenas tardes o Buenas noches, según la hora. Tome en cuenta que de 06 a 12 es mañana, de las 13 a las 20 es tarde y fuera de los rangos anteriores, noche.")

                    println("\nIngrese la hora: ")
                    Hour = readLine()?.toFloatOrNull()

                    if(Hour == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\n${calculateDayStatus(Hour)}, La hora es: ${Hour} ${if(Hour in 0.0f..12.59f) "AM" else ""} ${if (Hour in 13.0f..23.59f || Hour==24.0f) "PM" else ""}")
                }catch(e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            6 -> {
                try{
                    val Day : Int?

                    println("6.Escribe un programa que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.\n")

                    println("\nIngrese el día: ")
                    Day = readLine()?.toIntOrNull()

                    if(Day == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl día es: ${calculateDayOfWeek(Day)}")

                }catch(e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            7 -> {
                try{
                    val SpecifiedNumbers = calculateSpecifiedIntegers(20, 30, 10)

                    println("7.Escribe un programa que ordene tres números enteros especificados como parámetro a la función\n")

                    println("Los numeros especificados son (20, 30, 10)")

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

                    println("8.Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo)" +
                            "\nse pagan a \$12 dólares la hora. A partir de la hora 41, se pagan a 16. El programa debe recibir como parámetro el total de horas trabajadas a la semana.\n")

                    println("\nIngrese las horas trabajadas: ")
                    HoursWorked = readLine()?.toIntOrNull()

                    if(HoursWorked == null || HoursWorked < 0) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nEl salario semanal es: $ ${calculateAWorkersWeeklySalary(HoursWorked, DaysWorked,)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            9 -> {
                try{
                    val Result = calculateMultiples(5, 100, 5)

                    println("9.Muestra los números múltiplos de 5, de 5 a 100 utilizando un bucle do-while.\n")

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
                    /*var Result = calculateMultiples(160, 320, 20).reversed()*/

                    println("10.Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.\n")

                    /*for(i in Result.indices){
                        println(Result[i])
                    }*/

                    for(i in 320 downTo 160){
                        if(i % 20 == 0) println(i)
                    }

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            11 -> {
                try{
                    val Number1: Int?
                    var i = 1

                    println("11.Muestra la tabla de multiplicar de un número especificado como parámetro\n")

                    println("\nIngrese un número: (Tabla de multiplicar)")
                    Number1 = readLine()?.toIntOrNull()

                    if(Number1 == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("\nTabla de multiplicar del número: $Number1")

                    calculateMultiplyTable(Number1).forEach{
                        println("$Number1 x $i = $it")
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

                    println("12.Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la figura\n")

                    println("\nIngrese hasta que numero llegara la piramide: ")
                    Number = readLine()?.toIntOrNull()

                    if(Number == null || Number <= 0) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

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
                    val X = 144f
                    val Y = 999f

                    println("13.Escribe un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999 respectivamente." +
                            "\nA continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y " +
                            "\nla multiplicación haciendo uso de los métodos de cada variable.\n")

                    println("X = $X")
                    println("Y = $Y")
                    println("X + Y = ${X.plus(Y)}")
                    println("X - Y = ${X.minus(Y)},\t Y - X = ${Y.minus(X)}")
                    println("X * Y = ${X.times(Y)}")
                    println("X / Y = ${X.div(Y)},\t Y / X = ${Y.div(X)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            14 -> {
                try{
                    val Name = "Juan Carlos Pérez"
                    val Address = "Ciudad Sandino 123"
                    val PhoneNumber = "85859090 - Tigo"

                    println("14.Crea las variables nombre, dirección y teléfono y asígnale los valores correspondientes. " +
                            "\nMuestra los valores de esas variables de tal forma que el resultado del programa sea visible en una sola línea\n")

                    println(calculatedNameAdressPhoneNumber(Name, Address, PhoneNumber))
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            15 -> {
                try{
                    val ArrayOfNumbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

                    println("15.Escribe un programa que calcule el promedio y la suma de un arreglo de 10 números enteros.\n")

                    println("Valores del array: $ArrayOfNumbers")
                    println("(Promedio, Suma) : ${calculateAverageAndSum(ArrayOfNumbers)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            16 -> {
                try{
                    val Number1 = 10
                    val Number2 = 5
                    val Number3 = 20

                    val Funtion = { fun(number1: Int, number2: Int, number3: Int): Triple<Int, Float, Int> {
                                        val Sum = number1.plus(number2).plus(number3)
                                        val Average = Sum.toFloat().div(3)
                                        val Multiplication = number1.times(number2).times(number3)

                                        return Triple(Sum, Average, Multiplication)
                                }
                    }

                    println("16.Haciendo uso de lambdas, escriba una función que calcule la suma, el producto y el promedio de tres números.\n")

                    println("Suma, Promedio, Multiplicacion -> ${Funtion.invoke()(Number1, Number2, Number3)}")

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            17 -> {
                try{
                    val Number1 : Int?
                    val Number2 : Int?

                    println("17.Escriba un programa que determine si dos números son amigos. Dos números enteros positivos se consideran amigos si " +
                            "\nla suma de los divisores de uno es igual al otro número y viceversa. Por ejemplo, los números 220 y 284 son amigos. " +
                            "\nLos divisores del número 220 son: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y suman 284. Los divisores de 284 son: 1, 2, 4, 71 y 142, que suman 220.\n")

                    println("Ingrese el primer número: ")
                    Number1 = readLine()?.toIntOrNull()

                    println("Ingrese el segundo número: ")
                    Number2 = readLine()?.toIntOrNull()

                    if(Number1 == null || Number2 == null) throw Exception("\n\n\n\n\n\n\n\n\n\n\n")

                    println("Los numeros $Number1 y $Number2 ${calculateNumbersFriend(Number1, Number2)}")
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            18 -> {
                try{
                    val ListOfNumbers = arrayOf(1, 2, 2, 4, 5, 6, 7, 7, 9, 10)

                    println("18.Escriba un programa que, dado un array de números enteros," +
                            "\ndetermine cuáles son los elementos que se encuentran duplicados. Ejemplo de la salida esperada.\n")

                    println("Valores del array: ${ListOfNumbers.contentToString()}")
                    println("Elementos duplicados : ${calculateDuplicateNumbers(ListOfNumbers)}")

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            19 -> {
                try{
                    val Person = Person("Luis", "Joseph", "001-0000-0000L", "Masculino", "01/05/2004")
                    Person.run {}
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            20 -> {
                try{
                    println("20.Cree una clase abstracta denominada Figura, la cual deberá tener 4 subclases denominadas: Triangulo, Cuadrado, Circulo y Rectángulo." +
                            "\nLa clase Figura debe tener la propiedad Nombre, la cual debe asignarse a través de las subclases, y el método área (), éste será abstracto y" +
                            "\nsu implementación deberá hacerse desde las clases hijas, con la siguiente especificación:\n" +
                            "a.Área del triángulo = base * altura /2\n" +
                            "b.Área del circulo = PI * r al cuadrado\n" +
                            "c.Área del rectángulo = Base * altura\n" +
                            "d.Área del cuadrado = lado * lado\n" +
                            "Mande a imprimir los valores, especificando como datos de entrada lo especificado debajo.\n")

                    val Circle = Circle("Circle", 2f)
                    println(Circle.Name)
                    println(Circle.Area())

                    val Rectangle = Rectangle("Rectangle", 1f, 2f)
                    println("\n" + Rectangle.Name)
                    println(Rectangle.Area())

                    val Square = Square("Square", 3f)
                    println("\n" + Square.Name)
                    println(Square.Area())

                    val Triangle = Triangle("Triangle", 3f, 5f)
                    println("\n" + Triangle.Name)
                    println(Triangle.Area())

                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            21 -> {
                try{
                    val Insect = Insect(30f, 2, 6, "Rojo, amarillo, azul, verde, etc.", 2, "Lepidoptera")
                    println("1.\tCreen una clase llamada Insecto, que cuente con los siguientes atributos o características: longitud, #alas, #patas, color, #antenas, tipoinsecto. " +
                            "\nEl primer atributo debe ser un float, el color y el tipoinsecto de tipo string y el resto valores enteros." +
                            "\nEscriba las líneas de código que permitan especificar valores a la clase de manera privada e imprimir dichos valores en pantalla.")
                    println("Mariposa\n")
                    Insect.ShowInsect()
                }catch (e: Exception){
                    println("\n\n\n\n\n\n\n\n\n\n\n")
                    main(Number)
                }
            }
            22 -> {
                try{
                    val Teacher1 = Class("Glenda Barrios", "Programacion Grafica", 12, 13)
                    val Teacher2 = Class("Alfonzo Boza", "Teoria de la computacion", 11, 5)

                    //val (teachername, subject, labs, conferences) = Teacher2

                    println("22.Cree una clase de tipo DataClass denominada Clase, los datos que requiere manejar deben ser: profesor, materia, laboratorios, Conferencias. " +
                            "\nRealice las pruebas necesarias que le permitan asignarle valores e imprimir los resultados en pantalla.\n")

                    println("El/La ${Teacher1.teachername} da clases de ${Teacher1.subject}, vamos ${Teacher1.labs} veces al laboratorio y recibimos ${Teacher1.conferences} conferencias en el semestre")
                    println("El/La ${Teacher2.teachername} da clases de ${Teacher2.subject}, vamos ${Teacher2.labs} veces al laboratorio y recibimos ${Teacher2.conferences} conferencias en el semestre")

                    println("\n${Teacher1.getInfo()}")
                    println("\n${Teacher2.getInfo()}")

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

    fun calculateWeeklySalary(hoursWorked: Int, salarybyhour: Int): Float {
        return ((hoursWorked * salarybyhour).toFloat())
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

    fun calculateSpecifiedIntegers(number1 : Int = 20, number2: Int = 30, number3: Int = 10): List<Int> {

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

    fun calculatedNameAdressPhoneNumber(name: String, address: String, phonenumber: String): String {
        return "Nombre: $name\tDireccion: $address\tTelefono: $phonenumber"
    }

    fun calculateAverageAndSum(list: List<Int>): Pair<Float, Int> {

        var sum = 0
        var average : Float?

        for(i in list){
            sum += i
        }

        average = sum.toFloat() / list.size

        return Pair(average, sum)
    }

    fun calculateNumbersFriend(number1: Int, number2: Int): String {

        var sum = 0

        for(i in 1 until number1){
            if(number1%i == 0) sum += i
        }

        if(sum == number2){
            sum = 0
            for(i in 1 until number2){
                if(number2%i == 0) sum += i
            }

            if(sum == number1) {
                return "son amigos"
            }else{
                return "no son amigos"
            }
        }else{
            return "no son amigos"
        }
    }

    fun calculateDuplicateNumbers(list: Array<Int>): List<Int> {

        var listofduplicateitems = mutableListOf<Int>()

        for(i in list){
            if(list.count { it == i } > 1){
                if(!listofduplicateitems.contains(i)){
                    listofduplicateitems.add(i)
                }else continue
            }
        }
        return listofduplicateitems
    }
}