package cl.stgoneira.learning.android.s02perimetrofiguras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import cl.stgoneira.learning.android.s02perimetrofiguras.figuras.Triangulo

class PerimetroTrianguloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perimetro_triangulo)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val resultado = findViewById<TextView>(R.id.tvResultado)

            val ladoA = findViewById<EditText>(R.id.etLadoA)
            val ladoB = findViewById<EditText>(R.id.etLadoB)
            val ladoC = findViewById<EditText>(R.id.etLadoC)

            val a = ladoA.text.toString().toIntOrNull() ?: 0
            val b = ladoB.text.toString().toIntOrNull() ?: 0
            val c = ladoC.text.toString().toIntOrNull() ?: 0

            val triangulo = Triangulo(a, b, c)
            val perimetro = triangulo.calcularPerimetro()
            resultado.text = "El perímetro es ${perimetro}"
        }
    }

    fun volverAtras(view:View) {
        finish()
    }
}