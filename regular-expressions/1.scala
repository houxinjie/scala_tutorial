import scala.util.matching.Regex

object Test{
    def main(args: Array[String]){
        val pattern = "Scala".r
        var str = "Scala is Scalable and cool"
        println(pattern findFirstIn str)
    }
}
