import scala.io.Source

class PageReader(){

  val fileEquals = """[A-z]{1}:.+""".r
  val httpEquals = """http://.+""".r

  def readFile(uri: String): Option[Iterator[String]] = uri match {
    case fileEquals() =>
      try {
        Some(Source.fromFile(uri).getLines())
      }
      catch {
        case e: Exception => None
      }

    case httpEquals() =>
      None

    case _ =>
      None
  }
}