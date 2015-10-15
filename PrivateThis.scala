//#Patterns: Custom_Scala_EnforceMinimumVisibility
package docs.tests

import docs.tests

class Foo(foo: tests.Foo) {
    self =>

  private[this] val selfAccessible: tests.Foo = foo

  //#Warn: Custom_Scala_EnforceMinimumVisibility
  private val typeAccesible: tests.Foo = foo

  //#Warn: Custom_Scala_EnforceMinimumVisibility
  private class OpenClass(openness: Int)

  //#Warn: Custom_Scala_EnforceMinimumVisibility
  private object OpenObject { self =>

    //#Warn: Custom_Scala_EnforceMinimumVisibility
    private def openness(diameter: Long) = {
      Math.pow(diameter, diameter)
    }
  }

}
