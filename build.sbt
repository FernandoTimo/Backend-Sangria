name := "backend-sangria"
version := "0.0.1"
description := "Base de código para Sangria"
scalaVersion := "2.13.5"
scalaOptions ++= Seq("--deprecation-", "-feature")
val akkaVersion = "2.6.10"
val circeVersion = "0.13.0"
val sangriaVersion = "2.0.1"

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % sangriaVersion,
  "org.sangria-graphql" %% "sangria-slowlog" % sangriaVersion,
  "org.sangria-graphql" %% "sangria-circe" % "1.3.1",

  "com.typesafe.akka" %% "akka-http" % "10.2.1",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.35.0",

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-optics" % circeVersion,

  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

Resolver.settings
enablePlugins(JavaAppPackaging)