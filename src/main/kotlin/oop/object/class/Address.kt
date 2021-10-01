package oop.`object`.`class`

class Address {

    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // Constructor Tanpa Primary Constructor tapi katanya engga recomend
    constructor(streetNameParam: String, cityNameParam: String) {
        street = streetNameParam
        city = cityNameParam
    }
    // Constructor Tanpa Primary Constructor
    constructor(streetNameParam: String, cityNameParam: String, countryNameParam: String) :
            this(streetNameParam, cityNameParam) {
                country = countryNameParam
    }

}