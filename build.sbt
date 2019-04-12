import sbt.file

name in ThisBuild := "Banker Scala"
version := "0.1"
scalaVersion := "2.12.8"

val `banker-scala` = project in file(".")