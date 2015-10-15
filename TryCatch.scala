//#Patterns: Custom_Scala_UtilTryForTryCatch
package docs.tests

class TryCatch {
    //#Warn: Custom_Scala_UtilTryForTryCatch
    try{
       ""
    }
    catch{
        case e => ""
    }

    //#Warn: Custom_Scala_UtilTryForTryCatch
    try(throw new Exception(""))
    catch{ case NonFatal(e) => "" }

}