name := "spark-test"

version := "0.1"

scalaVersion := "2.12.8"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core

val sparkVersion = "2.4.0"
val scalaVer = "2.12.8"
// https://mvnrepository.com/artifact/org.scala-sbt/compiler-bridge

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.scala-lang" % "scala-library" % scalaVer

)