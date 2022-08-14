package com.example.dsa

fun main() {


    val numbers = listOf(1 , 2 , 3 , 4 , 5 , 0 , 0 , 2 , 3)
    println(numbers)
    val set = setOf(1,2,3,4,5,5,6,7)

    println(set)

    val hashMap = hashMapOf("ram" to 1)
    hashMap["ram"] = 3
    println(hashMap)
    val sortedNumbers = numbers.sorted()
    println(sortedNumbers)
    val setOfNumbers = sortedNumbers.toSet()
    println(setOfNumbers)
    val peopleAge = mapOf("nam" to 57 , "name2" to 43)
    println(peopleAge.keys)
    peopleAge.forEach { (println("${it.key} is ${it.value} age ")) }

    println(peopleAge.map {
        ("${it.key} is ${it.value} age ")
    }.joinToString(","))

    val filteredNames = peopleAge.filter { it.key.length < 4 }
    println(filteredNames)


    fun tri(n: Int): Int {
        return n * 3
    }
    println(tri(3))
    //lambda
    val triple: (Int) -> Int = { it * 3 }
    println(triple(3))


    //sort string
    val peopleNames = listOf("zero" , "heroBoy" , "joe" , "anna" , "vishwanath")
    println(peopleNames.sorted())

    //sort string by length
    println(peopleNames.sortedWith { str1: String , str2: String ->
        str1.length - str2.length
    })

    val words = listOf(
        "about" ,
        "acute" ,
        "awesome" ,
        "balloon" ,
        "best" ,
        "brief" ,
        "class" ,
        "coffee" ,
        "creative"
    )

    //print all the words start with a particular letter

    println(words.filter {
        it.startsWith("b" , true)
    })

    println(words.shuffled())

    println(words.filter {
        it.startsWith("b" , true)
    }.shuffled())

    println(words.filter {
        it.startsWith("b" , true)
    }.shuffled().take(2).sorted())

    val cities = listOf(
        "Jeddah" ,
        "Bengaluru" ,
        "Shenzhen" ,
        "Abu Dhabi" ,
        "Mountain View" ,
        "Tripoli" ,
        "Bengaluru" ,
        "Lima" ,
        "Mandalay" ,
        "Tripoli"
    )

   val oneWordCities = cities.toSet().filter { !it.contains( " ") }.sorted()
    println(oneWordCities)


}