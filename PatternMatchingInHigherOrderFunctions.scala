//#Patterns: Custom_Scala_PatternMatchingInHigherOrderFunctions
package docs.tests

object Test{

  //#Warn: Custom_Scala_PatternMatchingInHigherOrderFunctions
  list.map { item =>
    item match {
        case "" =>
      case Some(x) => x
      case None => default
    }
  }

}