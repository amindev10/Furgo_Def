import java.util.*

fun main(){
    benvinguda()
    val normal= tipusFurgo()
    println("El valor inicial de tu furgo es: ")
}


fun benvinguda(){
    println("Bienvenido/a a la aplicación de cálculo del valor de tu querida furgo Volkswagen Gran California")
    println("1. Volkswagen Gran California")
    println("2. Volkswagen Gran California Camper Full Edition")
    var tipus: Int
    do{
        tipus = llegirInt()
    } while (tipus!=1 && tipus!=2)
    return tipus==1
}

fun kmFurgo(): Long {
    println("Por favor, indica aproximadalemte los quilómetros de tu furgoneta:")
    return llegirLong()
}

fun kmNeumaticos(): Long {
    println("Por favor, indica aproximadalemte el estado de los neumaticos:")
    return llegirLong()
}