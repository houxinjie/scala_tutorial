import scala.util.matching.Regex

object Test{
    def main(args: Array[String]){
        val pattern = new Regex("abl[ae]\\d+")
        val str = "ablaw is able1 and cool"
        println((pattern findAllIn str).mkString(","))
    }
}
