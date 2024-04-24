name := "playland"
organization := "com.maly"
version := "1.0"
scalaVersion := "2.13.13"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.playframework" %% "play-json" % "3.0.2"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
