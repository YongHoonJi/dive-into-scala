object test_intellij {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(50); 
  val wc = new PageReader();System.out.println("""wc  : PageReader = """ + $show(wc ));$skip(43); val res$0 = 
  wc.readFile("F:\\TEMP\\scala\\test.txt");System.out.println("""res0: Option[Iterator[String]] = """ + $show(res$0))}
}
