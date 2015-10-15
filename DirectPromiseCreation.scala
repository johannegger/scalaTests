//#Patterns: Custom_Scala_DirectPromiseCreation
package docs.tests

object Foo{

    //#Warn: Custom_Scala_DirectPromiseCreation
    val promise = Promise[Int]()

    //#Warn: Custom_Scala_DirectPromiseCreation
    val nothing = Promise.apply()

    //#Warn: Custom_Scala_DirectPromiseCreation
    val failed = Promise.failed(???)

    //#Warn: Custom_Scala_DirectPromiseCreation
    val success = Promise.successful(???)

    //#Warn: Custom_Scala_DirectPromiseCreation
    val fromTry = Promise.fromTry(???)
    
}