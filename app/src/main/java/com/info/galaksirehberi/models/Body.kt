package com.info.galaksirehberi.models


import com.google.gson.annotations.SerializedName

data class Body(
    val alternativeName: String,
    val aphelion: String,
    val argPeriapsis: Double,
    val aroundPlanet: AroundPlanet,
    val avgTemp: Int,
    val axialTilt: Double,
    val density: Double,
    val dimension: String,
    val discoveredBy: String,
    val discoveryDate: String,
    val eccentricity: Double,
    val englishName: String,
    val equaRadius: Double,
    val escape: Double,
    val flattening: Double,
    val gravity: Double,
    val id: String,
    val inclination: Double,
    val isPlanet: Boolean,
    val longAscNode: Double,
    val mainAnomaly: Double,
    val mass: Mass,
    val meanRadius: Double,
    val moons: Any,
    val name: String,
    val perihelion: String,
    val polarRadius: Double,
    val rel: String,
    val semimajorAxis: String,
    val sideralOrbit: Double,
    val sideralRotation: Double,
    val vol: Vol
)