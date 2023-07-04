package cl.stgoneira.learning.android.s02perimetrofiguras.figuras

abstract class Figura {
    abstract fun calcularPerimetro(): Int
}
class Rectangulo(val base:Int, val altura:Int) : Figura() {
    override fun calcularPerimetro(): Int = (base + altura) * 2
}
class Triangulo(val ladoA:Int, val ladoB:Int, val ladoC:Int) : Figura() {
    override fun calcularPerimetro(): Int = ladoA + ladoB + ladoC
}