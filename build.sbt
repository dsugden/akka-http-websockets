//import com.github.retronym.SbtOneJar
//import io.gatling.sbt.GatlingPlugin
import sbt.Keys._
import sbt.dsl._



lazy val root = project.in(file(".")).settings(
  name := "akka-http-websockets",
    version := "1.0",
  scalaVersion := "2.11.6",
//  artifact in oneJar <<= moduleName(Artifact(_)),
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-RC2",
    "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-RC2",
    "com.typesafe.play" %% "play-json" % "2.3.4"
  )
).enablePlugins(JavaServerAppPackaging)

//lazy val gatling = project.in(file("gatling")).settings(
//  name := "gatling",
//  version := "1.0",
//  scalaVersion := "2.11.6",
//  resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
//  scalaSource in Gatling := baseDirectory.value / "gatling/src/test/scala",
////  target in Gatling := baseDirectory.value / "gatling/target",  // TODO ??
//  libraryDependencies ++= Seq(
//    "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.0-SNAPSHOT" % "test",
//    "io.gatling" % "gatling-test-framework" % "2.2.0-SNAPSHOT" % "test"
//  )).enablePlugins(GatlingPlugin)




