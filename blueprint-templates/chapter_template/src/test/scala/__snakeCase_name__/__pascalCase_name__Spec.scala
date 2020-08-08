package com.example.{{lowerDotCase name}}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.diagrams.Diagrams
class {{pascalCase name}}Spec extends AnyFlatSpec with Matchers with Diagrams {
  val runner = new {{pascalCase name}}()
  "this package" should "pass to execute" in {
    runner.run()
  }
}
