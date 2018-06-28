name := """e-diario"""
organization := "com.jtopanotti"

version := "0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.6"
libraryDependencies += javaJdbc
libraryDependencies ++= Seq(
    javaJpa,
    "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final"
)
// https://mvnrepository.com/artifact/org.postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1200-jdbc41"
TwirlKeys.templateImports += "modelos.User"
TwirlKeys.templateImports += "modelos.UserLogin"
TwirlKeys.templateImports += "modelos.InfoAluno"
