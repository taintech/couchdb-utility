name := """couchdb-utility"""

version := "0.1"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.apache.httpcomponents" % "httpclient" % "4.3.6",
  "commons-io" % "commons-io" % "2.4",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"



fork in run := true