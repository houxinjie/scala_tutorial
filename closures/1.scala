object Test {
    def main(args: Array[String]){
        var factor = 3
        val multiplier = (i:Int) => i * factor
        println("muliplier(1) value = " + multiplier(1))
        println("muliplier(1) value = " + multiplier(2))
    }
}
