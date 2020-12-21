package cl.lina.desafiokotlin
/*
[X] 1. Crear el proyecto Kotlin correctamente.
[X] 2. Crear archivo “Main.kt” con la función main.
 */

// 3. Imprimir “Mi nombre es: {Nombre del alumno}.
 fun main() {
    println("item 3 ; Mi nombre es: Paulina Ruiz Abarca")
    getSuma()
    getsumCaracter()
    getVarByteShort()
    getVarIntLong()
    getBoolean()
    imprimiendoParametros(pa = "Desafio", pb = "Latam")
    getObtieneIVA()
}
// 4. Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
 fun getSuma(){
    var A= 10
    var B= 20
    var C= 30
    var resultado = A + B + C
//  5. Imprimir la suma de las 3 variables.
    println("item 5; La suma de: $A + $B + $C = $resultado")
}

fun getsumCaracter() {
//6. Declarar 1 variable String y otra variable Char.
    val nombre: String
    var vocal: Char

// 7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char
    nombre = "Arataka Reigen"
    vocal = 'A'

//  8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto.
    val template = "item 8; La palabra tiene ${nombre.count()} caracteres"
    println(template)
    vocal = 'O'
}
// 9. Declarar una variable de tipo Float de forma explícita.
// 10. Asignar un valor a la variable Float.
    var flotante = 15F

    fun getVarByteShort() {
//11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
    val byteMaximo = Byte.MAX_VALUE
    val shortMaximo = Short.MAX_VALUE
    println("valor maximo para variable Byte es: $byteMaximo")
    println("valor maximo para variable Short es: $shortMaximo")
}

    fun getVarIntLong() {
//12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
    val intMinimo = Int.MIN_VALUE
    val longMinimo = Long.MIN_VALUE
    println("valor minimo para variable Int es: $intMinimo")
    println("valor minimo para variable Long es: $longMinimo")
}

    fun getBoolean() {
//13. Declarar una variable Boolean con true o false e imprimir su valor.
    val x = true
    val ry = Boolean
    println("Variable Boolean: $x")
}

// 14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este imprime el total de caracteres de los dos parámetros
    fun imprimiendoParametros(pa:String,pb:String) {
    val resultado = pa.length + pb.length
    val stringParametros =  ("La suma de los parametros: ${pa.length} + ${pb.length} = $resultado")
    println(stringParametros)
}

// 15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
    fun getObtieneIVA(){
    val iva = 1.19F
    val valor = 1500
    val resultado = valor*iva
    println("producto iva: $resultado")

}