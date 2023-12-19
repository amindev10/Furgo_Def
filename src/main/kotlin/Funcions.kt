import java.util.Scanner

fun calcularPreuBase(normal:Boolean): Double {
    val preu = 73490.0
    if (normal) return preu
    else return preu+20000
}

fun calcularPreuActual(normal:Boolean, kmFurgo:Long, kmNeumaticos:Long):Double{
    val valorFurgo= calcularPreuBase(normal)
    val depreciacion= kmFurgo*0.00001
    val depreciacionNeumaticos:Int = if(kmNeumaticos<5000) 0
    else if(kmNeumaticos<10000) 200
    else 300

    return valorFurgo - (valorFurgo*depreciacion)/100 - depreciacionNeumaticos
}