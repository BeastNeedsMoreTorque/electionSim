name := "election_sim2"

version := "1.0"

scalaVersion := "2.11.12"//"2.11.8"

lazy val root = (project in file(".")).enablePlugins(SbtWeb)

includeFilter in (Assets, LessKeys.less) := "main.less"

val uwResolver = "CS-OAT@cs.uwaterloo.ca" at "https://cs.uwaterloo.ca/~cs-oat/maven/"

val enumeratumVersion = "1.4.9"

resolvers += Resolver.sonatypeRepo("releases")

resolvers += uwResolver

unmanagedBase := baseDirectory.value / "lib"


libraryDependencies ++= Seq(
  "com.lihaoyi" %% "utest" % "0.4.3" % "test",
  "com.lihaoyi" %% "scalatags" % "0.5.5",
  "com.lihaoyi" %% "upickle" % "0.4.1",
//  "ca.bwbecker" %% "bwblib_2.12" % "1.6-SNAPSHOT",//"1.2",
  "com.beachape" %% "enumeratum" % enumeratumVersion,
  "com.beachape" %% "enumeratum-upickle" % enumeratumVersion,
  "com.github.scopt" %% "scopt" % "3.5.0"

)


testFrameworks += new TestFramework("utest.runner.Framework")

scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked", "-language:reflectiveCalls")
