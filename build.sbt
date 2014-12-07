scalaVersion := "2.11.5-typelevel"

name := "Scala eXchange 2014"

initialCommands in console := """""" // TODO

scalacOptions ++= Seq( "-Xexperimental")

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.0.0"
)
