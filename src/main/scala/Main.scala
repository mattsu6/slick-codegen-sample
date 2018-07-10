object Main {

  def main(args: Array[String]): Unit = {

    val uri = getClass.getClassLoader.getResource("codegen.conf")
    println(uri)
    slick.codegen.SourceCodeGenerator.main(Array(uri.toString + "#codegen.test_db")
    )
  }
}
