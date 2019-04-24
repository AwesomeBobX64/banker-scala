import sbt.file

ThisBuild / name         := "Banker Scala"
ThisBuild / version      := "0.1"
ThisBuild / scalaVersion := "2.12.8"

val `banker-scala` = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
    )
  )

