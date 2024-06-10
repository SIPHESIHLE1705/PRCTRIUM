package com.example.practicumassesment2


import android.annotation.SuppressLint
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



}import ...
class MainActivity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen2)
        val txtDay:EditText=findViewById(R.id.txtDay)
        val txtMinTemperature=findViewById(R.id.txtMinTemperature)
        val txtMaxTemperature=findViewById(R.id.txtMaxTemperature)
        val btnDisplay: Button =findViewById(R.id.btnDisplay)
        val btnClear:Button =findViewById(R.id.btnClear)
        val btnNext:Button=findViewById(R.id.btnNext)
        val btnCalculateaverage: Button =findViewById(R.id.btnCalculateAverage)


        val days=arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","saturday","Sunday")
        val mintemperture = arrayOf(12,15,20,9,12,10,10)
        val maxtemperture =arrayOf(25,29,31,12,15,18,16)
        val weatherConditions=arrayOf("Sunny","Sunny","Sunny","Raining,","Cold","Raining","Cold")
        btnDisplay.setOnClickListener {
            / Calculate total and average screen time
            var totalScreenTime = 0
            val stringBuilder = StringBuilder()
            for (i in min.indices) {
                val dailyTotal = MinTemperture[i] + {MaxTemperture[i]
                stringBuilder.append("Day ${i + 1}: MinTemperture = ${MAX[i]} min, MaxTemperture = ${MaxTemperture[i]} mins, Total = $dailyTotal mins\n")
                totalTempeture += dailyTotal
            }
            val averageTemperature = totalTemperture / minTemperature.size

            stringBuilder.append("\nAverage Temperature Over a Week: $averageTemperature mins")

            textViewTemperature.text = stringBuilder.toString()

            buttonBack.setOnClickListener {
                finish()


                }
            }


        }

