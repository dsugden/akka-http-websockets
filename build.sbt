name := "akka-http-websockets"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-RC2",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-RC2",
  "com.typesafe.play" %% "play-json" % "2.3.4"
)
    