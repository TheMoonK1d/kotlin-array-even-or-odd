fun main() {
   val arr = arrayOf<Int>(5,7,2,4,9)

    var even  = 0
    var odd = 0

    for (i in arr.withIndex()){
        if (arr[i.index]%2 == 0){
            even++
        }else{
            odd++
        }

    }
    println("Amount of even numbers: $even")
    println("Amount of odd numbers: $odd")
}