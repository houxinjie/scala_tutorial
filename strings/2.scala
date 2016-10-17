object Test{
    def main(args: Array[String]){
        val buf = new StringBuilder;
        buf += 'a'
        buf ++= "bcdef"
        println("buf is : " + buf.toString);
    }
}
