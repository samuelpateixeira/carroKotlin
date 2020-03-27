package com.example.carrokotlin

import kotlin.time.measureTime

class CarKotlin {

    //Proprieties
    //? means optional

    var brand : String? = null
    var model : String? = null
    var speed : Float? = null
    private var temperature : Float
        get() = this.temperature
        set(value){
            var newTemp : Float
            if (value > 30) { newTemp = 30f }
            else if (value < 15) { newTemp = 15f }
            else { newTemp = value }
            temperature = newTemp
        }

    //Constructors

    init{
        brand = ""
        model = ""
        speed = 0f
        //temperature = 25f
    }

    constructor(brand:String, model:String) {
        this.brand = brand
        this.model = model
        speed = 0f
        //temperature = 25f
    }

    //Functionality

    fun accelerate() {
        //!! means "I am sure it's not null" or something
        speed = speed!! + 10f;
    }

    fun brake() {
        //!! means "I am sure it's not null" or something
        if (speed!! > 0) {speed = speed!! - 10f}

    }

    override fun toString(): String {
        return "CarKotlin(brand=$brand, model=$model, speed=$speed)"
    }

}