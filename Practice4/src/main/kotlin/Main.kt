fun main(args: Array<String>) {
    //1 номер
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " "+ lastName);
    }
    printFullName("Дана", "Киздермишова");
    /////
//2 номер
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " "+ lastName);
    }
    val firstName="Дана";
    val lastName="Киздермишова";
    printFullName(firstName,lastName);
    /////
//3 номер
    fun calculateFullName(firstName:String, lastName:String):String{
        return "${firstName} ${lastName}";
    }
    val name=calculateFullName("Дана", "Киздермишова");
    /////
//4 номер
    fun calculateFullNameAndLength(firstName:String, lastName:String):Pair<String, Int>{
        val fullName="${firstName} ${lastName}";
        return Pair(fullName,fullName.length-1);
    }
    val firstName="Дана";
    val lastName="Киздермишова";
    println(calculateFullNameAndLength(firstName,lastName));
    /////
//5 номер
    fun simpleNumber(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..n - 1) {
            if (n % i == 0) return false
        }
        return true
    }
    println(simpleNumber(3));
    //////
//6 номер
    fun fibonacci(n:Int):Int{
        var fib1=1;
        var fib2=1;
        for (i in 3..n)
        {
            var sum=fib1+fib2;
            fib1=fib2;
            fib2=sum;
        }
        return fib2;
    }
    println(fibonacci(7));
/////

}