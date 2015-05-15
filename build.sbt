import io.gatling.sbt.GatlingPlugin


name := "akka-http-websockets"

version := "1.0"

scalaVersion := "2.11.6"


enablePlugins(GatlingPlugin)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-RC2",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-RC2",
  "com.typesafe.play" %% "play-json" % "2.3.4",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.0-SNAPSHOT" % "it,test",
  "io.gatling" % "gatling-test-framework" % "2.2.0-SNAPSHOT" % "it,test"
)
    