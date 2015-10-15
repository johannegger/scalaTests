//#Patterns: Custom_Scala_DefaultPatternMatching
package docs.tests

case class ClassEx(a: Int, b: Int) extends Exception

class NoDefaultPatternMatching {

  val something = new Exception

  //OK
  something match {
    case a if true =>
    case b if false =>
    case _ =>
  }

  //OK
  something match {
    case a if true =>
    case b if false =>
    case e =>
  }

  // FAIL
  //#Warn: Custom_Scala_DefaultPatternMatching
  something match {
    case _ if true =>
    case a if false =>
  }

  // FAIL
  //#Warn: Custom_Scala_DefaultPatternMatching
  something match {
    case a if true =>
  }

  // FAIL
  //#Warn: Custom_Scala_DefaultPatternMatching
  something match {
    case a if true =>
    case b if false =>
    case ClassEx(a, b) =>
  }

  // FAIL
  //#Warn: Custom_Scala_DefaultPatternMatching
  something match {
    case a if true =>
    case b if false =>
    case e: ClassEx =>
  }

  //OK
  Seq().foldLeft(10) {
    case (offset, _) if offset > 10 => offset
    case (offset, _) => offset + 1
  }

}

