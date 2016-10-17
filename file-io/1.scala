import java.io._

object Test{
    def main(args: Array[String]){
        val writer = new PrintWriter(new File("test.txt"))
        writer.write("菜鸟教程")
        writer.close();
    }
}
