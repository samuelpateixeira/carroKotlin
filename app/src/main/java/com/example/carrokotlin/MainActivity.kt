package com.example.carrokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var cars = ArrayList<CarKotlin>()

        //add numbers
        cars.add(CarKotlin("Tesla", "S"))
        cars.add(CarKotlin("Hyundai", "Kona Eletric"))
        cars.add(CarKotlin("Nissan", "Leaf"))
        cars.add(CarKotlin("Tesla", "3"))
        cars.add(CarKotlin("Hyundai", "Ionic Eletric"))
        cars.add(CarKotlin("Jaguar", "I-Pace"))
        cars.add(CarKotlin("Tesla", "X"))
        cars.add(CarKotlin("Renault", "Zoe"))
        cars.add(CarKotlin("BMW", "i3"))
        cars.add(CarKotlin("Tesla", "Cybertruck"))
        cars.add(CarKotlin("Audi", "e-tron"))
        cars.add(CarKotlin("Tesla", "Roadster"))
        var car : CarKotlin = cars[0]
        var carPos = 0;


        // Text boxes
        //textWrapper
        val tvWrapView = LinearLayout(this)
        tvWrapView.orientation = LinearLayout.VERTICAL

        val brandTv = TextView(this)
        val modelTv = TextView(this)
        val speedTv = TextView(this)

        tvWrapView.addView(brandTv)
        tvWrapView.addView(modelTv)
        tvWrapView.addView(speedTv)


        fun refreshText() {
            brandTv.text = "Brand: " + car.brand
            modelTv.text = "Model: " + car.model
            speedTv.text = "Speed: " + car.speed
        }

        refreshText()

        //accelerate
        val accelerateBtn = Button(this)
        accelerateBtn.text = "accelerate"
        accelerateBtn.setOnClickListener {
            car.accelerate()
            refreshText()
        }

        //brake
        val brakeBtn = Button(this)
        brakeBtn.text = "Brake"
        brakeBtn.setOnClickListener {
            car.brake()
            refreshText()
        }

        //change car
        val changeCar = Button(this)
        changeCar.text = "Change Car"
        changeCar.setOnClickListener {
            if (carPos < (cars.size - 1)) {
                carPos++
            } else {
                carPos = 0
            }
            car = cars[carPos]
            refreshText()
        }




        //accelerate
        val accelerateBtn: Button = findViewById(R.id.accelerate)
        accelerateBtn.setOnClickListener {
            c3.accelerate()
            tv.setText(c3.toString())
        }

        //brake
        val brakeBtn: Button = findViewById(R.id.brake)
        brakeBtn.setOnClickListener {
            c3.brake()
            tv.setText(c3.toString())
        }



        //cenas da aula

        val textViewHello = TextView(this)
        textViewHello.text = "Olá mundo"
        textViewHello.textSize = 32f

        textViewHello.setTextColor(getColor(R.color.colorPrimary))

        val btnWrapView = LinearLayout(this)

        btnWrapView.orientation = LinearLayout.HORIZONTAL

        btnWrapView.addView(brakeBtn)
        btnWrapView.addView(accelerateBtn)
        btnWrapView.addView(changeCar)

        val parentView = LinearLayout(this)
        parentView.orientation = LinearLayout.VERTICAL
        parentView.addView(btnWrapView)
        parentView.addView(tvWrapView)

        setContentView(parentView)



    }
}
