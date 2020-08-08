ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "com.example"

lazy val root = (project in file("."))

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused",
  "-Ywarn-unused:imports",
  "-Ywarn-value-discard"
)
