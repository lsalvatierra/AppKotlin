package pe.edu.idat.appkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var btn = btnCalcular as Button
        btn.setOnClickListener(View.OnClickListener {
            var numero1 : Int?
            var numero2 : Int?
            numero1 = etNumero1.text.toString().toInt()
            numero2 = etnumero2.text.toString().toInt()
            var resultado = Suma(numero1, numero2)
            tvResultado.text = resultado.toString()
        })
    }

    private fun ValoresConstantes() {
        //Son variables que no se pueden
        //modificar luego de su creación.
        val nombre  = "Luis"
        //val name : String = "Victor"
        //name = "Victor Manuel"   Error!
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

    }

    private fun ValoresVariables() {
        //Son variables que si se pueden
        //modificar luego de su creación.
        var nombre: String
        nombre = "Victor Bolinches"
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()

    }

    private fun ValoresNulos() {
        //Son variables que pueden ser nulas
        //var lastNameNullable: String   Error!
        //lastNameNullable = null        Error!
        var nombrenulo: String?
        nombrenulo = null
        Toast.makeText(this, nombrenulo, Toast.LENGTH_SHORT).show()
        nombrenulo = "Victor Manuel Bolinches"
        Toast.makeText(this, nombrenulo, Toast.LENGTH_SHORT).show()
    }

    fun Suma(a: Int, b: Int): Int {
        return a + b;
    }


}
