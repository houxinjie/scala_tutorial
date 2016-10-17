import scala.io.Source
object Test{
    def main(args: Array[String]){
        println("文件内容为：")
        val context = Source.fromFile("test.txt")


        for(line <- context.getLines()){
            println(line)
        }

    }
}
