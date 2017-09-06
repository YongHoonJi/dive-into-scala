object test_intellij {
  val wc = new PageReader()                       //> wc  : PageReader = PageReader@3b6eb2ec
  wc.readFile("F:\\TEMP\\scala\\test.txt")        //> F:\TEMP\scala\test.txt
                                                  //| res0: Option[Iterator[String]] = Some(non-empty iterator)
}