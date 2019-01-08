package com.example.sz94n.myisp

class IspObject {

    var company: String=""
    var name: String=""
    var phone: String=""
    var latitude: Double=0.0
    var longitude: Double=0.0

    constructor(company: String, name: String, phone: String, latitude: Double, longitude: Double) {
        this.company = company
        this.name = name
        this.phone = phone
        this.latitude = latitude
        this.longitude = longitude
    }

    constructor()
}