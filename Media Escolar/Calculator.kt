//DESATIO PRATICO - CALCULADORA DE MEDIA ESCOLAR

fun main() {
    // DECLARANDO AS MEDIAS ESCOLARES
    var nota1 = 10.0f
    var nota2 = 7.0f
    var nota3 = 8.0f

    // CALCULANDO A MEDIA ESCOLAR
    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    //Formatando média escolar
    println("A media das notas é: $media")
    println("A media das notas é: $mediaFormatada")
}

