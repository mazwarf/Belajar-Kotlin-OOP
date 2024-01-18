package data

class Car(paramBrand: String,paramName: String,
          paramyear: Int ) {

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) :
            this(paramBrand, paramName,2020){
                println("Secondary Constructor1")
            }
    constructor(paramBrand: String) :
            this(paramBrand,""){
                println("Secondary Constructor2")
            }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramyear
}