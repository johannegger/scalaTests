//#Patterns: Custom_Scala_ElseIf
package docs.tests

class ElseIf {

  //#Warn: Custom_Scala_ElseIf
  if(true) ""
  else if(false){
    //#Warn: Custom_Scala_ElseIf
    if(true) ""
    else if(false) ""
    else ""
  }
  else ""

}