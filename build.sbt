name := """play-java-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  javaJpa,
  "org.mockito" % "mockito-core" % "2.1.0",
  "com.actimust"% "play-spring-loader" % "1.0-SNAPSHOT",
  "org.hibernate" % "hibernate-core" % "5.2.5.Final",

  // Must be >=4.3.5 due to https://jira.spring.io/browse/SPR-15005
  "org.springframework" % "spring-context" % "4.3.5.RELEASE"
)
