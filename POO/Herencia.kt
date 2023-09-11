open class Felino (tipoFelino:String, cantidadOjos:Int, cantidadPatas:Int, colorPelo:String, peso:Double, imagen:String) {

   //Propiedades de la clase
   var tipoFelino:String = ""
   var cantidadOjos:Int = 0
   var cantidadPatas:Int = 0
   var colorPelo:String = ""
   var peso:Double = 0.0
   var imagen:String = ""

   init {

      this.tipoFelino = tipoFelino
      this.cantidadOjos = cantidadOjos
      this.cantidadPatas = cantidadPatas
      this.colorPelo = colorPelo
      this.peso = peso

      println("El objeto felino fue creado")
      println("El tipo de felino creado es: $tipoFelino")
      println("El tipo felino interno de la clase es: ${this.tipoFelino}")

   }


   //Metodos de la clase

   fun comer() {
      println("El felino esta comiendo")
   }

   fun correr() {
      println("El felino esta corriendo")
   }

   fun cazar() {
      println("El felino esta cazando")
   }

}


public class Gato:Felino {

    constructor(tipoFelino: String,cantidadOjos:Int,cantidadPatas:Int,colorPelo:String,peso:Double,imagen:String):super(tipoFelino, cantidadOjos, cantidadPatas, colorPelo, peso, imagen)


    var ronroneo:Boolean = true

    fun mataRatones(): Unit {
        println("Extermine a los ratones de la casa")

    }

}


fun main(args: Array<String>) {

val objetoFelino = Felino("Gato Domestico",2,4,"Gris",1.8,"https://google.com/imagenes")

    //objetoFelino.comer()

  val urlImagenFelino = objetoFelino.imagen

val objetoGato = Gato("Gato Domestico",2,4,"Gris",1.8,"https://google.com/imagenes")

  objetoGato.mataRatones()

}
