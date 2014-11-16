name := "thatsqt"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.2" // or "2.10.4"

libraryDependencies ++= Seq(
  // Select Play modules
  jdbc,      // The JDBC connection pool and the play.api.db API
  //anorm,     // Scala RDBMS Library
  javaJdbc,  // Java database API
  javaEbean, // Java Ebean plugin
  javaJpa,   // Java JPA plugin
  filters,   // A set of built-in filters
  javaCore,  // The core Java API
  // WebJars pull in client-side web librarie
  "org.webjars" %% "webjars-play" % "2.3.0",
  "com.typesafe.play" %% "play-slick" % "0.8.0",
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
  "mysql" % "mysql-connector-java" % "5.1.27"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayJava)

EclipseKeys.withSource := true