import java.util.*

fun readInt(pMessage : String, pMin : Int, pMax : Int) : Int{
    var valor : Int = 0
    val scan : Scanner = Scanner(System.`in`)
    var correctType : Boolean = false

    do{
        println(pMessage)
        correctType = scan.hasNextInt()

        if(!correctType){
            println("ERROR")
        }else{
            valor = scan.nextInt()

            if(valor < pMin || valor > pMax){
                println("ERROR")
                correctType = false
            }
        }


        scan.nextLine()

    }while(!correctType)
    return valor
}

fun readDouble(pMessage: String, pMin: Double, pMax: Double): Double {
    var valor: Double = 0.0
    val scan: Scanner = Scanner(System.`in`)
    var correctType: Boolean

    do {
        println(pMessage)
        correctType = scan.hasNextDouble()

        if (!correctType) {
            println("ERROR")
        } else {
            valor = scan.nextDouble()

            if (valor < pMin || valor > pMax) {
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    } while (!correctType)

    return valor
}




fun readLong(pMessage: String, pMin: Long, pMax: Long): Long {
    var valor: Long = 0
    val scan: Scanner = Scanner(System.`in`)
    var correctType: Boolean

    do {
        println(pMessage)
        correctType = scan.hasNextLong()

        if (!correctType) {
            println("ERROR")
        } else {
            valor = scan.nextLong()

            if (valor < pMin || valor > pMax) {
                println("ERROR")
                correctType = false
            }
        }

        scan.nextLine()

    } while (!correctType)

    return valor
}