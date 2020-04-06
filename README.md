# Retrofit01

## Overview
Use Retrofit, moshi for get API

## API
http://5e85eab844467600161c6a5c.mockapi.io/api/days

## Json
[
   {
      "id":1,
      "label":"Monday"
   },
   {
      "id":2,
      "label":"Tuesday"
   },
   {
      "id":3,
      "label":"Wednesday"
   },
   {
      "id":4,
      "label":"Thurday"
   },
   {
      "id":5,
      "label":"Friday"
   },
   {
      "id":6,
      "label":"Saturday"
   },
   {
      "id":7,
      "label":"Sunday"
   }
]

## Dependencies

    implementation "com.squareup.okhttp3:okhttp:3.12.3"

    implementation "com.squareup.retrofit2:retrofit:2.5.0"
    implementation "com.squareup.retrofit2:adapter-rxjava2:2.5.0"
    implementation "com.squareup.retrofit2:converter-moshi:2.5.0"

    implementation "com.squareup.moshi:moshi:1.9.2"
    kapt "com.squareup.moshi:moshi-kotlin-codegen:1.8.0"
    
    
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
    implementation 'io.reactivex.rxjava2:rxkotlin:2.3.0'
