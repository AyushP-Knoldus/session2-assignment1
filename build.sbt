ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "session2-assignment1",
    idePackagePrefix := Some("com.knoldus")
  )
